public class MethodOverloading {
    public static void main(String[] args) {

        //method overloading
        //menamai method dengan nama metdoh yang sudah ada
        //tetapi data di parameter harus berbeda
        //entah jumlah atau tipe data

        sayHaiya();
        sayHaiya("Aditya");
        sayHaiya("Aditya", "Mastuty");
        System.out.println(calculate(1,2));//sum
        System.out.println(calculate(4,2));//divide


    }
    //nama method sama
    //tetapi parameter berbeda

    static void sayHaiya(){
        System.out.println("Haiya");
    }

    static void sayHaiya(String name1){
        System.out.println("Haiya " + name1);
    }

    static void sayHaiya(String name1, String name2){
        System.out.println("Haiya " + name1 + " Haiya " + name2);
    }

    static int calculate(int num1, int num2){
        var total = num1 + num2;
        return total;
    }

    static float calculate(float num1, float num2){
        var total = num1 / num2;
        return total;
    }


}
