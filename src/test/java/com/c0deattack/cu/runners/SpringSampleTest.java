package com.c0deattack.cu.runners;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class SpringSampleTest {
    @Autowired TestService testService;

    @Test
    public void testSimple() {

        System.out.println("**** Init test simple 1 *****");
        assertTrue("test simple 1 testService must be in Spring context",testService!=null );
        final boolean valid = testService.isValid();
        assertTrue("Test Simple",valid );
        System.out.println(" *****End test simple 1  result = " + valid);
    }


    @Test
    public void testSimple2() {

        System.out.println("*** Init test simple 2 ****");
        assertTrue("test simple 2 testService must be in Spring context",testService!=null );
        final boolean valid = testService.isValid();
        assertTrue("Test Simple w",valid )
        ;
        System.out.println("End test simple 2 result= " + valid);
    }
}
