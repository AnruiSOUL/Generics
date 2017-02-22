import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by randallcrame on 2/22/17.
 */
public class MyArrayListTest {
    MyArrayList testList, testList2;
    @Before
    public void setUp(){
        testList = new MyArrayList();
        testList2 = new MyArrayList(20);
    }

    @Test
    public void myArrayListSizeTest(){
        int expected = 10;
        int actual =  testList.size();
        assertEquals("Expect a return of 10", expected, actual);
    }
}
