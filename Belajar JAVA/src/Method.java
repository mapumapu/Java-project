public class Method {
    public static void main(String[] args) {

        //Method or Function
        //Calling the method
        sayHaiya(); //
        sayHello("Aditya", "Prasetya");
        sayHello("Mastuty", "Ayu");

        System.out.println(multiplyTwoNumber(2, 2));

        var resultMultiply = multiplyTwoNumber(4, 4);
        System.out.println(resultMultiply);

        System.out.println(calculateUsingSwitch(1,2,"bagi"));
        System.out.println(calculateUsingSwitch(5,2,"haiya")); //return 0 karena input salah

        System.out.println(calculateUsingIfStatement(4, 2, "bagi"));
    }

    //Method with no return and no parameter
    static void sayHaiya(){
        System.out.println("Haiya"); // isi method
    }

    //Method with Parameter or Argument

    static void sayHello(String namaDepan, String namaBelakang){ //parameter ada di dalam kurung dipisahkan dengan koma
        System.out.println("Hello " + namaDepan + " " + namaBelakang);
    }

    //Method with return value
    static int multiplyTwoNumber(int num1, int num2){ //ganti kata void dengan datatype yg kita inginkan ex int, float, boolean
        var x = num1 * num2;
        return x; //return variable x value
    }

    static float calculateUsingSwitch(float n1, float n2, String operasiPerhitungan) {
        switch (operasiPerhitungan) {
            case "tambah":
                return n1 + n2;
            case "kurang":
                return n1 - n2;
            case "kali":
                return n1 * n2;
            case "bagi":
                return n1 / n2;
            default:
                return 0;
        }
    }

    static float calculateUsingIfStatement(int n1, int n2, String operasiPerhitungan){
        float z = (float) n1 / n2;
        float what = 0;

        if (operasiPerhitungan == "tambah"){
            what = n1 + n2;
        } else if (operasiPerhitungan == "kurang"){
            what = n1 - n2;
        } else if (operasiPerhitungan == "kali") {
            what = n1 * n2;
        } else if (operasiPerhitungan == "bagi") {
            what = z;
        }
        return what;
    }
}
