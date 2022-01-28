public class CLL {
   private Node head;
   private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
}

    public void insert(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }
        newnode.next = head;
        tail.next = newnode;
        tail = newnode;
    }

    public void delete(int val){
        Node temp = head;
        if(temp == null){
            return;
        }
        if(temp.value == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = temp.next;
            if(n.value == val){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while(temp != head);

    }
    
    public void display(){
        Node temp = head;
       if(head != null){
           do{
               System.out.print(temp.value + "->");
               temp = temp.next;
           }
           while(temp != head);
       }
       System.out.println("HEAD");
    }



    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, CLL.Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
