package bene.tesla.restapi.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bene.tesla.restapi.domain.User;
import bene.tesla.restapi.repository.IUserRepository;

@Service
public class UserService {

    @Autowired
    private IUserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
