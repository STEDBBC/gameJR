package com.game.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest/players")
public class Controller {
    private JdbcOperations jdbcOperations;

    @GetMapping()
    public ResponseEntity<String> getPlayers() {
        String users = "hello";
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/count")
    public ResponseEntity<Integer> getCount() {
        int users = 10;
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
