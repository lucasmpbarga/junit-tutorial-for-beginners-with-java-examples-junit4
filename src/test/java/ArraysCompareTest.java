import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ArraysCompareTest {
    @BeforeClass
    public static void beforeClass(){

    }

    @AfterClass
    public static void afterClass(){
        System.out.println("=====ArraysCompareTest=====");
    }

    @Test
    public void testArraySortRandomArray(){
        int[] numbers = {12,3,4,1};
        int[] expected = {1,3,4,12};

        Arrays.sort(numbers);

        assertArrayEquals(expected, numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArrayNullArray(){
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test(timeout = 100)
    public void testSortPerformance(){
        int array[] = {12,13,14};
        for (int i=1; i<=1000000; i++){
            array[0] = i;
            Arrays.sort(array);
        }
    }
}
