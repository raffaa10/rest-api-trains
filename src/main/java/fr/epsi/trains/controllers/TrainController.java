package fr.epsi.trains.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class TrainController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello";
    }

}
