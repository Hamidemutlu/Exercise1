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

    public boolean numbers(String password) {
        char[] number = password.toCharArray();
        for (char c : number) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean specialCharacters(String password) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        char currentCharakter;

        for (int i = 0; i < password.length(); i++) {
            currentCharakter = password.charAt(i);
            if (specialChars.contains(String.valueOf(currentCharakter))) {
                return true;
            }
        }
        return false;
    }

    public boolean notmoreTwoNuminOrder(String password) {
        int counter = 0;
        char previous = password.charAt(0);

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                if (previous + 1 == c) {
                    counter++;
                } else {
                    counter = 1;
                }
                if (counter >= 3) {
                    return false;
                }
                previous = c;
            }
        }
        return true;
    }

    public boolean morethan3times(String password){
    int counter = 0;
    char previous = password.charAt(0);

        for(int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);
        if (Character.isDigit(c)) {
            if (previous == c) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > 3) {
                return false;
            }
            previous = c;
        }
    }
        return true; }
}

