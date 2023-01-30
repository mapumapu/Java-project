public class DoWhileLoops {
    public static void main(String[] args) {

        //Do While Loops
        //Pasti melakukan iterasi 1 kali, meskipun tidak meet dengan condition nya
        //jadi do while loops melakukan iterasi dahulu 1x baru mengecek condition

        var nilai = 100; // value tidak meet dengan condition di while loops

        do {
            System.out.println("Haiyaa");
            nilai++;
        } while (nilai <=50); //jadi hanya melakukan perulangan 1x

        var nilai2 = 1; // value cocok dengan condition di while loops

        do {
            System.out.println("Haiya2");
            nilai2++;
        } while (nilai2 <= 10); //jadi akan melakukan iterasi sebanyak condition


    }
}
