import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by randallcrame on 2/22/17.
 */
public class MyArrayListTest {
    MyArrayList<String> testList, testList2, testList3;
    @Before
    public void setUp(){
        testList = new MyArrayList();
        testList2 = new MyArrayList(20);
        testList3 = new MyArrayList(1);
        testList3.add("King");
    }

    @Test
    public void myArrayListSizeTest(){
        int expected = 10;
        int actual =  testList.size();
        assertEquals("Expect a return of 10", expected, actual);
    }

    @Test
    public void myArrayListSize20Test(){
        int expected = 20;
        int actual =  testList2.size();
        assertEquals("Expect a return of 20", expected, actual);
    }

    @Test
    public void addTest(){
        String expected = "test";
        testList.add("test");
        String actual = testList.get(0);
        assertEquals("Return of 'test' expected", expected, actual);
    }

    @Test
    public void addDoubleSizeTest(){
        testList3.add("Queen");
        int expected = 2;
        int actual = testList3.size();
        assertEquals("Expected new size of list to be 2", expected, actual);
    }
    @Test
    public void addIndexTest(){
        testList3.add("Queen", 0);
        String expected = "Queen";
        String actual = testList3.get(0);
        assertEquals("Expected Queen to return", expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public  void addExceptionTest(){
        testList3.add("Queen", -3);
    }
}
