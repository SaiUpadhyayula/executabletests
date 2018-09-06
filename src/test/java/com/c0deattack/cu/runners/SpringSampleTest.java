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
    @Autowired
    TestService testService;

    @Test
    public void testSimple() {
        assertTrue("Test Simple", testService.isValid());
    }
}
