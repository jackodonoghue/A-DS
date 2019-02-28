import javax.swing.*;

public class CountWords {
    public static void main(String[] args) {
        String sent = JOptionPane.showInputDialog("Enter Sentence: ");
        int noWords = countWords(sent);

        JOptionPane.showMessageDialog(null, "Number of words: " + noWords);
    }

    public static int countWords(String a) {
        int words = 0;

        if(!a.equals("")) {
            if(Character.isLetter(a.charAt(0))) {
                words++;
            }

            for(int i = 1; i < a.length(); i++) {
                if(a.charAt(i) == ' ' && Character.isLetter(a.charAt(i-1))) {
                    words++;
                }
            }


            if(a.charAt(a.length() - 1) == ' ') {
                words--;
            }
        }

        return words;
    }
}
