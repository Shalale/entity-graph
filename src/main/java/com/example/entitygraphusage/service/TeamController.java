package com.example.entitygraphusage.service;

import com.example.entitygraphusage.model.Team;
import com.example.entitygraphusage.repository.PlayerRepo;
import com.example.entitygraphusage.repository.TeamLiederRepo;
import com.example.entitygraphusage.repository.TeamRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class TeamController {
    private final TeamLiederRepo teamLiederRepo;
    private final PlayerRepo playerRepo;
    private final TeamRepo teamRepo;

    @PostConstruct
    public void getTeamMembers(){
        Team team = teamRepo.findTeamByName("Team1");
        team.getPlayers().forEach(player -> System.out.println(player.getId()));

        Team team1 = teamRepo.findTeamById(1L);
        team1.getPlayers().forEach(player -> System.out.println(player.getId()));
    }
}
