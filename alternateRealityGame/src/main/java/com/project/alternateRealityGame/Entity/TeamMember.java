package com.project.alternateRealityGame.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "team_members")
@Data
public class TeamMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long teamId;
    private Long userId;
    private String role;

    @ManyToOne
    @JoinColumn(name = "teamId", insertable = false, updatable = false)
    private Team team;
}
