

public class RowColTransposition {
    public static String encrypt(String in, int n) {
        String cipherText = "";
        String encryptedText = "", cipherTextUpper;
        int row;
        int counter = 0;

        for(int i = 0; i < in.length() ; i++) {
            if(Character.isLetter(in.charAt(i))) {
                cipherText += in.charAt(i);
            }
        }

        while (cipherText.length() % n != 0) {
            cipherText += "x";
        }

        row = cipherText.length() / n;

        cipherTextUpper = cipherText.toUpperCase();

        for(int col = 0; col < n ; col++) {

            int index = col;

             for(int rows = 0; rows < row ; rows++) {

                 encryptedText += cipherTextUpper.charAt(index );

                 index +=n;

                 counter++;

             }
        }


        return encryptedText + counter;
    }
}
