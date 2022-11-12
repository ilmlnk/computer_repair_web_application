package com.web.computerservice.controller;

import com.web.computerservice.exceptions.ErrorDto;
import com.web.computerservice.model.Request;
import com.web.computerservice.service.RequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("/api")
public class RestApiController {

    public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

    public final RequestService requestService;

    public RestApiController(RequestService requestService) {
        this.requestService = requestService;
    }

    @RequestMapping(value = "/request/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getRequest(@PathVariable("id") long id) {
        logger.info("Fetching Request with id {}", id);
        Request request = requestService.findRequestById(id);

        if (request == null) {
            logger.error("Cannot find Request with id {}", id);
            return new ResponseEntity<>(new ErrorDto("Cannot find Request with id: " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(request, HttpStatus.OK);
    }

    @RequestMapping(value = "/request/", method = RequestMethod.GET)
    public ResponseEntity<?> createRequest(@RequestBody Request request, UriComponentsBuilder ucBuilder) {
        logger.info("Creating new Request {}", request);
        requestService.saveRequest(request);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/request/{id}").buildAndExpand(request.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/request/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateRequest(@PathVariable("id") long id, @RequestBody Request request) {
        logger.info("Updating Request with id {}", id);

        Request currentRequest = requestService.findRequestById(id);
        if (currentRequest == null) {
            logger.error("Unable to update. Request with id {} was not found.", id);
            return new ResponseEntity<>(new ErrorDto(
                    "Unable to update. Request with id " + id + " was not found."), HttpStatus.NOT_FOUND);
        }

        currentRequest.setName(request.getName());
        currentRequest.setSurname(request.getSurname());
        currentRequest.setPhoneNumber(request.getPhoneNumber());
        currentRequest.setRequestDate(request.getRequestDate());
        currentRequest.setRequestTime(request.getRequestTime());

        requestService.updateRequest(currentRequest);

        return new ResponseEntity<>(currentRequest, HttpStatus.OK);
    }

    @RequestMapping(value = "/request/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteRequest(@PathVariable("id") long id) {
        logger.info("Deleting Request with id {}", id);

        Request request = requestService.findRequestById(id);
        if (request == null) {
            logger.info("Unable to delete Request. Request with id {} was not found.", id);
            return new ResponseEntity<>(
                    new ErrorDto("Unable to delete Request. Request with id " + id + " was not found."),
                    HttpStatus.NOT_FOUND);
        }
        requestService.deleteRequestById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/request/", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteAllRequests() {
        logger.info("Deleting all Requests.");
        requestService.deleteAllRequests();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
