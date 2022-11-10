package com.web.computerservice.service;

import com.web.computerservice.model.Request;
import com.web.computerservice.repo.RequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {
    private final RequestRepository requestRepository;

    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public Request saveRequest(Request userRequest) {
        Request request = new Request();
        request.setName(userRequest.getName());
        request.setSurname(userRequest.getSurname());
        request.setPhoneNumber(userRequest.getPhoneNumber());
        request.setRequestDate(userRequest.getRequestDate());
        request.setRequestTime(userRequest.getRequestTime());
        return requestRepository.save(request);
    }

    public List<Request> findAllRequests() {
        return requestRepository.findAll();
    }

    public List<Request> findAllRequestsById(Iterable<Long> ids) {
        return requestRepository.findAllById(ids);
    }

    public Request getRequestReferenceById(Long id) {
        return requestRepository.getReferenceById(id);
    }


}
