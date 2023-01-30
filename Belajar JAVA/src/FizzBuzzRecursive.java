public class FizzBuzzRecursive {
    public static void main(String[] args) {

        fizzBuzzRecursive(5000);

    }

    static void fizzBuzzRecursive(long n){
        if (n == 0){
            return;
        }else{
            fizzBuzzRecursive(n - 1);
            if (n % 3 == 0 && n % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        }
    }
}
