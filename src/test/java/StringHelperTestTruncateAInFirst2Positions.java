import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTestTruncateAInFirst2Positions {
    static StringHelper helper;

    //@Before
    @BeforeClass
    public static void beforeClass() {
        //System.out.println("=====Fus Ro Da=====");
        helper = new StringHelper();
    }

    //@After
    @AfterClass
    public static void afterClass(){
        System.out.println("=====StringHelperTestTruncateAInFirst2Positions=====");
    }

    @Test
    public void testAacd() {
        //StringHelper stringHelper = new StringHelper();
        String actual = helper.truncateAInFirst2Positions("AACD");
        String expected = "CD";
        //AACD = CD | ACD => CD | CDEF = CDEF | CDAA = CDAA

        assertEquals(expected, actual);
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
