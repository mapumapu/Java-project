
public class WhileLoops {
    public static void main(String[] args) {

        //while loops
        //sama dengan for loops
        //bisa melakukan perulangan hanya dengan condition tanpa statement

        var counter = 1;

        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        String restart = "yes";
        while (restart == "yes") {
            String input = "no";

            System.out.println("Haiya");

            if (input == "no"){
                restart = "no";
                break;
                }
            }
        }
    }


