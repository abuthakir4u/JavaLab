package com.in28minutes.junit.powermock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UtilityClass.class)
public class MockingStaticMethodTest {
    @Mock
    Dependency dependency;

    @InjectMocks
    SystemUnderTest systemUnderTest;


    @Test
    public void powerMockito_MockingAStaticMethodCall(){
        List<Integer> todos = Arrays.asList(1,2,3);
        when(dependency.retrieveAllStats()).thenReturn(todos);
        //Mocking static class and its method
        PowerMockito.mockStatic(UtilityClass.class);
        when(UtilityClass.staticMethod(anyLong())).thenReturn(150);
        assertEquals(150, systemUnderTest.methodCallingAStaticMethod());

        //Verifying method call
        PowerMockito.verifyStatic(UtilityClass.class);
        UtilityClass.staticMethod(5);
    }
}
