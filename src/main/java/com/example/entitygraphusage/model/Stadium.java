package com.example.entitygraphusage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Stadium {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "stadiums")
    private List<Team> teams;
}
