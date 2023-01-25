package com.example.entitygraphusage.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TeamLieder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "teamLieder")
    private Team team;
}
