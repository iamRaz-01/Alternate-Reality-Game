package com.project.alternateRealityGame.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "teams")
@Data
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long gameId;
    private Long createdBy;
    private Long levelId;
    private int score;
    private int completedLevel;
    private String status;

    @ManyToOne
    @JoinColumn(name = "gameId", insertable = false, updatable = false)
    private Game game;

    @OneToMany(mappedBy = "team")
    private List<TeamMember> members;
}