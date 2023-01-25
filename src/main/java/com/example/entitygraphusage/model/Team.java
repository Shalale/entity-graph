package com.example.entitygraphusage.model;

import lombok.Data;
import org.springframework.data.jpa.repository.EntityGraph;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
//@EntityGraph()
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(
            cascade = CascadeType.PERSIST,
            mappedBy = "team",
            fetch = FetchType.EAGER)
    private List<Player> players;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "team_lieder_id", referencedColumnName = "id")
    private TeamLieder teamLieder;

    @ManyToMany
    @JoinTable(
            name = "team_stadiums",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "stadium_id")
    )
    private List<Stadium> stadiums;
}
