package org.javalab.junitpoc;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class ListTest {

    @Test
    public void testListSize() {
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.size()).thenReturn(2);
        Assert.assertEquals(2, listMock.size());
    }
    @Test
    public void testListSize_ReturnMultipleValues() {
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.size()).thenReturn(2).thenReturn(3);
        Assert.assertEquals(2, listMock.size());
        Assert.assertEquals(3, listMock.size());
    }

    @Test
    public void testListGet() {
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.get(0)).thenReturn("abu");
        Assert.assertEquals("abu", listMock.get(0));

        //listMock.get(1) -- we did not mock this, but nice mock will return null
        Assert.assertEquals(null, listMock.get(1));
    }

    @Test
    public void testListGet1() {
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.get(Mockito.anyInt())).thenReturn("abu");
        Assert.assertEquals("abu", listMock.get(0));
        Assert.assertEquals("abu", listMock.get(1));
        Assert.assertEquals("abu", listMock.get(2));
    }

    @Test (expected = RuntimeException.class)
    public void testListGet2() {
        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.get(Mockito.anyInt())).thenThrow(new RuntimeException("something went wrong"));
        listMock.get(0);
    }

}
