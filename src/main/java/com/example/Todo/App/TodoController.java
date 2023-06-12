package com.example.Todo.App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String HelloWorld() {
        return "To-do Application!";
    }

}
