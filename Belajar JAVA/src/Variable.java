public class Variable {
    public static void main(String[] args) {

        //how to define variable//
        String thisString;
        thisString = "Aditya";

        int thisInteger;
        thisInteger = 100;

        System.out.println(thisString);
        System.out.println(thisInteger);

        //create variable using keyword var//
        //you must initiate the value directly//

        //var number //this is error
        //will automatically detect the datatype
        var number = 1000;
        var word = "meaning";

        //create variable using keyword final//
        //the value cannot be changed//

        final int numb = 1000;
        //numb = 200; //this is error because variable numb final value is 1000 and cannot be changed

        System.out.println(numb);


    }
}
