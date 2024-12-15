package dev.hylansilva.meetinghub_api.models.repositories;

import dev.hylansilva.meetinghub_api.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByName(String name);
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
    boolean existsByName(String name);

}
