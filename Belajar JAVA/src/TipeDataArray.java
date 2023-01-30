public class TipeDataArray {
    public static void main(String[] args) {

        //data type array
        //all value inside array must have same datatype

        int[] arrayInteger;
        arrayInteger = new int[5]; //input the length of array

        arrayInteger[0] = 1; //add value to array based on index number
        arrayInteger[3] = 4;

        System.out.println(arrayInteger[0]); //print certain index

        String[] arrayString = new String[6]; //or shorter ways

        arrayString[0] = "adit"; //add value to array based on index number

        System.out.println(arrayString[0]);

        //shorter way to make array
        int[] arrayNumber = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        arrayNumber[2] = 10; //change value of index 2
        //you cannot delete array but you can change the value
        arrayNumber[1] = 0;

        System.out.println(arrayNumber[2]);

        String[] arrayName = new String[] {"Adit", "Mastuty"};

        arrayName[0] = "Mapu";

        System.out.println(arrayNumber.length); //length of array

        //nested array


        int[][] arrayNumber2 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {10,20,30}
        };

        System.out.println(arrayNumber2[2][1]);

    }
}
