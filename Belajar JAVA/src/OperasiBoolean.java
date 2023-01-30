public class OperasiBoolean {
    public static void main(String[] args) {

        //operasi && atau and
        //operasi || atau or
        //operasi !  atau kebalikan

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 65; //value harus lebih dari sama dengan 65 untuk mengeluarkan output true
        boolean lulusNilai = nilaiAkhir >= 65; //value harus lebih dari sama dengan 65 untuk mengeluarkan output true

        boolean lulus = lulusAbsen && lulusNilai; //value lulusAbsen dan lulusNilai harus true untuk mengeluarkan output true
        System.out.println(lulus);

    }
}
