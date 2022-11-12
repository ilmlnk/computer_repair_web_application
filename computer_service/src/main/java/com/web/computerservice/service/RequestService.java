package com.web.computerservice.service;

import com.web.computerservice.model.Request;


public interface RequestService {
    Request findRequestById(Long id); // find request by id

    Iterable<Request> findAllRequestsById(Iterable<Long> ids); // find all requests by id

    Iterable<Request> findAllRequests();

    void saveRequest(Request request); // save request

    Iterable<Request> saveAllRequests(Iterable<Request> requests); // save all requests

    void updateRequest(Request request); // update request

    void delete(Request request); // delete request by inserting entity

    void deleteRequestById(Long id); // delete request by id

    void deleteAllRequestsById(Iterable<Long> ids); // delete all requests by ids

    void deleteAllRequests(); // delete all requests

    void deleteAllRequests(Iterable<Request> requests); // delete all requests which indicated in Iterable
}
