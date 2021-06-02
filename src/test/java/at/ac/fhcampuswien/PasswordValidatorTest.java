package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    @Test
    @DisplayName("")
    public void lengthTest1(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.length("124530480986Ba?30324809");
        assertTrue(actual);
    }

    @Test
    @DisplayName("")
    public void lengthTest2(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.length("12Ba3?");
        assertFalse(actual);
    }

    @Test
    @DisplayName("")
    public void lengthTest3(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.length("124530480986094303248093667");
        assertFalse(actual);
    }

    @Test
    @DisplayName("")
    public void letter1(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.letter("124530480986Ba?30324809");
        assertTrue(actual);
    }
}
