package practice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefixTest {

    LongestCommonPrefix implementation;

    @Before
    public void setUp() {
        implementation = new LongestCommonPrefix();
    }

    @Test
    public void testGetLongestCommonPrefix() {
        String[] input = { "test123", "testdfsD", "testsf", "test", "testearyar", "test3356ss" };
        assertEquals("test", implementation.getLongestCommonPrefix(input));
    }

    @Test
    public void testGetLongestCommonPrefixWithEmptyString() {
        String[] input = { "test", "", "testsf", "test", "testearyar", "test3356ss" };
        assertEquals("", implementation.getLongestCommonPrefix(input));
    }

    @Test
    public void testGetLongestCommonPrefixWithInputLengthZero() {
        String[] input = {};
        assertEquals("", implementation.getLongestCommonPrefix(input));
    }

    @Test
    public void testGetLongestCommonPrefixWithMoreInput() {
        String[] input = { "test123", "testdfsD", "testsf", "test", "testearyar", "test3356ss",
                "test3356ss", "test3356ss", "test3356ss", "test3356ss", "test3356ss",
                "test3356ss", "test3356ss", "test3356ss", "test3356ss", "test3356ss",
                "test3356ss", "test3356ss", "test3356ss", "test3356ss", "test3356ss",
                "test3356ss", "test3356ss", "test3356ss", "test3356ss", "test3356ss",
                "test3356ss", "test3356ss", "test3356ss", "test3356ss", "test3356ss",
                "test3356ss", "test3356ss", "test3356ss", "test3356ss", "tesst" };
        assertEquals("tes", implementation.getLongestCommonPrefix(input));
    }
}
