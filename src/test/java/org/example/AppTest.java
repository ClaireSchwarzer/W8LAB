package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{


    // Test push() method
    public void testPush() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        assertFalse(stack.isEmpty());//Stack is not empty after push
        assertEquals(Integer.valueOf(1), stack.delegate.get(stack.size() - 1));//top element is the one last pushed
    }
    public void testPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        Integer i = stack.pop();
        assertEquals(Integer.valueOf(1), i);//Pop should return the i
        assertTrue(stack.isEmpty());//Stack should be empty after popping the only element
    }
    public void testIsEmpty() {
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
    public void testSize() {
        MyStack<Integer> stack = new MyStack<>();
        assertEquals(0, stack.size());
        stack.push(1);
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }

}
