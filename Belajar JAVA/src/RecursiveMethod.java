public class RecursiveMethod {
    public static void main(String[] args) {

        //method yang memanggil methodnya sendiri
        System.out.println(factorialLoops(4));
        System.out.println(factorialRecursive(4));
        recursiveloops(25);
    }

    //menggunakan perulangan for loops
    static int factorialLoops(int value){
        var total = 1;
        for (int i = 1; i <= value; i++) {
            total *= i;
        }
        return total;
    }

    //menggunakan recursive method
    //haiya, so confused


    static int factorialRecursive(int value){
        if (value == 1){ //cek value
            return 1;
        } else{
            return value * factorialRecursive(value - 1); //value akan dihitung sampai value menjadi 1
        }
    }

    static void recursiveloops(int value){
        if (value == 0){ //base
            return;
        }else{
            System.out.println("Loops ke " + value);
            recursiveloops(value - 1); //the loops
        }

    }
}
