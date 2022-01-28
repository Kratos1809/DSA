public class Main {
    public static void main(String[] args) {
        Dynamicstack stack = new Dynamicstack(5);

        stack.push(4);
        stack.push(9);
        stack.push(5);
        stack.push(10);
        stack.push(66);
        stack.push(45);

        System.out.println(stack.peek());
    }
}