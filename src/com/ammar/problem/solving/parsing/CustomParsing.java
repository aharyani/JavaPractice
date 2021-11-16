package com.ammar.problem.solving.parsing;

import java.util.Arrays;

public class CustomParsing {

    public static int toParseInt(String str) {
    int result = 0;
    int zero='0'; // or int zero = 48; because acsii of zero is 48
        for(int i=0;i<str.length();i++){
            result*=10;
            result+= str.charAt(i)- zero;
        }

        return result;
    }

}
