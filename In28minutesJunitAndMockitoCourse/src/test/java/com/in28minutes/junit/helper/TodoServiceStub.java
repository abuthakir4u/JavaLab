package com.in28minutes.junit.helper;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Java");
    }

    @Override
    public void deleteTodo(String todo) {

    }
}
