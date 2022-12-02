package com.web.computerservice.impl;

import com.web.computerservice.model.ClientRequest;
import com.web.computerservice.repo.ClientRequestRepository;
import com.web.computerservice.service.ClientRequestService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("requestService")
@Transactional
public class ClientRequestServiceImpl implements ClientRequestService {

    private final ClientRequestRepository clientRequestRepository;

    public ClientRequestServiceImpl(ClientRequestRepository clientRequestRepository) {
        this.clientRequestRepository = clientRequestRepository;
    }
    @Override
    public ClientRequest findRequestById(Long id) {
        return clientRequestRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<ClientRequest> findAllRequestsById(Iterable<Long> ids) {
        return clientRequestRepository.findAllById(ids);
    }

    @Override
    public Iterable<ClientRequest> findAllRequests() {
        return clientRequestRepository.findAll();
    }

    @Override
    public ClientRequest findRequestByName(String name) {
        return clientRequestRepository.findByName(name);
    }

    @Override
    public ClientRequest findRequestBySurname(String surname) {
        return clientRequestRepository.findBySurname(surname);
    }

    @Override
    public void saveRequest(ClientRequest clientRequest) {
        clientRequestRepository.save(clientRequest);
    }

    @Override
    public Iterable<ClientRequest> saveAllRequests(Iterable<ClientRequest> requests) {
        return clientRequestRepository.saveAll(requests);
    }

    @Override
    public void updateRequest(ClientRequest clientRequest) {
        saveRequest(clientRequest);
    }

    @Override
    public void delete(ClientRequest clientRequest) {
        clientRequestRepository.delete(clientRequest);
    }

    @Override
    public void deleteRequestById(Long id) {
        clientRequestRepository.deleteById(id);
    }

    @Override
    public void deleteAllRequestsById(Iterable<Long> ids) {
        clientRequestRepository.deleteAllById(ids);
    }

    @Override
    public void deleteAllRequests() {
        clientRequestRepository.deleteAll();
    }

    @Override
    public void deleteAllRequests(Iterable<ClientRequest> requests) {
        clientRequestRepository.deleteAll(requests);
    }

    @Override
    public boolean isRequestExists(ClientRequest clientRequest) {
        return findRequestByName(clientRequest.getName()) != null;
    }
}
