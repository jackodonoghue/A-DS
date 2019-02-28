public class Q1 {

    public static void main(String[] args) {
       //Largest Number

        int[] numbers = {1,2,3};//3
        int[] numbers1 = {20,543,70};//543
        int[] numbers2 = {3405,349,203};//3405

        System.out.println(MyMath.smallestNumber(numbers2));

        //Calculate a ^ b

        double pow = MyMath.calculatePower(1,2); //1

        double pow1 = MyMath.calculatePower(10, 0); //1

        double pow2 = MyMath.calculatePower(5, 3); //125

        System.out.println(pow);

        //add

        int sum = MyMath.calculateSum(6); //21

        int sum1 = MyMath.calculateSum(5); // 15

        int sum2 = MyMath.calculateSum(12); //78

        System.out.println(sum);


        //Factorial

        int fact = MyMath.calculateFactorial(3); //6

        int fact1 = MyMath.calculateFactorial(5); //120

        int fact2 = MyMath.calculateFactorial(9); //362880

        System.out.println(fact);

        //Prime

        System.out.println(MyMath.isPrime(7));
    }
}
