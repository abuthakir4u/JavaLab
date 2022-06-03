package org.javalab.junitpoc;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestMatcherTest {
    @Test
    public void test() {

        //List matchers
        List<Integer> scores = Arrays.asList(10,20,30,40);
        assertThat(scores, hasSize(4));
        assertThat(scores, hasItems(30, 40));
        assertThat(scores, everyItem(greaterThan(9)));
        assertThat(scores, everyItem(lessThan(41)));

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
