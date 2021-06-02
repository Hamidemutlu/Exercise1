package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    @Test
    @DisplayName("")
    public void lengthTest(){
        PasswordValidator p = new PasswordValidator();
        boolean actual = p.length();
        assertTrue(actual);
    }
}
