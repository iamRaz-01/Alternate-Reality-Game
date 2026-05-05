package com.project.alternateRealityGame.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "levels")
@Data
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long gameId;
    private String title;
    private String description;
    private String type;
    private Long nextLevelId;

    @ManyToOne
    @JoinColumn(name = "gameId", insertable = false, updatable = false)
    private Game game;

    @OneToMany(mappedBy = "level")
    private List<Puzzle> puzzles;
}