package at.ac.fhcampuswien;

public class PasswordValidator {
    public boolean length(String password){
        return password.length() >= 8 && password.length() <= 25;
    }
}
