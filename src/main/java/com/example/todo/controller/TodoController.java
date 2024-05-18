package com.example.todo.controller;

import com.example.todo.service.TodoService;
import com.example.todo.vo.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/todo")
    @ResponseBody
    public String addTodo(@RequestBody Todo todoParam) {
        Todo todo = new Todo(todoParam.getContent());
        todoService.addTodo(todo);
        return "success";
    }

    @GetMapping("/todo")
    @ResponseBody
    public List<Todo> getTodo() {
        return todoService.getTodoList();
    }
}

