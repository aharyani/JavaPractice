package com.ammar.development.training.assignment.task3.langpackage.problem.six;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDuplicates {


    static void repeatingWords() {

        String name = "my name is ammar haryani and my father name is ali akber haryani";
        List<String> wordsSplit = Arrays.asList(name.split(" "));

        Map<String, Long> repeatedWords = wordsSplit.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(repeatedWords);

    }

    static void repeatingCharacters() {
            // Find the no of occurence of words in String using java 8 stream
        String name = "my name is ammar haryani and my father name is ali akber haryani";
        List<String> characterSplit = Arrays.asList(name.split(""));

        Map<String, Long> repeatedCharacters = characterSplit.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(repeatedCharacters);


    }

}
