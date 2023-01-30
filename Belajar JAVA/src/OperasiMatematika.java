public class OperasiMatematika {
    public static void main(String[] args) {

        int a = 100;
        int b = 3;

        int thisTambah = a + b;
        int thisKurang = a - b;
        int thisKali = a * b;
        int thisBagi = a / b;
        int thisModulo = a % b; //sisa pembagian

        System.out.println(thisTambah);
        System.out.println(thisKurang);
        System.out.println(thisKali);
        System.out.println(thisBagi);
        System.out.println(thisModulo);

        //augmented assignment

        int c = 200;
        int d = 10;

        c += d;
        d %= c;

        System.out.println(c);
        System.out.println(d);

        //unary operator

        int e = 500;

        e++; //e = e + 1

        System.out.println(e);

    }
}
