package by.teachMeSkills.khodasArtyom.homework28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private static final char[] elements = {'а', 'р', 'т', 'е', 'м'};

    @Test
    void checkIfCharArrayIsBlank() {
        char[] chars = {'1', '\n'};
        assertFalse(StringUtils.isBlank(chars));
    }

    @Test
    void ifTheArrayHaveOneSpace() {
        char[] chars = {' '};
        assertTrue(StringUtils.isBlank(chars));
    }

    @Test
    void ifTheArrayIsBlank() {
        char[] chars = {};
        assertTrue(StringUtils.isBlank(chars));
    }

    @Test
    void ifOnlyRussianCharsInArray() {
        char[] chars = {'а', 'б', 'В'};
        boolean result = StringUtils.isRussian(chars);
        assertTrue(result);
    }

    @Test
    void returnFalseIfCharsHasOneNotRussianChar() {
        char[] chars = {'A', 'b'};
        assertFalse(StringUtils.isRussian(chars));
    }

    @Test
    void returnTrueIfArrayTakesIntoAccount() {
        char[] chars = {'а', 'ё'};
        assertTrue(StringUtils.isRussian(chars));

    }

    @Test
    void returnTrueIfUpperCaseIsRussian() {
        char[] chars = {'Ё'};
        assertTrue(StringUtils.isRussian(chars));
    }

    @Test
    void returnTrueIfUpperCaseWithOtherLetter() {
        char[] chars = {'А', 'В', 'Г'};
        assertTrue(StringUtils.isRussian(chars));
    }

    @Test
    void returnTrueIfCombinationIsRussian() {
        char[] chars = {'а', 'в', 'Г', 'Д', 'Ё', 'е', 'ё'};
        assertTrue(StringUtils.isRussian(chars));
    }

    @Test
    void checkIfLengthOfArrayThrowsException() {
        char[] chars1 = {};
        char[] chars2 = {};
        assertThrows(IllegalArgumentException.class, () -> StringUtils.contains(chars1, chars2));
    }

    @Test
    void checkIfSuArraylongerThenMainArray() {
        char [] array = {'f','i'};
        char[] subArray = {'f','i','v','x','c'};
        assertThrows(IllegalArgumentException.class,()->StringUtils.contains(array,subArray));
    }

    @Test
    void returnTrueIfArrayContainsSuArray() {
        char[] subArray = {'i','v','x'};
        char[] array = {'f', 'i', 'v', 'x', 'c'};
        assertEquals(true, StringUtils.contains(array, subArray));
    }

    @Test
    void returnFalseIfArrayDoesNotContainsSubArray() {
        char[] subArray = {'a', 'b', 'c'};
        char[] array = {'f', 'i', 'v', 'x', 'c'};
        assertEquals(false, StringUtils.contains(array, subArray));
    }

    @Test
    void returnTrueIfNotCorrectChars() {
        char[] numbers = {'a', 'б'};
        assertThrows(IllegalArgumentException.class, () -> StringUtils.parsInt(numbers));
    }

    @Test
    void fallThisTestIfMethodDoNotThrowException() {
        char[] numbers = {'0', '9'};
        assertThrows(IllegalArgumentException.class, () -> StringUtils.parsInt(numbers));
    }

    @Test
    void ifMethodParsIntReturnTrue() {
        char[] numbers = {'1', '2', '3'};
        assertEquals(123, StringUtils.parsInt(numbers));
    }


}


