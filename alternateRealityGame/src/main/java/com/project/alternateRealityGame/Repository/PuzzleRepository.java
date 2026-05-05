package com.project.alternateRealityGame.Repository;

import com.project.alternateRealityGame.Entity.Puzzle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PuzzleRepository extends JpaRepository<Puzzle, Long> {

}
