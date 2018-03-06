package com.test.algorithm.Impl;

import com.test.algorithm.Algorithm;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AlgorithmImpl implements Algorithm {

    final private String[] words;
    private String result;

    public AlgorithmImpl(String[] words) {
        this.words = words;
    }

    @Override
    public void run() {
        Map<Character, Set<String>> mapWords = Arrays.stream(words)
                .collect(Collectors.groupingBy((String word) -> word.charAt(0), Collectors.toCollection(TreeSet::new)));
        result = mapWords.entrySet().stream()
                .filter(entry -> entry.getValue().size()>1)
                .collect(Collector.of(
                        () -> new StringJoiner(", ","[", "]"),
                        (stringJoiner, str) -> stringJoiner.add(str.toString()),
                        StringJoiner::merge,
                        StringJoiner::toString));
    }

    @Override
    public void printResult() {
        System.out.println(String.format("Result:\n%s", result));
    }
}
