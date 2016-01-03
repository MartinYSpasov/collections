package Lists;

import Lists.Stacks.TheStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StackTest {
    TheStack stack;

    @Before
    public void setUp(){
         stack = new TheStack(10);
    }

    @Test
    public void pushToTheStackTest(){
        stack.push("1");
        String toCompare = stack.pop();
        assertEquals(toCompare, "-1");
        assertTrue(stack.isEmpty());
    }
}
