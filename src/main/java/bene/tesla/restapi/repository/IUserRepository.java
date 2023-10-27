package bene.tesla.restapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import bene.tesla.restapi.domain.User;


@Repository
public interface IUserRepository extends MongoRepository<User, String> {

}