public class ToDoList {
    public static String[] model = new String[10];

    public static java.util.Scanner input = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowToDoList();

    }

    //menampilkan todolist
    public static void showToDoList() {
        System.out.println("TO DO LIST");
        for (int i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    //menambah todolist
    public static void addToDoList(String todo) {

        //cek apakah penuh ?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                //masih ada yang kosong
                isFull = false;
                break;
            }
        }

        //jika penuh, resize ukuran array 2 kali lipat
        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data array nya NULL
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }

        }

    }

    //menghapus todolist
    public static boolean removeToDoList(int number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }

            }
            return true;
        }
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        return input.nextLine();

    }


    //menampilkan view todolist
    public static void viewShowToDoList() {
        while (true) {
            showToDoList();
            System.out.println("Menu : ");
            System.out.println("1 Tambah");
            System.out.println("2 Hapus");
            System.out.println("3 Keluar");

            var input = input("Pilih");
            if (input.equals("1")) {
                viewAddToDoList();
            } else if (input.equals("2")) {
                viewRemoveToDoList();
            } else if (input.equals("3")) {
                break;
            } else {
                System.out.println("Input salah");
            }
        }

    }

    //menampilkan view menambahkan todolist
    public static void viewAddToDoList() {
        System.out.println("MENAMBAH TO DO LIST");

        var todo = input("Todo (x Jika Batal)");

        if (todo.equals("x")) {

        } else {
            addToDoList(todo);
        }

    }

    //menampilkan view menghapus todolist
    public static void viewRemoveToDoList() {
        System.out.println("MENGHAPUS TO DO LIST");

        var number = input("Nomor yang Dihapus (x Jika Batal");

        if (number.equals("x")){

        }else {
            boolean success = removeToDoList(Integer.valueOf(number));
            if (!success){
                System.out.println("Gagal menghapus todolist");
            }
        }

    }


}
