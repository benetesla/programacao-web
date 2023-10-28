package bene.tesla.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bene.tesla.restapi.domain.User;
import bene.tesla.restapi.dto.UserDTO;
import bene.tesla.restapi.repository.IUserRepository;
import bene.tesla.restapi.service.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private IUserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        User user = repo.findById(id).orElse(null);
        if (user == null) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
    }

    public User insert(User user) {
        return repo.insert(user);
    }
    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }
    public User fromDTO(UserDTO objDTO) {
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }

}