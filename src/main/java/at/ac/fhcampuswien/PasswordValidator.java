package at.ac.fhcampuswien;

public class PasswordValidator {
    public boolean length(String password) {
        return password.length() >= 8 && password.length() <= 25;
    }

    public boolean upLowCase(String password) {
        boolean isUp = false; //setting state to false as default - if nothing is there return false
        boolean isLow = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                isUp = true; // if at position i char is upper set it to true to use it in last statement
            }
            if (Character.isLowerCase(password.charAt(i))) {
                isLow = true; // if at position i char is lower set it to true to use it in last statement
            }
            if (isLow && isUp) {
                return true; // if condition true, no need to loop once again
            }
        }
        return false;
    }

    public boolean numbers(String password){
        char[] number = password.toCharArray();
        for(char c : number){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }


}
