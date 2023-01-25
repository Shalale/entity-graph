package com.example.entitygraphusage.repository;

import com.example.entitygraphusage.model.Player;
import com.example.entitygraphusage.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepo extends JpaRepository<Player, Long> {

}
