package org.futureCollars.lesson10.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeselValidatorTest {

    @Test
    void shouldDisplayTrueIfPeselIsValid() {
        PeselValidator peselValidator = new PeselValidator();
        assertTrue(peselValidator.isPeselValid("04902231365"));
    }
}
