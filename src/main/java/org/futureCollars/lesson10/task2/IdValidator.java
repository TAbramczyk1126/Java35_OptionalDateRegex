package org.futureCollars.lesson10.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdValidator {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        Matcher matcher = pattern.matcher("80112617924");

        boolean matches = matcher.matches();

        if (matches) System.out.println("PESEL is correct");
        else System.out.println("Incorrect data was entered");
    }
}
