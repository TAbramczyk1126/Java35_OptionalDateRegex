package org.futureCollars.lesson10.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorURL {

    public boolean isURL(String URL){

        Pattern pattern = Pattern.compile("http://www.onet.pl|https://mail.google.com|http://wiadmosci.onet.pl|http://onet.pl");
        Matcher matcher = pattern.matcher(URL);

        boolean matches = matcher.matches();

        return matches;
    }
}
