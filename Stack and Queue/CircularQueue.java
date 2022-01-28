public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front = 0;
    int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full!!");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty!!");
        }
       front = front % data.length;
       size--;
        return data[front++];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty!!");
        }
        return data[front];  
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty!!");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

    public boolean isFull() {
        return end == data.length; // it is at last index
    }

    public boolean isEmpty() {
        return end == 0; // 
    }
}
