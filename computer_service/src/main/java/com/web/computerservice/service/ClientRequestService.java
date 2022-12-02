package com.web.computerservice.service;

import com.web.computerservice.model.ClientRequest;
import org.springframework.stereotype.Service;

@Service
public interface ClientRequestService {
    ClientRequest findRequestById(Long id); // find request by id

    Iterable<ClientRequest> findAllRequestsById(Iterable<Long> ids); // find all requests by id

    Iterable<ClientRequest> findAllRequests();

    ClientRequest findRequestByName(String name); // find request by name

    ClientRequest findRequestBySurname(String surname); // find request by surname

    void saveRequest(ClientRequest clientRequest); // save clientRequest

    Iterable<ClientRequest> saveAllRequests(Iterable<ClientRequest> requests); // save all requests

    void updateRequest(ClientRequest clientRequest); // update clientRequest

    void delete(ClientRequest clientRequest); // delete clientRequest by inserting entity

    void deleteRequestById(Long id); // delete request by id

    void deleteAllRequestsById(Iterable<Long> ids); // delete all requests by ids

    void deleteAllRequests(); // delete all requests

    void deleteAllRequests(Iterable<ClientRequest> requests);

    boolean isRequestExists(ClientRequest clientRequest); // is clientRequest exists
}
