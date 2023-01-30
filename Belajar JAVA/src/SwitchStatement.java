import java.sql.SQLOutput;

public class SwitchStatement {
    public static void main(String[] args) {

        //Switch Statement
        //Hanya untuk perbandingan yang menggunakan "==" atau sama dengan

        var nilai = "B";

        switch (nilai){
            case "A":
                System.out.println("Good 1");
                break;
            case "B":
            case "C":
                System.out.println("Good 2");
                break;
            case "D":
                System.out.println("Not Good");
                break;
            default:
                System.out.println("Not Good 2");
        }

        //Switch Lambda
        switch (nilai) {
            case "A" -> System.out.println("Good 1");
            case "B", "C" -> System.out.println("Good 2");
            case "D" -> System.out.println("Not Good");
            default -> System.out.println("Not Good 2");
        }

        //Switch Lambda tanpa yield
        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "Good 1";
            case "B", "C" -> ucapan = "Good 2";
            case "D" -> ucapan = "Not Good";
            default -> ucapan = "Not Good 2";
        }
        System.out.println(ucapan);

        //Switch Lambda dengan yield

        String ucapan2 = switch(nilai) {
            case "A":
                yield "Good 1";
            case "B","C":
                yield "Good 2";
            case "D":
                yield "Not Good";
            default:
                yield "Not Good 2";
        }; // HARUS ADA ";" SETELAH KURUNG KURAWAL AKHIR "}"
        System.out.println(ucapan2);
    }
}
