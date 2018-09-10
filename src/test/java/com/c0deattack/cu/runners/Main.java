package com.c0deattack.cu.runners;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class Main {



    public static void main(String[] args) {
        System.out.println("Running tests of SpringSampleTest !");
        try {
            JUnitCore jUnitCore = new JUnitCore();
            jUnitCore.addListener(new TextListener(System.out));
            jUnitCore.run(new SpringJUnit4ClassRunner(SpringSampleTest.class));

        } catch (InitializationError initializationError) {
            initializationError.printStackTrace();
        }

    }
}