import java.sql.SQLOutput;

public class ForLoops {
    public static void main(String[] args) {

        //For Loops
        //Syntax
        //for(initial statement; kondisi; post statement){
        // blok perulangan
        // }

        //Infinite Loops
        //  for (;;){
        //      System.out.println("Haiyaaa");
        //  }

        //for Loops only with condition
        var counter = 1;
        for (;counter <= 10;){
            System.out.println(counter);
            counter++;
        }

        //for Loops with init statement and condition
        for (var counter2 = 1;counter2 <= 100;) {
            System.out.println(counter2);
            counter2++;
        }

        //for Loops with init statement, condition and post statement
        for (var counter3 = -1;counter3 >= -50;counter3--) {
            System.out.println(counter3);
        }
        //print 10 haiya
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+".Haiya");
        }

    }
}
