package com.c0deattack.cu.runners;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Main {


    public static void main(String[] args) {
        System.out.println("Running tests of SpringSampleTest !");
        JUnitCore jUnitCore = new JUnitCore();
        jUnitCore.addListener(new TextListener(System.out));
        jUnitCore.run(SpringSampleTest.class);
    }
}