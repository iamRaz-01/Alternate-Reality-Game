package com.project.alternateRealityGame.Repository;

import com.project.alternateRealityGame.Entity.UserProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserProgressRepository extends JpaRepository<UserProgress, Long> {


}