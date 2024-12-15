package dev.hylansilva.meetinghub_api.models.services;

import dev.hylansilva.meetinghub_api.models.entities.User;
import dev.hylansilva.meetinghub_api.models.repositories.UserRepository;
import dev.hylansilva.meetinghub_api.models.services.interfaces.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.UUID;

public class UserService implements UserServiceInterface {

    @Autowired
    UserRepository userRepository;

    @Autowired
    User user;

    @Override
    public void Save(UserDTO userDTO){

         var userInternal = new user();

        userRepository.save(userInternal);
    }

    @Override
    public Optional<User> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }
}
