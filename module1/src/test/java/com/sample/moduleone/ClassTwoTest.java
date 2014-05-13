package com.sample.moduleone;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClassTwoTest {

    @Test
    public void shouldTestName() {
        assertThat(new ClassTwo().name(), is("ClassTwo"));
    }
}
