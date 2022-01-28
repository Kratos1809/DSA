public class LL {

    private Node head;      /*We dont manipulate with the head and tail because they maintain the structure of the Linked List
                            Instead we take a temp or node or something that is present in the scope of function and hence doesnt break the structire of the LL*/
    private Node tail;
    private int size;
    
    public LL() {
        this.size = 0;
    }

    public void insertfirst(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        if(tail == null){
            tail = head;
        }

        size += 1;
    } 

    public void insertlast(int val){
        if(tail == null){
            insertfirst(val);
            return;
        }
        Node newnode = new Node(val);
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    public void insertindex(int val, int index){
        if(index == 0){
            insertfirst(val);
            return;
        }
        if(index == size){
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newnode = new Node(val, temp.next);
        temp.next = newnode;

        size++;
    }

    public int deletefirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }


    public int deletelast(){
        if(size <= 1){
            return deletefirst();
        }

        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        size--;
        return val;
    }

    public Node get(int index){
        Node test = head;
        for (int i = 0; i < index; i++) {
            test = test.next;
        }
        return test;
    }

    public int delete(int index){
        if(index == 0){
           return deletefirst();
        }
        if(index == size -1){
            return deletelast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;

        return val;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");

      
    }


    private class Node{
        private int value;
        private Node next;  //why is next pointer of type node? -> Bcz it is a reference of type node pointing to an object of type node which also contains int value and Node next
                            //and therefore they can only be traveresed in forward direction. This next variable of type node has only idea about which object of type Node is it pointing to
        
        public Node(int value, LL.Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

}
