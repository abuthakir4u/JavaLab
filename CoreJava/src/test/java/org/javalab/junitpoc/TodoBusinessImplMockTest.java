package org.javalab.junitpoc;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplMockTest {

    @Test
    public void testRetriveTodosRelatedToSpring_usingMock1(){
        TodoService todoServiceMock = Mockito.mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Java");
        Mockito.when(todoServiceMock.retrieveTodos("Spring")).thenReturn(todos);

        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToString("Spring");
        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void testRetriveTodosRelatedToSpring_usingMock2_EmptyList(){
        TodoService todoServiceMock = Mockito.mock(TodoService.class);
        List<String> todos = Arrays.asList();
        Mockito.when(todoServiceMock.retrieveTodos("Spring")).thenReturn(todos);

        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToString("spring");
        assertEquals(0, filteredTodos.size());
    }
}
