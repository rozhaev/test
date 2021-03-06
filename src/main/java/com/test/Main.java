package com.test;

import com.test.algorithm.Algorithm;
import com.test.algorithm.Impl.AlgorithmImpl;

import java.util.*;

public class Main {

    public static void main(String[] args){
        String[] words = scanWordList();
        Algorithm algorithm = new AlgorithmImpl(words);
        algorithm.run();
        algorithm.printResult();
    }

    private static String[] scanWordList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words:");
        return scanner.nextLine().split(" ");
    }
}
