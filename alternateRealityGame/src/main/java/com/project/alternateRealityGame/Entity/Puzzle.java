package com.project.alternateRealityGame.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "puzzles")
@Data
public class Puzzle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long gameId;
    private Long levelId;
    private String question;
    private String answer;
    private String type;
    private int points;

    @ManyToOne
    @JoinColumn(name = "levelId", insertable = false, updatable = false)
    private Level level;
}
