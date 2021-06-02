package com.test.Session3;

import brave.sampler.Matchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {

    public static void main(String[] args) {

        String patternMatch = "MavericSystemsMavericSystems";
        Pattern pattern = Pattern.compile("Sys");
        Matcher result = pattern.matcher(patternMatch);
        while (result.find())
            System.out.println("Pattern found from " + result.start() +
                    " to " + (result.end() - 1));



    }
}

