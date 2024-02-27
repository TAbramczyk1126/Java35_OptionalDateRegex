package org.futureCollars.lesson10.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {

    public boolean isPeselValid(String pesel) {

        Pattern pattern = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        Matcher matcher = pattern.matcher(pesel);

        boolean matches = matcher.matches();

        return matches;
    }
}
