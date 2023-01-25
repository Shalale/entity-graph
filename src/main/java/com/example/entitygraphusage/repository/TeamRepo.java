package com.example.entitygraphusage.repository;

import com.example.entitygraphusage.model.Player;
import com.example.entitygraphusage.model.Team;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepo extends JpaRepository<Team, Long> {
    @Query("SELECT t FROM Team t JOIN FETCH t.players WHERE t.name=:name ")
    Team findTeamByName(String name);

    @EntityGraph(type = EntityGraph.EntityGraphType.FETCH, attributePaths = "players")
    Team findTeamById(Long id);
}
