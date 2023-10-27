package bene.tesla.restapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import bene.tesla.restapi.domain.User;
import bene.tesla.restapi.repository.IUserRepository; 
@Configuration
public class Instantion implements CommandLineRunner {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        User maria = new User(null, "Bernadette", "bernie@gmail.com");
        User alex = new User(null, "Alex", "alex@gmail.com");
        User bob = new User(null, "Bob", "bobsponja@gmail.com");
        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }
}
