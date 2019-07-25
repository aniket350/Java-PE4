package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HarryHenry {

    // finds the word harry
    public boolean findHarry(String s) {
        Pattern object = Pattern.compile("harry");
        Matcher object1 = object.matcher(s);

        return object1.find();
    }
}
