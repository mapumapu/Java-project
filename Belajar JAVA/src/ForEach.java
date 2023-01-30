public class ForEach {
    public static void main(String[] args) {

        //Memakai perulangan for biasa untuk memanggil value array
        
        int[] array = {1,2,3,4,5,6,7};

        for (int i = 1; i <= array.length; i++) {
            System.out.println(i);
        }
        


        System.out.println(" ");
        System.out.println(" ");

        //Memakai perulangan for each untuk memanggil value array

        for (var i : array) {
            System.out.println(i);
        }
    }
}

