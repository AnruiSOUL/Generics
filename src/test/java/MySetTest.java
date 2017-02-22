import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by randallcrame on 2/22/17.
 */
public class MySetTest {
    MySet<Integer> testList;

    @Before
    public void setUp(){
        testList = new MySet<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
    }

    @Test
    public void addTest(){
        testList.add(4);
        int expected = 4;
        int actual = testList.get(3);
        assertEquals("Return 4", expected, actual);
    }
    @Test
    public void addRepeatTest(){
        testList.add(3);
        assertNull("Expect Null since nothing was added", testList.get(3));
    }

    @Test
    public void addIndexTest(){
        testList.add(4, 2);
        int expected = 4;
        int actual = testList.get(2);
        assertEquals("Return 4", expected, actual);
    }
    @Test
    public void addRepeatIndexTest(){
        testList.add(3);
        assertNull("Expect Null since nothing was added", testList.get(3));
    }
}
