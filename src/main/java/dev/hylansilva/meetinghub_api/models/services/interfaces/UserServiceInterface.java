package dev.hylansilva.meetinghub_api.models.services.interfaces;

import dev.hylansilva.meetinghub_api.models.entities.User;

import java.util.Optional;
import java.util.UUID;

public interface UserServiceInterface {
    void Save(User user);
    Optional<User> findById(UUID id);
    Optional<User> findByName(String name);
    Optional<User> findByEmail(String email);
}
