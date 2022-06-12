package com.in28minutes.junit.helper;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers.*;

public class HamcrestMatcherTest {
    @Test
    public void test() {
				//List matchers
        List<Integer> scores = Arrays.asList(10,20,30,40);
        assertThat(scores, hasSize(4)); //check the size of the list
        assertThat(scores, hasItems(30, 40)); //check the list has these items
        assertThat(scores, everyItem(greaterThan(9))); //check ever list item greater than 9
        assertThat(scores, everyItem(lessThan(41))); //check every list item less than 41

        //String matchers
        assertThat("", isEmptyString());
        assertThat(null, isEmptyOrNullString());

        //Array matchers
        Integer marks[] = {1,2,3,4,5};
        assertThat(marks, arrayWithSize(5));
        assertThat(marks, arrayContaining(1,2,3, 4,5));
        assertThat(marks, arrayContainingInAnyOrder(3, 2, 1, 4,5));


    }
}