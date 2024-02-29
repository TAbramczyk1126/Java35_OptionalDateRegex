package org.futureCollars.lesson10.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorURL {

    public boolean isURL(String URL) {

        Pattern pattern = Pattern.compile("^(http|https)(://)(www\\.)?[a-zA-Z.]{2,100}\\.[a-zA-Z]{2,3}");
        Matcher matcher = pattern.matcher(URL);

        return matcher.matches();
    }
}
