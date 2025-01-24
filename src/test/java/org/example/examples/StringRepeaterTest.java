package org.example.examples;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class StringRepeaterTest {
    public static final String TEST_EXAMPLE_DIRECTORY = "string_examples";
    public static final String SOMETHING = "something";
    final StringRepeater sut = new StringRepeater();
    
    @Test
    void repeating_once() {
        Approvals.verify(sut.repeat("test.", 1));
    }

    @Test
    void repeating_twice() {
        Approvals.verify(sut.repeat("test.", 2));
    }
}