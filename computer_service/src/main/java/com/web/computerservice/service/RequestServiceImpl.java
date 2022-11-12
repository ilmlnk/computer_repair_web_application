package com.web.computerservice.service;

import com.web.computerservice.model.Request;
import com.web.computerservice.repo.RequestRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("requestService")
@Transactional
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;

    public RequestServiceImpl(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }
    @Override
    public Request findRequestById(Long id) {
        return requestRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Request> findAllRequestsById(Iterable<Long> ids) {
        return requestRepository.findAllById(ids);
    }

    @Override
    public Iterable<Request> findAllRequests() {
        return requestRepository.findAll();
    }

    @Override
    public void saveRequest(Request request) {
        requestRepository.save(request);
    }

    @Override
    public Iterable<Request> saveAllRequests(Iterable<Request> requests) {
        return requestRepository.saveAll(requests);
    }

    @Override
    public void updateRequest(Request request) {
        saveRequest(request);
    }

    @Override
    public void delete(Request request) {
        requestRepository.delete(request);
    }

    @Override
    public void deleteRequestById(Long id) {
        requestRepository.deleteById(id);
    }

    @Override
    public void deleteAllRequestsById(Iterable<Long> ids) {
        requestRepository.deleteAllById(ids);
    }

    @Override
    public void deleteAllRequests() {
        requestRepository.deleteAll();
    }

    @Override
    public void deleteAllRequests(Iterable<Request> requests) {
        requestRepository.deleteAll(requests);
    }
}
