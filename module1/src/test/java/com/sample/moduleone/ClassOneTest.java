package com.sample.moduleone;


import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClassOneTest {

    @Test
    public void shouldTestName() {
        assertThat(new ClassOne().name(), is("ClassOne"));
    }
}
