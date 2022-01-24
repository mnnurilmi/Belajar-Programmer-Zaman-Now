public class AplikasiTodoList{
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        // testShowTodoList();
        // testAddToList();
        // showTodoList();
        // testRemoveTodoList();
        // testInput();
        // testViewShowTodoList();
        // testViewAddTodoList();
        // testViewRemoveTodoList();
    
        viewShowTodoList();

    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList() {
        System.out.println("TODO-LIST");
        for(int i=0;i<model.length;i++){
            var todo = model[i];
            var no = i+1;

            if(todo !=null){
                System.out.println(no+". "+todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Belajar java dasar";
        model[1] = "studi kasus java dasar";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     * 
     */
    public static void addToList(String todo) {
        //Cek apakah model penuh
        var isFull = true;
        for(int i=0;i<model.length;i++){    
            if(model[i]==null){
                isFull = false;
                break;
            }
        }

        //Bila array penuh, ukuran model diubah
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];
            for(int i = 0;i<temp.length;i++){
                model[i] = temp[i];
            }
        }

        //tambah data ke posisi array index dnengan data null
        for(var i = 0;i<model.length;i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddToList() {
        for(int i = 0;i<25;i++){
            addToList("todo-"+i);
        }
    }

    /**
     * Menghapus todo dari list
     * 
     */
    public static boolean removeTodoList(int no) {
        //0-9 index
        //1-10 no
        if(no-1>=model.length){
            return false;
        }
        if(model[no-1] == null){
            return false;
        }else{
            for(int i = no-1;i<model.length;i++){
                if(i==model.length-1){
                    model[i] = null;
                }else{  
                    model[i] = model[i+1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        addToList("todo"+1);
        addToList("todo"+2);
        addToList("todo"+3);
        addToList("todo"+4);
        addToList("todo"+5);
        addToList("todo"+6);
        addToList("todo"+7);
        addToList("todo"+8);
        addToList("todo"+9);
        addToList("todo"+10);
        System.out.println(removeTodoList(1));

        showTodoList();
    }

    public static String input(String info) {
        System.out.print(info+" : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var nama = input("nama");
        System.out.println("Hi "+ nama);

        var channel = input("channel");
        System.out.println("channel- "+ channel);
    }

    /**
     * menampilkan halaman utama todo list
     */
    public static void viewShowTodoList() {

        while(true){

            showTodoList();

            System.out.println("Menu:");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("X keluar");
    
            var input = input("Pilih");
            if(input.equals("1")){
              viewaAddTodoList();
            }else if(input.equals("2")){
                viewRemoveTodoList();
            }else if(input.equals("X") || input.equals("x")){
                break;
            }else{
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public static void testViewShowTodoList() {
        // addToList("1");
        // addToList("2");
        // addToList("3");
        // addToList("4");
        // addToList("5");
        viewShowTodoList();
    }

    /**
     * menampilkan penambahan todo list
     */
    public static void viewaAddTodoList() {
        System.out.println("MENAMBAH TODO LIST");
        var input = input("TODO (X Jika Batas)");
        if(input.equals("x") || input.equals("x")){
            //Batal
            viewShowTodoList();
        }else{
            addToList(input);
        }
    }

    public static void testViewAddTodoList() {
        viewaAddTodoList();
        showTodoList();
    }

    /**
     * menampilkan penghapusan todo lisy
     */
    public static void viewRemoveTodoList() {
        System.out.println("MENGHAPUS  TODO LIST");
        var input = input("nomor yg dihapus (x jika batal)");

        if(input.equals("x") || input.equals("x")){
            //batal;
        }else{
            boolean sukses = removeTodoList(Integer.valueOf(input));
            if(!sukses){
                System.out.println("Gagal menghapus todo");
            }else{
                System.out.println("Todo Listterhapus");
            }
        }
        // viewShowTodoList();
    }

    public static void testViewRemoveTodoList() {
        addToList("1");
        addToList("2");
        addToList("3");
        showTodoList();
        viewRemoveTodoList();
        showTodoList();
    }
}