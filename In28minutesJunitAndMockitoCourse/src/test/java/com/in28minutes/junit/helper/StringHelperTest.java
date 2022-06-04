package com.in28minutes.junit.helper;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {
    StringHelper helper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions_Case_AACD(){
        //Test cases AACD --> CD
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }
    @Test
    public void testTruncateAInFirst2Positions_Case_ACD(){
        //Test cases ACD --> CD
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }
    @Test
    public void testTruncateAInFirst2Positions_Case_CDEF(){
        //Test cases CDEF --> CDEF
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }
    @Test
    public void testTruncateAInFirst2Positions_Case_CDAA(){
        //Test cases CDAA --> CDAA
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_Case_ABCD(){
        //Test cases ABCD --> false
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_Case_ABAB(){
        //Test cases ABAB --> true
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
}
