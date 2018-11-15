import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(Parameterized.class)
public class StringHelperTestTruncateParameterized {

    @AfterClass
    public static void afterClass() {
        System.out.println("=====StringHelperTestTruncateParameterized=====");
    }

    StringHelper helper = new StringHelper();

    private String input;
    private String expectedOutPut;

    public StringHelperTestTruncateParameterized(String input, String expectedOutPut) {
        this.input = input;
        this.expectedOutPut = expectedOutPut;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String expectedOutPuts[][] = {
                {"AACD", "CD"},
                {"ACD", "CD"}
        };

        return Arrays.asList(expectedOutPuts);
    }

    @Test
    public void testAacd() {
        assertEquals(expectedOutPut, helper.truncateAInFirst2Positions(input));
    }

    @Test
    public void testAcd() {
        //StringHelper stringHelper = new StringHelper();
        String actual = helper.truncateAInFirst2Positions("ACD");
        String expected = "CD";
        //AACD = CD | ACD => CD | CDEF = CDEF | CDAA = CDAA

        assertEquals(expected, actual);
    }

    @Test
    public void testCdef() {
        //StringHelper stringHelper = new StringHelper();
        String actual = helper.truncateAInFirst2Positions("CDEF");
        String expected = "CDEF";
        //AACD = CD | ACD => CD | CDEF = CDEF | CDAA = CDAA

        assertEquals(expected, actual);
    }

    @Test
    public void testCdaa() {
        //StringHelper stringHelper = new StringHelper();
        String actual = helper.truncateAInFirst2Positions("CDAA");
        String expected = "CDAA";
        //AACD = CD | ACD => CD | CDEF = CDEF | CDAA = CDAA

        assertEquals(expected, actual);
    }

    @Test
    public void testtruncateAInFirst2Positions2VarsEquals() {
        //StringHelper stringHelper = new StringHelper();
        String actual = helper.truncateAInFirst2Positions("AACD");
        String expected = helper.truncateAInFirst2Positions("ACD");
        //AACD = CD | ACD => CD | CDEF = CDEF | CDAA = CDAA

        assertEquals(expected, actual);
    }

    @Test
    public void testtruncateAInFirst2Positions2VarsNotEquals() {
        //StringHelper stringHelper = new StringHelper();
        String actual = helper.truncateAInFirst2Positions("CDEF");
        String expected = helper.truncateAInFirst2Positions("CDAA");
        //AACD = CD | ACD => CD | CDEF = CDEF | CDAA = CDAA

        assertNotEquals(expected, actual);
    }
}
