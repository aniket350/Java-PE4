package com.stackroute.pe4;

public class TotalCount {

    //    a function which checks the occurance of a character in a string.
    public int countFunction(String inputValue,char a){

        int count=0;
        for(int i=0;i<inputValue.length();i++)
        {

            if(inputValue.charAt(i)=='a')
            {
                count++;
            }
        }
        return count;
    }
}