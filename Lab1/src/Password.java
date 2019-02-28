import javax.swing.*;

public class Password {
    public static void main(String[] args) {
        String password;
        boolean ok = false;

        while(!ok) {
            password = JOptionPane.showInputDialog("Enter password: ");

            if(validate(password)) {
                ok = true;
            }
        }

        JOptionPane.showMessageDialog(null, "Login Succesful");
    }

    public static boolean validate(String password) {

        boolean ans = false;
        int upper = 0, lower = 0, digits = 0;

        if(password.length() >= 8) {
            for(int i = 0; i < password.length(); i ++) {
                if(Character.isDigit(password.charAt(i)))
                    digits++;

                if(Character.isLowerCase(password.charAt(i)))
                    lower++;

                if(Character.isUpperCase(password.charAt(i)))
                    upper++;
            }

            if(digits >= 1 && lower >= 1 && upper >= 1)
                ans = true;
        }


        return ans;
    }
}