package com.project.alternateRealityGame.Repository;

import com.project.alternateRealityGame.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
