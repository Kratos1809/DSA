public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full!!");
        }
        data[end++] = item;
        return true;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty!!");
        }
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return data[0];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty!!");
        }
        return data[0];  
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "<-");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return end == data.length; // it is at last index
    }

    public boolean isEmpty() {
        return end == 0; // 
    }
}
