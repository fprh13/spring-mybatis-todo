package com.example.todo.service;

import com.example.todo.mapper.TodoMapper;
import com.example.todo.vo.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoMapper todoMapper;

    public TodoService(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    public void addTodo(Todo todo) {
        todo.setIsCompleted("N");
        todoMapper.save(todo);

    }

    public List<Todo> getTodoList() {
        return todoMapper.findAll();
    }

    public void deleteTodo(int id) {

    }
}
