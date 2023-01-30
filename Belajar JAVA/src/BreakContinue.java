public class BreakContinue {
    public static void main(String[] args) {

        //break and continue

        var counter = 1;
        while (true) {
            System.out.println("Haiya " + counter);
            counter++;

            if (counter < 20){
            } else if (counter >= 21) {
                break;
            }
        }
        for (var i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz "+ i);
                continue;
            }

        }
    }
}
