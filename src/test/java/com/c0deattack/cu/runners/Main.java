package com.c0deattack.cu.runners;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {



    public static void main(String[] args) {
        System.out.println("Running tests of SpringSampleTest !");
//        try {

            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            JUnitCore junit = new JUnitCore();
            junit.addListener(new TextListener(System.out));

            Result result = junit.run(SpringSampleTest.class);
            System.out.println("Finished. Result: Failures: " +
                    result.getFailureCount() + ". Ignored: " +
                    result.getIgnoreCount() + ". Tests run: " +
                    result.getRunCount() + ". Time: " +
                    result.getRunTime() + "ms.");
    }
}