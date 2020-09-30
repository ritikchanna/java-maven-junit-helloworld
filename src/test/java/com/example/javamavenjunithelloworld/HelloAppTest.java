package com.example.javamavenjunithelloworld;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Unit test for HelloApp.
 * <p/>
 * A unit test aims to test all code and code paths of a specific class.
 */
@ExtendWith(MockitoExtension.class)
public class HelloAppTest {
    static SecurityManager originalSecurityManager;

    @BeforeAll
    public static void setup() {
        // Insert our own custom SecurityManager that throws an exception when System.exit() is called.
        originalSecurityManager = System.getSecurityManager();
        //System.setSecurityManager(new TestingSecurityManager());
    }

    @AfterAll
    public static void tearDown() {
        // Reinsert the original SecurityManager now that we are done with these tests.
        System.setSecurityManager(originalSecurityManager);
    }

    @Test
    public void testFail1() {
        Assertions.fail("Fail 1");
    }

    @Test
    public void testFail2() {
        Assertions.fail("Fail 2");

    }

    @Test
    public void testPass() {


    }
}
