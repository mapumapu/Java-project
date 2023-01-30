import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class sortingNumber {

    // Global variable
    public static int[] numbers = new int[5];
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        daftarMenu();
    }

    public static void daftarMenu() {
        while (true) {
            showRandomNumber();
            System.out.println("1 Random Data");
            System.out.println("2 Simulasi Bubble Sort - Ascending");
            System.out.println("3 Simulasi Bubble Sort - Descending");
            System.out.println("4 Simulasi Selection Sort - Ascending");
            System.out.println("5 Simulasi Selection Sort - Descending");
            System.out.println("6 Keluar");

            var input = input("Pilih");
            if (input.equals("1")) {
                inputData();
            } else if (input.equals("2")) {
                bubbleSortAscending(numbers);
            } else if (input.equals("3")) {
                bubbleSortDescending(numbers);
            } else if (input.equals("4")) {
                selectionSortAscending(numbers);
            } else if (input.equals("5")) {
                selectionSortDescending(numbers);
            } else if (input.equals("6")) {
                break;
            } else {
                System.out.println("Input salah");
            }
        }

    }

    public static boolean allZero(int[] numbers) {
        // cek array apakah semuanya 0 ?
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        return input.nextLine();
    }

    public static void inputData() {
        var minString = input("Masukkan Rentang Batas Bawah (x Jika Batal)");
        var maxString = input("Masukkan Rentang Batas Atas (x Jika Batal)");

        if (minString.equals("x") || maxString.equals("x")) {
            daftarMenu();
        } else {
            int minInt = Integer.parseInt(minString);
            int maxInt = Integer.parseInt(maxString);
            randomNumbers(minInt, maxInt);
        }
    }

    public static void randomNumbers(int min, int max) {
        Random rand = new Random();
        int range = max - min + 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(range) + min;
        }

    }

    public static void showRandomNumber() {
        System.out.println("######################");
        System.out.println(Arrays.toString(numbers));
        System.out.println("######################");
    }

    public static void bubbleSortAscending(int[] numbers) {
        if(allZero(numbers)) {
            System.out.println("Sebelum diurutkan : " + Arrays.toString(numbers));
            int n = numbers.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.println("Membandingkan angka " + numbers[j]+ " di index "+ j + " dengan angka " + numbers[j + 1] + " di index " + (j + 1) );
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                        System.out.println("Menukar angka " + numbers[j]+ " di index "+ (j + 1) + " dengan angka " + numbers[j + 1] + " di index " + j );
                        System.out.println("Hasil Pengurutan Sementara: " + Arrays.toString(numbers));
                    }
                }
            }
            System.out.println("Hasil akhir Bubble Sort Ascending: " + Arrays.toString(numbers));

        } else {
            System.out.println("Generate Random Data terlebih dahulu!");
            daftarMenu();
        }

    }

    public static void bubbleSortDescending(int[] numbers) {
        if(allZero(numbers)) {
            System.out.println("Sebelum diurutkan : " + Arrays.toString(numbers));
            int n = numbers.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.println("Membandingkan angka " + numbers[j]+ " di index "+ j + " dengan angka " + numbers[j + 1] + " di index " + (j + 1) );
                    if (numbers[j] < numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                        System.out.println("Menukar angka " + numbers[j]+ " di index "+ (j + 1) + " dengan angka " + numbers[j + 1] + " di index " + j );
                        System.out.println("Hasil Pengurutan Sementara: " + Arrays.toString(numbers));
                    }
                }
            }
            System.out.println("Hasil akhir Bubble Sort Descending: " + Arrays.toString(numbers));
        }
        else {
            System.out.println("Generate Random Data terlebih dahulu!");
            daftarMenu();
        }
    }

    public static void selectionSortAscending(int[] numbers) {

        if(allZero(numbers)) {
            System.out.println("Sebelum diurutkan : " + Arrays.toString(numbers));
            int n = numbers.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    System.out.println("Membandingkan angka " + numbers[j]+ " di index "+ j + " dengan angka " + numbers[minIndex] + " di index " + minIndex);
                    if (numbers[j] < numbers[minIndex]) {
                        minIndex = j;
                    }
                }
                System.out.println("Menukar angka " + numbers[minIndex] + " di index "+ minIndex + " dengan angka " + numbers[i] + " di index " + i);
                int temp = numbers[minIndex];
                numbers[minIndex] = numbers[i];
                numbers[i] = temp;
                System.out.println("Hasil Pengurutan Sementara: " + Arrays.toString(numbers));
            }
            System.out.println("Hasil akhir Selection Sort Ascending: "+ Arrays.toString(numbers));
        }
        else {
            System.out.println("Generate Random Data terlebih dahulu!");
            daftarMenu();
        }
    }

    public static void selectionSortDescending(int[] numbers) {

        if(allZero(numbers)) {
            System.out.println("Sebelum diurutkan : " + Arrays.toString(numbers));
            int n = numbers.length;
            for (int i = 0; i < n - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < n; j++) {
                    System.out.println("Membandingkan angka " + numbers[j]+ " di index "+ j + " dengan angka " + numbers[maxIndex] + " di index " + maxIndex);
                    if (numbers[j] > numbers[maxIndex]) {
                        maxIndex = j;
                    }
                }
                System.out.println("Menukar angka " + numbers[maxIndex] + " di index "+ maxIndex + " dengan angka " + numbers[i] + " di index " + i);
                int temp = numbers[maxIndex];
                numbers[maxIndex] = numbers[i];
                numbers[i] = temp;
                System.out.println("Hasil Pengurutan Sementara: " + Arrays.toString(numbers));
            }
            System.out.println("Hasil akhir Selection Sort Descending: "+ Arrays.toString(numbers));
        }
        else {
            System.out.println("Generate Random Data terlebih dahulu!");
            daftarMenu();
        }
    }
}

