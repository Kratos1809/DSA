public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(8);
        list.insert(9);
        list.insert(10);
        list.insert(12);
        // list.delete(10);
        list.delete(12);

        list.display();
    }
}
