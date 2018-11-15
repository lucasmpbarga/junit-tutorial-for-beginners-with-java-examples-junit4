import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTestAreFirstAndLastTwoCharactersTheSame {
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
        System.out.println("=====StringHelperTestAreFirstAndLastTwoCharactersTheSame=====");
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameAbcd() {
        //ABCD = false | ABAB = true | AB = true | A = false
        //StringHelper stringHelper = new StringHelper();
        Boolean actual = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
        Boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameAbab() {
        //ABCD = false | ABAB = true | AB = true | A = false
        //StringHelper stringHelper = new StringHelper();
        Boolean actual = helper.areFirstAndLastTwoCharactersTheSame("ABAB");
        Boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameAb() {
        //ABCD = false | ABAB = true | AB = true | A = false
        //StringHelper stringHelper = new StringHelper();
        Boolean actual = helper.areFirstAndLastTwoCharactersTheSame("AB");
        Boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameA() {
        //ABCD = false | ABAB = true | AB = true | A = false
        //StringHelper stringHelper = new StringHelper();
        Boolean actual = helper.areFirstAndLastTwoCharactersTheSame("A");
        Boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameTrueTrue() {
        //ABCD = false | ABAB = true | AB = true | A = false
        //StringHelper stringHelper = new StringHelper();
        Boolean actual = helper.areFirstAndLastTwoCharactersTheSame("ABAB");
        Boolean expected = helper.areFirstAndLastTwoCharactersTheSame("AB");
        assertEquals(expected, actual);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameFalseFalse() {
        //ABCD = false | ABAB = true | AB = true | A = false
        //StringHelper stringHelper = new StringHelper();
        Boolean actual = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
        Boolean expected = helper.areFirstAndLastTwoCharactersTheSame("A");
        assertEquals(expected, actual);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameAssertFalse() {
        //ABCD = false | ABAB = true | AB = true | A = false
        //StringHelper stringHelper = new StringHelper();
        Boolean aBoolean = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
        assertFalse(aBoolean);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameAssertFalse2() {
        //ABCD = false | ABAB = true | AB = true | A = false
        //StringHelper stringHelper = new StringHelper();
        Boolean aBoolean = helper.areFirstAndLastTwoCharactersTheSame("A");
        assertFalse(aBoolean);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameAssertTrue() {
        //ABCD = false | ABAB = true | AB = true | A = false
        //StringHelper stringHelper = new StringHelper();
        Boolean aBoolean = helper.areFirstAndLastTwoCharactersTheSame("ABAB");
        assertTrue(aBoolean);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSameAssertTrue2() {
        //ABCD = false | ABAB = true | AB = true | A = false
        //StringHelper stringHelper = new StringHelper();
        Boolean aBoolean = helper.areFirstAndLastTwoCharactersTheSame("AB");
        assertTrue(aBoolean);
    }



}
