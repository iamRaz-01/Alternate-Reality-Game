package com.project.alternateRealityGame.Repository;

import com.project.alternateRealityGame.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
