package com.dailycodebuffer.graphqldemo.controller;

import com.dailycodebuffer.graphqldemo.model.Author;
import com.dailycodebuffer.graphqldemo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class AuthorController {

    @Autowired
    private  AuthorService authorService;


    @QueryMapping
    public List<Author> findAllBooks() {
        return authorService.findAll();
    }

    @QueryMapping
    public Optional<Author> findOneBook(@Argument String id) {
        return authorService.findOne(id);
    }

    //test1
    // test2
    //mainorigin1
    // mainorigin2

    // main remote update 3
    // main remote update 4
}
