public class MyMath {
    public static int smallestNumber(int[] a) {
        int largest = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] > largest)
                largest = a[i];
        }
        return largest;
    }

    public static double calculatePower(int a, int b) {
        double ans = a;

        if(b == 0)
            return 1;

        for(int i = 0; i < b - 1; i++){
            ans = ans * a;
        }

        return ans;
    }

    public static int calculateSum(int a) {
        int ans = 0;

        for(int i = a; i > 0; i--) {
            ans += i;
        }

        return ans;
    }

    public static int calculateFactorial(int a) {
        int ans = 1;

        for(int i = 1; i < a; i++) {
            ans += (ans * i);
        }

        return ans;
    }

    public static boolean isPrime (int a) {
        for(int i = 1; i <= a/2; i++) {
            if(a % i == 0 && (i != 1 || i != a))
               return false;
        }

            return true;
    }
}
