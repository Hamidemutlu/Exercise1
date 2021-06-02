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
    public void upLowCase1(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.upLowCase("124530480986Ba?30324809");
        assertTrue(actual);
    }

    @Test
    @DisplayName("")
    public void upLowCase2(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.upLowCase("124530480986BBB30324809");
        assertFalse(actual);
    }

    @Test
    @DisplayName("")
    public void upLowCase3(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.upLowCase("124530480986aaa30324809");
        assertFalse(actual);
    }

    @Test
    @DisplayName("")
    public void numbers1(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.numbers("124530480986Ba?30324809");
        assertTrue(actual);
    }

    @Test
    @DisplayName("")
    public void numbers2(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.numbers("BBaaCCdd?");
        assertFalse(actual);
    }

    @Test
    @DisplayName("")
    public void specialCharacters1(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.specialCharacters1("BBaaCCdd?!");
        assertTrue(actual);
    }

    @Test
    @DisplayName("")
    public void specialCharacters1(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.specialCharacters1("BBaaCCddB");
        assertFalse(actual);
    }
}
