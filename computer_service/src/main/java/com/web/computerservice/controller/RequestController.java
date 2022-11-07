package com.web.computerservice.controller;

import com.web.computerservice.model.Request;
import com.web.computerservice.repo.RequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RequestController {
    private static final int DAY = 86_400;              // in seconds
    private static final Logger logger = LoggerFactory.getLogger(RequestController.class);

    private final RequestRepository requestRepository;

    public RequestController(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @GetMapping(value = "/computer_service")                                // home page
    public String index() {
        logger.info("Webpage was started!");
        return "templates/index";
    }

    @PostMapping(value = "/phone_number_validation")                        // phone number validation
    public String phoneNumberValidation() {

        return "validation";
    }

    @GetMapping("/request")
    public String createNewRequest(Model model) {
        model.addAttribute("request", new Request());
        return "request";
    }

    @PostMapping
    public String submitNewRequest(@ModelAttribute Request request, Model model) {
        model.addAttribute("request", request);
        return "request";
    }


    /*@GetMapping(value = "/")                                                 // creating new request for repairing
    public ResponseEntity<Request> createNewRequest(@RequestBody Request request) {
        Request newRequest = new Request();
        newRequest.setUserName(request.getUserName());
        newRequest.setUserSurname(request.getUserSurname());
        newRequest.setPhoneNumber(request.getPhoneNumber());
        newRequest.setRequestDate(request.getRequestDate());
        newRequest.setRequestTime(request.getRequestTime());
        Request saveRequest = requestRepository.save(newRequest);

        return new ResponseEntity<>(saveRequest, HttpStatus.CREATED);
    }*/

    /*@PostMapping(value = "/")                               // request processing and saving to database
    public String requestProcessing(@Valid Request request, BindingResult bindingResult, RedirectAttributes redirect) {
        if (bindingResult.hasErrors()) {

        }
        redirect.addFlashAttribute("request", request);
        return "ret";
    }*/


    /*@GetMapping(value = "/set-cookie")                     // record cookie
    public ResponseEntity<?> setCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("data", "response");
        cookie.setPath("/");
        cookie.setMaxAge(DAY);
        response.addCookie(cookie);
        response.setContentType("text/plain");      // plug
        return ResponseEntity.ok().body(HttpStatus.OK);
    }

    @GetMapping(value = "/get-cookie")                     // read cookie
    public ResponseEntity<?> readCookie(@CookieValue(value = "data") String data) {
        return ResponseEntity.ok().body(data);
    }*/
}
