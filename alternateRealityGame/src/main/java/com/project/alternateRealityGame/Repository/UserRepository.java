package com.project.alternateRealityGame.Repository;

import com.project.alternateRealityGame.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    Optional<Object> findByEmail(String email);

    boolean existsByEmail(String email);
}
