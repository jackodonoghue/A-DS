public class CaesarCipher {
    public static String encryptCaesarCipher(String plaintext, int offset) {
        if (offset >= 26) {
            offset -= 26;
        }

        String s = "";

        for(int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);

            if(Character.isLetter(ch)) {
                if((int)ch + offset > (int)'Z') {
                    //System.out.print((ch + (char) offset));
                    s += (char)('A' + offset - 1);
                }

                else if((int)ch + offset < (int) 'A') {
                    s += (char)('Z' + offset + 1);
                }

                else{
                    int ascii = (int) ch;

                    s += (char)(ascii + offset);
                }
            }
            else
                s += " ";
        }

        return s;
    }
}
