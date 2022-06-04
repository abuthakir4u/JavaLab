package com.in28minutes.junit.helper;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void testRetriveTodosRelatedToSpring_usingStub(){
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToString("spring");
        assertEquals(2, filteredTodos.size());
    }
}
