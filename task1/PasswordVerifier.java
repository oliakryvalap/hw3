package task1;

   

public class PasswordVerifier {
    public static void passwordVerifer(String password) throws PasswordValidException {
        try {
            if (checkCapitalLetters(password) && checkNumbersInPassword(password) && password.length() >= 8) {
                System.out.println("Пороль действителен!");
            } else {
                throw new PasswordValidException("Пороль должен иметь не менее восьми символов");
            }

        } catch (PasswordValidException e) {
            System.out.println(e.getMessage());
        }
    }

    //проверка на наличие цифр в строке:
    private static boolean checkNumbersInPassword(String password) throws PasswordValidException {
        boolean check = false;
        char[] checkArray = password.toCharArray();
        for (char symbol : checkArray) {
            if (Character.isDigit(symbol)) {
                check = true;
            }
        }
        if (!check) {
            throw new PasswordValidException("Пороль должен содержать хотя бы одну цифру");
        }
        return true;

    }
    //проверка на наличие заглавных букв в строке:
    private static boolean checkCapitalLetters(String password) throws PasswordValidException {
        boolean check = false;
        char[] checkArray = password.toCharArray();
        for (char symbol : checkArray) {
            if (Character.isUpperCase(symbol)) {
                check = true;
            }
        }
        if (!check) {
            throw new PasswordValidException("Пороль должен содержать хотя бы одну заглавную букву");
        }
        return true;
    }


}


