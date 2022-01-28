public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.inserfirst(8);
        list.inserfirst(10);
        list.inserfirst(12);
        list.inserfirst(14);
        list.inserlast(99);
        list.insert(8, 98);

        list.display();
    }
}
