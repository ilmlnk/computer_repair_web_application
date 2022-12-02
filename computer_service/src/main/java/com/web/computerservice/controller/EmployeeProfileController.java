package com.web.computerservice.controller;

import com.web.computerservice.model.ClientRequest;
import com.web.computerservice.service.ClientRequestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/computer_service")
public class EmployeeProfileController {

    private ClientRequestService clientRequestService;

    public EmployeeProfileController(ClientRequestService clientRequestService) {
        this.clientRequestService = clientRequestService;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String showRequestsTable(Model model) {
        List<ClientRequest> clientRequests = (List<ClientRequest>) clientRequestService.findAllRequests();
        model.addAttribute("clientRequests", clientRequests);
        return "employee";
    }
}
