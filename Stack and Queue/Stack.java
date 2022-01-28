public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int indx = -1;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }

        indx++;
        data[indx] = item;
        return true;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot pop");
        }
        int removed = data[indx];
        indx--;
        return removed;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot peek");
        }
        return data[indx];
    }

    public boolean isFull() {
        return indx == data.length - 1; // it is at last index
    }

    public boolean isEmpty() {
        return indx == - 1; // 
    }

}
