package com.web.computerservice.controller;

import com.web.computerservice.model.Request;
import com.web.computerservice.repo.RequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class RequestController {
    private static final int DAY = 86_400;              // in seconds
    private static final Logger logger = LoggerFactory.getLogger(RequestController.class);

    private final RequestRepository requestRepository;

    public RequestController(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @RequestMapping(value = "/computer_service")                                // home page
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/new_request")
    public String showForm(@Valid Request request, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "new-user";
        }
        requestRepository.save(request);
        return "redirect:/index";
    }
}
