public class Power {
        public static void main(String[] args) {
            System.out.print("\n" + myPow(5, 3));
        }

    public static double myPow(double x, int y) {
        if(y == 0) {
            return 1;
        }else{
            double currPow = myPow(x, y-1);
            double res = x * currPow;
            return res;
        }
    }
}
