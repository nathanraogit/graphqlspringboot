package com.dailycodebuffer.graphqldemo.controller;

import com.dailycodebuffer.graphqldemo.model.Author;
import com.dailycodebuffer.graphqldemo.model.Player;
import com.dailycodebuffer.graphqldemo.model.SortingOrder;
import com.dailycodebuffer.graphqldemo.model.Team;
import com.dailycodebuffer.graphqldemo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.SortDefinition;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class PlayerController {

    @Autowired
    private  PlayerService playerService;


    @QueryMapping
    public List<Player> findAll() {
        return playerService.findAll();
    }

    @QueryMapping
    public List<Player> findAll2(@Argument int limit) {

            return playerService.findAll2(limit);

    }



    @QueryMapping
    public Optional<Player> findOne(@Argument Integer id) {
        return playerService.findOne(id);
    }

    @MutationMapping
    public Player create(@Argument String name, @Argument Team team) {
        return playerService.create(name,team);
    }

    @MutationMapping
    public Player update(@Argument Integer id, @Argument String name, @Argument Team team) {
        return playerService.update(id,name,team);
    }

    @MutationMapping
    public Player delete(@Argument Integer id) {
        return playerService.delete(id);
    }



}
