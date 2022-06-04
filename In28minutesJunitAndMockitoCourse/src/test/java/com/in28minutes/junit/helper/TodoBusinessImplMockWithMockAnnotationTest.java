package com.in28minutes.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplMockWithMockAnnotationTest {

    @Mock
    TodoService todoServiceMock;

    @InjectMocks
    TodoBusinessImpl todoBusinessImpl;

    @Test
    public void testRetriveTodosRelatedToSpring_usingMock1(){
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Java");
        Mockito.when(todoServiceMock.retrieveTodos("Spring")).thenReturn(todos);

        //TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToString("Spring");
        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void testRetriveTodosRelatedToSpring_usingMock2_EmptyList(){
        List<String> todos = Arrays.asList();
        Mockito.when(todoServiceMock.retrieveTodos("Spring")).thenReturn(todos);

        //TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToString("spring");
        assertEquals(0, filteredTodos.size());
    }
}
