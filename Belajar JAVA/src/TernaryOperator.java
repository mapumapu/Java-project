public class TernaryOperator {
    public static void main(String[] args) {

        var nilai = 80;
        String ucapan;

        //menggunakan if else biasa
        if (nilai >= 75) {
            ucapan = "Lulus";
        } else {
            ucapan = "Tidak Lulus";
        }
        System.out.println(ucapan);

        //menggunakan Ternary Operator
        var nilai2 = 80;
        String ucapan2 = nilai >= 75 ? "Lulus" : "Tidak Lulus";
        System.out.println(ucapan2);
    }
}
