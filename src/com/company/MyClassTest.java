package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MyClassTest {
    MyClass toTest = new MyClass();

    @Test public void equivalentClasses(){
        try {
            toTest.method(new int[]{0,1,2,3}, 1, 1, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, 0, 1, 2);
        } catch (Error e){
            assertEquals(e.getMessage(), "invalid end");
        }


        try {
            toTest.method(new int[]{0,1,2,3}, 1, 3, 2);
        } catch (Error e){
            assertEquals("invalid start", e.getMessage());
        }

        assertEquals(toTest.method(new int[]{0,1,2,3}, 0,3, 2), 2);

        assertEquals(toTest.method(new int[]{0,1,2,3}, 0,3, 99), -1);

    }

    @Test public void boundaryTests() {
        try {
            toTest.method(new int[]{0,1,2,3}, -1, 2, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, -1, 3, 2);
        } catch (Error e){
            assertEquals("invalid start", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, -1, 4, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, 0, 2, 2);
        } catch (Error e){
            assertEquals(e.getMessage(), "invalid end"); // both invalid stops at first throw
        }

        assertEquals(toTest.method(new int[]{0,1,2,3}, 0, 3, 2), 2); // both invalid stops at first throw

        try {
            toTest.method(new int[]{0,1,2,3}, 0, 4, 2);
        } catch (Error e){
            assertEquals(e.getMessage(), "invalid end"); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, 1, 2, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }
        try {
            toTest.method(new int[]{0,1,2,3}, 1, 3, 2);
        } catch (Error e){
            assertEquals("invalid start", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, 1, 4, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }
    }

    @Test public void categoryTests() {
        try {
            toTest.method(new int[]{0,1,2,3}, -1, 2, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, -1, 3, 2);
        } catch (Error e){
            assertEquals("invalid start", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, -1, 4, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, 0, 2, 2);
        } catch (Error e){
            assertEquals(e.getMessage(), "invalid end"); // both invalid stops at first throw
        }

        assertEquals(toTest.method(new int[]{0,1,2,3}, 0, 3, 2), 2); // both invalid stops at first throw

        try {
            toTest.method(new int[]{0,1,2,3}, 0, 4, 2);
        } catch (Error e){
            assertEquals(e.getMessage(), "invalid end"); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, 1, 2, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }
        try {
            toTest.method(new int[]{0,1,2,3}, 1, 3, 2);
        } catch (Error e){
            assertEquals("invalid start", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, 1, 4, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }

        assertEquals(toTest.method(new int[]{0,1,2,3}, 0, 3, 0), 0); // both invalid stops at first throw
        assertEquals(toTest.method(new int[]{0,1,2,3}, 0, 3, 3), 3); // both invalid stops at first throw
        assertEquals(toTest.method(new int[]{1}, 0, 0, 1), 0); // both invalid stops at first throw
        assertEquals(toTest.method(new int[]{}, 0, -1, 99), -1); // both invalid stops at first throw
        assertEquals(toTest.method(new int[]{0,1,2,3}, 0, 3, 99), -1); // both invalid stops at first throw
    }


    @Test public void statementTests() {
        try {
            toTest.method(new int[]{0,1,2,3}, 1, 1, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, 0, 1, 2);
        } catch (Error e){
            assertEquals(e.getMessage(), "invalid end");
        }

        try {
            toTest.method(new int[]{0,1,2,3}, 1, 3, 2);
        } catch (Error e){
            assertEquals("invalid start", e.getMessage());
        }

        assertEquals(toTest.method(new int[]{0,1,2,3}, 0,3, 2), 2);

        assertEquals(toTest.method(new int[]{0,1,2,3}, 0,3, 99), -1);
    }

    @Test public void branchTests() {
        assertEquals(toTest.method(new int[]{}, 0,-1, 99), -1);
        assertEquals(toTest.method(new int[]{0,1,2,3}, 0,3, 99), -1);

    }

    @Test public void conditionCoverage() {
        try {
            toTest.method(new int[]{0,1,2,3}, -1, 2, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, -1, 3, 2);
        } catch (Error e){
            assertEquals("invalid start", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, -1, 4, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, 0, 2, 2);
        } catch (Error e){
            assertEquals("invalid end", e.getMessage()); // both invalid stops at first throw
        }

        assertEquals(toTest.method(new int[]{0,1,2,3}, 0, 3, 2), 2); // both invalid stops at first throw

        try {
            toTest.method(new int[]{0,1,2,3}, 0, 4, 2);
        } catch (Error e){
            assertEquals( "invalid end", e.getMessage()); // both invalid stops at first throw
        }

        try {
            toTest.method(new int[]{0,1,2,3}, 1, 2, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }
        try {
            toTest.method(new int[]{0,1,2,3}, 1, 3, 2);
        } catch (Error e){
            assertEquals("invalid start", e.getMessage()); // both invalid stops at first throw

        }

        try {
            toTest.method(new int[]{0,1,2,3}, 1, 4, 2);
        } catch (Error e){
            assertEquals("invalid start and end", e.getMessage()); // both invalid stops at first throw
        }

        // start mutation killing
//        assertEquals( 0, toTest.method(new int[]{2}, 0, 0, 2));
        // end

        assertEquals( 0, toTest.method(new int[]{0,1,2,3}, 0, 3, 0));
        assertEquals( 3, toTest.method(new int[]{0,1,2,3}, 0, 3, 3));
        assertEquals( 0, toTest.method(new int[]{1}, 0, 0, 1));
        assertEquals( -1, toTest.method(new int[]{}, 0, -1, 99));
        assertEquals( -1, toTest.method(new int[]{0,1,2,3}, 0, 3, 99));
    }
}