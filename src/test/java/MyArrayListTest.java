import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by randallcrame on 2/22/17.
 */
public class MyArrayListTest {
    MyArrayList<String> testList, testList2, testList3, testList4;
    @Before
    public void setUp(){
        testList = new MyArrayList<>();
        testList2 = new MyArrayList<>(20);
        testList3 = new MyArrayList<>(1);
        testList3.add("King");
        testList4 = new MyArrayList<>(5);
        testList4.add("Ace");
        testList4.add("King");
        testList4.add("Queen");
        testList4.add("Jack");
        testList4.add("Ten");
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
    @Test
    public void addIndexSize(){
        testList3.add("Queen", 0);
        int expected = 2;
        int actual = testList3.size();
        assertEquals("Array size increased to 2", expected, actual);
    }

    @Test
    public void addIndexKingTest(){
        testList3.add("Queen", 0);
        String expected = "King";
        String actual = testList3.get(1);
        assertEquals("Expected King to return", expected, actual);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public  void addExceptionTest(){
        testList3.add("Queen", -3);
    }

    @Test
    public void indexOfTest() {
        int expected = 2;
        int actual = testList4.indexOf("Queen");
        assertEquals("Expected a return of index 2", expected, actual);
    }

    @Test
    public void indexOfNegativeTest(){
        int expected = -1;
        int actual = testList4.indexOf("Five");
        assertEquals("Expected a return of -1, not found", expected, actual);
    }

    @Test
    public void removeTest(){
        testList3.remove(0);
        assertNull(testList3.get(0));
    }


    @Test
    public void clearTest(){
        testList3.clear();
        assertNull(testList3.get(0));
    }

    @Test
    public void clearSizeTest(){
        testList3.clear();
        int expected = 1;
        int actual = testList3.size();
        assertEquals("Expected return of 1", expected, actual   );
    }

    @Test
    public void setTest(){
        testList.set(5, "Ace");
        String expected = "Ace";
        String actual = testList.get(5);
        assertEquals("Expected return of 'Ace'", expected, actual);
    }

    @Test
    public void containsTrueTest(){
        boolean actual = testList4.contains("Queen");
        assertTrue("Return true", actual);
    }


    @Test
    public void containsFalseTest(){
        boolean actual = testList3.contains("Queen");
        assertFalse("Return false", actual);
    }

    @Test
    public void isEmptyTrueTest(){
        boolean actual = testList.isEmpty();
        assertTrue("Return true", actual);
    }

    @Test
    public void isEmptyFalseTest(){
        boolean actual = testList3.isEmpty();
        assertFalse("Return false", actual);
    }
}
