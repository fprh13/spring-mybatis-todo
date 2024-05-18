package com.example.todo.mapper;

import com.example.todo.vo.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TodoMapper {
    void save(@Param("todo") Todo todo);
    List<Todo> findAll();
}
