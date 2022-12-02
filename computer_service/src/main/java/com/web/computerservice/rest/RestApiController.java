package com.web.computerservice.controller;

import com.web.computerservice.exceptions.ErrorDto;
import com.web.computerservice.model.ClientRequest;
import com.web.computerservice.service.ClientRequestService;
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

    public final ClientRequestService clientRequestService;

    public RestApiController(ClientRequestService clientRequestService) {
        this.clientRequestService = clientRequestService;
    }

    @RequestMapping(value = "/request/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getRequest(@PathVariable("id") long id) {
        logger.info("Fetching ClientRequest with id {}", id);
        ClientRequest clientRequest = clientRequestService.findRequestById(id);

        if (clientRequest == null) {
            logger.error("Cannot find ClientRequest with id {}", id);
            return new ResponseEntity<>(new ErrorDto("Cannot find ClientRequest with id: " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(clientRequest, HttpStatus.OK);
    }

    @RequestMapping(value = "/request/", method = RequestMethod.GET)
    public ResponseEntity<?> createRequest(@RequestBody ClientRequest clientRequest, UriComponentsBuilder ucBuilder) {
        logger.info("Creating new ClientRequest {}", clientRequest);
        clientRequestService.saveRequest(clientRequest);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/clientRequest/{id}").buildAndExpand(clientRequest.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/request/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateRequest(@PathVariable("id") long id, @RequestBody ClientRequest clientRequest) {
        logger.info("Updating ClientRequest with id {}", id);

        ClientRequest currentClientRequest = clientRequestService.findRequestById(id);
        if (currentClientRequest == null) {
            logger.error("Unable to update. ClientRequest with id {} was not found.", id);
            return new ResponseEntity<>(new ErrorDto(
                    "Unable to update. ClientRequest with id " + id + " was not found."), HttpStatus.NOT_FOUND);
        }

        currentClientRequest.setName(clientRequest.getName());
        currentClientRequest.setSurname(clientRequest.getSurname());
        currentClientRequest.setPhoneNumber(clientRequest.getPhoneNumber());
        currentClientRequest.setRequestDate(clientRequest.getRequestDate());
        currentClientRequest.setRequestTime(clientRequest.getRequestTime());

        clientRequestService.updateRequest(currentClientRequest);

        return new ResponseEntity<>(currentClientRequest, HttpStatus.OK);
    }

    @RequestMapping(value = "/request/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteRequest(@PathVariable("id") long id) {
        logger.info("Deleting ClientRequest with id {}", id);

        ClientRequest clientRequest = clientRequestService.findRequestById(id);
        if (clientRequest == null) {
            logger.info("Unable to delete ClientRequest. ClientRequest with id {} was not found.", id);
            return new ResponseEntity<>(
                    new ErrorDto("Unable to delete ClientRequest. ClientRequest with id " + id + " was not found."),
                    HttpStatus.NOT_FOUND);
        }
        clientRequestService.deleteRequestById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/request/", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteAllRequests() {
        logger.info("Deleting all Requests.");
        clientRequestService.deleteAllRequests();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
