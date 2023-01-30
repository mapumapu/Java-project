public class MethodVariableArgument {
    public static void main(String[] args) {

        float[] nilai = new float[] {90,100,90,90,79};
        System.out.println(rata2Nilai("Aditya", nilai));

        System.out.println("");

        System.out.println(rata2NilaiWithVariableArgument("Aditya Prasetya", 80, 79, 65, 90, 100, 70, 95, 97)); //bisa input berapapun value array

        System.out.println("");

        saySelamat("Aditya Prasetya", 80,90,90,90,95,75,70,80,60,80,90); // value ini tetap masuk dalam array
    }
    //tanpa variable argument
    static float rata2Nilai(String name, float[] nilai){
        System.out.println(name);
        var total = 0;
        for (var i : nilai){
            total += i;
        }
        var rata2 = total / nilai.length;
        return rata2;

    }

    //dengan variable argumen
    //bisa input berapapun panjang array yg kita mau

    static float rata2NilaiWithVariableArgument(String name, float...nilai2){
        System.out.println(name);
        var total = 0;
        for (var i : nilai2){
            total += i;
        }
        var rata2 = total / nilai2.length;
        return rata2;
    }

    static void saySelamat(String name, float... value){
        var total = 0;
        for (var i : value){
            total += i;
        }
        var rata2 = total / value.length;

        if (rata2 >= 80){
            System.out.println("Selamat " + name + "Anda Lulus dengan Nilai " + rata2);
        } else{
            System.out.println(name + ", Anda Tidak Lulus");
        }
    }
}
