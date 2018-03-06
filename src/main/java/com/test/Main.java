package com.test;

import com.test.algorithm.Algorithm;
import com.test.algorithm.Impl.AlgorithmAsJava8Impl;

import java.util.*;

public class Main {

    public static void main(String[] args){
        String[] words = scanWordList();
        Algorithm algorithm = new AlgorithmAsJava8Impl(words);
        algorithm.run();
        algorithm.printResult();
    }

    private static String[] scanWordList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words:");
        return scanner.nextLine().split(" ");
    }
}
