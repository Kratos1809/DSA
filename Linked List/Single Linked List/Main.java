public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(8);
        list.insertfirst(10);
        list.insertlast(7);
        list.insertlast(9);
        list.insertlast(99);
        list.insertindex(100, 3);
        // System.out.println(list.deletefirst());
        // list.deletefirst();

        // list.display();

        // System.out.println(list.deletelast());
        // list.deletelast();
        System.out.println(list.delete(3));
        
        list.display();
    }
}
