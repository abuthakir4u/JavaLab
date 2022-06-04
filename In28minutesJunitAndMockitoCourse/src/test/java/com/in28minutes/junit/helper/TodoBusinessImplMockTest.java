package com.in28minutes.junit.helper;

//import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

public class TodoBusinessImplMockTest {

    @Test
    public void testRetriveTodosRelatedToSpring_usingMock1(){
        TodoService todoServiceMock = Mockito.mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Java");
        Mockito.when(todoServiceMock.retrieveTodos("Spring")).thenReturn(todos);
        //BDDMockito.given(todoServiceMock.retrieveTodos("Spring")).willReturn(todos);

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

    @Test
    public void testRetriveTodosRelatedToSpring_usingMockBDD(){
        TodoService todoServiceMock = Mockito.mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Java");
        BDDMockito.given(todoServiceMock.retrieveTodos("Spring")).willReturn(todos);

        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToString("Spring");
        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void testDeleteTodosNotRelatedToSpring_usingMockBDD(){
        TodoService todoServiceMock = Mockito.mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Java");
        BDDMockito.given(todoServiceMock.retrieveTodos("Spring")).willReturn(todos);

        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

        todoBusinessImpl.deleteTodosNotRelatedToString("Spring");

        //This will verify is the deleteTodo method called with "Learn Java" as parameter
        verify(todoServiceMock).deleteTodo("Learn Java");
        //BDD style syntax of above line
        then(todoServiceMock).should().deleteTodo("Learn Java");


        verify(todoServiceMock, times(1)).deleteTodo("Learn Java");
        verify(todoServiceMock, atLeastOnce()).deleteTodo("Learn Java");
        verify(todoServiceMock, atLeast(1)).deleteTodo("Learn Java");

        //This will verify is the deleteTodo method not called with "Learn Spring" as parameter
        verify(todoServiceMock, never()).deleteTodo("Learn Spring");
        //BDD style syntax of above line
        then(todoServiceMock).should(never()).deleteTodo("Learn Spring");
    }

    @Test
    public void testDeleteTodosNotRelatedToSpring_usingMockBDD_argumentCapture(){

        //Declare Argument Captor
        ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);

        TodoService todoServiceMock = Mockito.mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Java");
        BDDMockito.given(todoServiceMock.retrieveTodos("Spring")).willReturn(todos);

        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

        todoBusinessImpl.deleteTodosNotRelatedToString("Spring");

        //Define Argument captor on a specific method call
        then(todoServiceMock).should().deleteTodo(stringArgumentCaptor.capture());

        //Capture the argument
        assertEquals(stringArgumentCaptor.getValue(), "Learn Java");

        assertEquals(stringArgumentCaptor.getAllValues().size(), 1);
        System.out.println("..." + stringArgumentCaptor.getAllValues());
    }
}
