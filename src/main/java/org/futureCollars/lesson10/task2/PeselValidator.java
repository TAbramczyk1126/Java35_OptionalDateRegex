package org.futureCollars.lesson10.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {

    public boolean isPeselValid(String Pesel) {

        Pattern pattern = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        Matcher matcher = pattern.matcher(Pesel);

        boolean matches = matcher.matches();

        return matches;
    }
}
