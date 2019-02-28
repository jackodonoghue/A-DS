public class RowColTranspositionDriver {
    public static void main(String[] args) {
        String input = "This is a secret message lad";

        String output = RowColTransposition.encrypt(input, 5);

        String decoded = RowColDecryption.decrypt(output, 5);

        System.out.println(output + "\n" + decoded);
    }
}
