//    Write a program to find out the multiple occurrences of the given word in a string using Matcher
//    methods.
package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MultipleOccurence {

    public ArrayList<String> occurance(String s){

            //uses while till the end of the string and finds whether the regular expression is found or not.
            ArrayList<String> list=new ArrayList<>();

            Pattern object=Pattern.compile("se");
            Matcher object1=object.matcher(s);
            while(object1.find()){
                list.add(object1.start()+" "+object1.end());
            }
            return list;
    }
}
