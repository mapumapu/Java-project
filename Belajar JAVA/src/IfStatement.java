
public class IfStatement {
    public static void main(String[] args) {

        var nilaiRapot = 80;
        var nilaiUNAS = 90;

        if (nilaiRapot >= 90 && nilaiUNAS >= 95){
            System.out.println("Cumload");
        }
        else{
            System.out.println("BLOK!");
        }

        if (nilaiRapot >= 90 && nilaiUNAS >= 90){
            System.out.println("Nilai A");
        }
        else if (nilaiRapot >= 80 && nilaiUNAS >= 80){
            System.out.println("Nilai B");
        }
        else if (nilaiRapot >= 70 && nilaiUNAS >= 70){
            System.out.println("Nilai C");
        }
        else if (nilaiRapot >= 60 && nilaiUNAS >= 60){
            System.out.println("Nilai D");
        }
        else{
            System.out.println("Nilai E");
        }
    }
}
