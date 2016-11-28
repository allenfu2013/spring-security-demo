package org.allen.springsecurity.server.repository;

import org.allen.springsecurity.server.model.ClientDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDetailRepository {

    public ClientDetail findByClientId(String clientId) {
        // TODO
        return null;
    }

    public ClientDetail save(ClientDetail clientDetail) {
        // TODO
        return clientDetail;
    }

    public void delete(ClientDetail clientDetail) {
        //TODO
    }

    public List<ClientDetail> findAll() {
        // TODO
        return null;
    }

    public void deleteAll() {
        // TODO
    }
}
