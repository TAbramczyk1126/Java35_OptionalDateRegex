package org.futureCollars.lesson10.Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordValidationTest {

    @Test
    void shouldReturnTrueForPasswordPatternsAsGiven() {
        //given
        String[] password = {"Marek125", "Tadek752", "Zuzia17923"};
        boolean[] expResults = {true, true, true};

        //when
        PasswordValidation[] validation = {
                new PasswordValidation(password[0]),
                new PasswordValidation(password[1]),
                new PasswordValidation(password[2])
        };
        boolean[] actResults = {
                validation[0].isStrongPassword(),
                validation[1].isStrongPassword(),
                validation[2].isStrongPassword()
        };
        //then
        Assertions.assertArrayEquals(expResults, actResults);
    }

    @Test
    void shouldReturnFalseForPasswordPatternsAsGiven() {
        //given
        String[] password = {"Marek21", "tadek742", "hasloTest"};
        boolean[] expResults = {false, false, false};

        //when
        PasswordValidation[] validation = {
                new PasswordValidation(password[0]),
                new PasswordValidation(password[1]),
                new PasswordValidation(password[2])
        };
        boolean[] actResults = {
                validation[0].isStrongPassword(),
                validation[1].isStrongPassword(),
                validation[2].isStrongPassword()
        };
        //then
        Assertions.assertArrayEquals(expResults, actResults);
    }
}
