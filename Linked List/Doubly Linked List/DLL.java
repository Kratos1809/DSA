public class DLL {

    Node head;

        public void inserfirst(int val){
            Node newnode = new Node(val);
            newnode.next = head;
            newnode.prev = null;
            if(head != null){
                head.prev = newnode;
            }
            head = newnode;
        }

        public void inserlast(int val){
            Node newnode = new Node(val);
            Node temp = head;

            newnode.next = null;

            if(head == null){
                newnode.prev = head;
                head =  newnode;
                return;
            }
            
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.prev = temp;
        }

        public Node find(int value){
            Node temp = head;
            while(temp != null){
                if(temp.value == value){
                    return temp;
                }
                temp = temp.next;
            }
            return null;
        }

        public void insert(int after, int val){
            Node p  = find(after);

            if(p == null){
                System.out.println("Node does not exist");
                return;
            }
            Node newnode = new Node(val);
            newnode.next = p.next;
            newnode.prev = p;
            p.next = newnode;
            if(newnode.next != null){
                newnode.next.prev = newnode;
            }
        }

        public void display(){
            Node temp = head;
            Node last = null;
            while(temp != null){
                last = temp;
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("END");

            System.out.println("Print in Reverse Order");

            while(last != null){
                System.out.print(last.value + "<-");
                last = last.prev;
            }
            System.out.println("START");
        }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, DLL.Node next, DLL.Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
       
    }
}
