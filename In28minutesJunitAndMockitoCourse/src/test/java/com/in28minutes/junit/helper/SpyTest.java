package com.in28minutes.junit.helper;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SpyTest {

    @Test
    public void test(){
        ////Mock////
        List arrayListMock = mock(ArrayList.class);
        //mock return default value so the size will return 0
        assertEquals(0, arrayListMock.size());
        //Now we are telling mock object to return value 5 when size method called
        stub(arrayListMock.size()).toReturn(5);
        //Now mock object will true as we configured, irrespective of how many element in the list
        arrayListMock.add("dummy1");
        arrayListMock.add("dummy2");
        //The above two new added element won't affect the size return value it will always return 5
        assertEquals(5, arrayListMock.size());


        ////Spy////
        List arrayListSpy = spy(ArrayList.class);
        assertEquals(0, arrayListSpy.size());
        arrayListSpy.add("dummy1");
        arrayListSpy.add("dummy2");
        assertEquals(2, arrayListSpy.size());
        arrayListSpy.remove("dummy2");
        assertEquals(1, arrayListSpy.size());
        //We are stubbing only size method, so other methods of ArrayList class use the original implementation
        stub(arrayListSpy.size()).toReturn(5);
        assertEquals(5, arrayListSpy.size());

        //Spy usage for verifying method calls
        verify(arrayListSpy).add("dummy1");
        verify(arrayListSpy, never()).clear();
    }
}
