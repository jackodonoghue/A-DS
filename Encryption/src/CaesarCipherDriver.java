public class CaesarCipherDriver {
    public static void main(String[] args) {
        //Expected result: mdfn rgrqrjkxh
        String text = CaesarCipher.encryptCaesarCipher("JACK ODONOGHUE", 3);

        //Expected result: CCCC
        String text1 = CaesarCipher.encryptCaesarCipher("ZZZZ", 3);

        //Expected result: YYYY
        String text2 = CaesarCipher.encryptCaesarCipher("AAAA", -2);

        System.out.print(text + "\n" + text1 + "\n" + text2);
    }
}
