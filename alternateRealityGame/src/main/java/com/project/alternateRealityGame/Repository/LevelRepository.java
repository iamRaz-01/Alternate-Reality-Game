package com.project.alternateRealityGame.Repository;

import com.project.alternateRealityGame.Entity.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LevelRepository extends JpaRepository<Level, Long> {

}
