// Recursive factorial method

public class Factorial {
    public static void main(String[] args) {
        System.out.print(factorial(5));
        System.out.print("\n" + myPow(5, 3));
        System.out.print("\n" + reverse("jack"));
    }
   
   // Recursive definition of method factorial
   public static int factorial( int n )
   {      
      if ( n == 1 || n == 0 )  // base case
         return 1;
      else {
         int result1 = factorial(n-1);
         int result = n * result1;
         return result;
      }
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

   public static String reverse(String in) {
        if(in.isEmpty()) {
            return in;
        }else{
            char recStr = in.charAt(0);
            String res = reverse(in.substring(1))    + recStr;
            return res;
        }
   }
}

