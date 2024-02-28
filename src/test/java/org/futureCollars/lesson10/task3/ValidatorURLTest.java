package org.futureCollars.lesson10.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorURLTest {

    @Test
    void shouldDisplayTrueIfEnteredTextIsURL() {
        ValidatorURL validatorURL = new ValidatorURL();
        assertTrue(validatorURL.isURL("http://www.onet.pl"));
    }
}
