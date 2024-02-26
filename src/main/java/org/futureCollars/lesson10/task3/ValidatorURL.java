package org.futureCollars.lesson10.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorURL {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("http://www.onet.pl|https://mail.google.com|http://wiadmosci.onet.pl|http://onet.pl");
        Matcher matcher = pattern.matcher("https://mail.google.com");

        boolean matches = matcher.matches();

        if (matches) System.out.println("URL address is correct");
        else System.out.println("Incorrect data was entered");
    }
}
