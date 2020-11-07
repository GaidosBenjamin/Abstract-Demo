package app;

public class PasswordRules
{

    private static boolean checkLength(String password)
    {
        if(password.length() >= 12) {
            return true;
        }
        return false;
    }

    private static boolean checkCase(String password)
    {
        boolean upper = false;
        boolean lower = false;
        for(char ch : password.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                upper = true;
            }
            if(Character.isLowerCase(ch)) {
                lower = true;
            }
            if(upper && lower) {
                return true;
            }
        }
        return false;

    }
    private static int checkLettersAndDigits(String password)
    {
        boolean letters = false;
        int digits = 0;
        for(char ch : password.toCharArray()) {
            if(Character.isDigit(ch))
                digits++;
            if(Character.isLetter(ch))
                letters = true;
            if(digits >= 3 && letters)
                return 3;
        }
        if(digits > 0 && letters) {
            return 1;
        }
        return 0;
    }


    public static void main(String[] args)
    {
        String password = "A122sdasdasd";
        var lettersAndDigits = checkLettersAndDigits(password);
        if (!checkLength(password)) {
            System.out.println(password + " at least 12 characters.");
        } else if (!checkCase(password)) {
            System.out.println(password + " uppercase and lowercase.");
        } else if (lettersAndDigits == 0) {
            System.out.println(password + " letters and digits.");
        } else if (lettersAndDigits == 1) {
            System.out.println(password + " at least 3 digits.");
        } else {
            System.out.println(password + " is valid.");
        }

    }
}