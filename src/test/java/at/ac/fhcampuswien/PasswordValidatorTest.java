package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    @Test
    @DisplayName("Has the password the correct length")
    public void lengthTest1(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.length("124530480986Ba?30324809");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Passwordlength is not correct")
    public void lengthTest2(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.length("12Ba3?");
        assertFalse(actual);
    }

    @Test
    @DisplayName("Passwordlength is not correct")
    public void lengthTest3(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.length("124530480986094303248093667");
        assertFalse(actual);
    }

    @Test
    @DisplayName("Does your have upper and lower Case")
    public void upLowCase1(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.upLowCase("124530480986Ba?30324809");
        assertTrue(actual);
    }

    @Test
    @DisplayName("LowerCase needed")
    public void upLowCase2(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.upLowCase("124530480986BBB30324809");
        assertFalse(actual);
    }

    @Test
    @DisplayName("UpperCase needed")
    public void upLowCase3(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.upLowCase("124530480986aaa30324809");
        assertFalse(actual);
    }

    @Test
    @DisplayName("Does password contains numbers")
    public void numbers1(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.numbers("124530480986Ba?30324809");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Password needs numbers")
    public void numbers2(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.numbers("BBaaCCdd?");
        assertFalse(actual);
    }

    @Test
    @DisplayName("Does password contains special Charakters")
    public void specialCharacters1(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.specialCharacters("BBaaCCdd?!");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Special Charakter needed")
    public void specialCharacters2(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.specialCharacters("BBaaCCddB");
        assertFalse(actual);
    }

    @Test
    @DisplayName("More than two numbers (right after) not allowed")
    public void notmoreTwoNuminOrder1(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.notmoreTwoNuminOrder("11247Ba9312?!");
        assertTrue(actual);
    }

    @Test
    @DisplayName("More than two numbers (right after) not allowed")
    public void notmoreTwoNuminOrder2(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.notmoreTwoNuminOrder("11247Ba931234?!");
        assertFalse(actual);
    }

    @Test
    @DisplayName("Same number more than three time not allowed")
    public void morethan3times1(){
        PasswordValidator p= new PasswordValidator();
        boolean actual = p.morethan3times("111308Ba?305805");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Same number more than three time not allowed")
    public void morethan3times2(){
        PasswordValidator p= new PasswordValidator();
        boolean actual = p.morethan3times("111108Ba?305805");
        assertFalse(actual);
    }
}
