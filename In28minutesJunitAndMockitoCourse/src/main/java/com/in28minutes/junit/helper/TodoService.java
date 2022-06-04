package com.in28minutes.junit.helper;

import java.util.List;

public interface TodoService {
    public List<String> retrieveTodos(String user);

    public void deleteTodo(String todo);
}
