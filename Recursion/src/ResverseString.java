public class ResverseString {
    public static void main(String[] args) {
        System.out.print("\n" + reverse("jack"));
    }

    public static String reverse(String in) {
        if(in.isEmpty()) {
            return in;
        }else{
            char recStr = in.charAt(0);
            String res = reverse(in.substring(1)) + recStr;
            return res;
        }
    }
}
