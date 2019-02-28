public class RowColDecryption {
    public static String decrypt(String plaintext, int numCols) {

        int rows = plaintext.length() / numCols;

        return RowColTransposition.encrypt(plaintext, rows);

    }
}
