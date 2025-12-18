import java.util.LinkedList;
import java.util.Scanner;

class StackBasic<T> {
    private LinkedList<T> list;

    public StackBasic() {
        list = new LinkedList<>();
    }

    public void push(T data){
        list.addFirst(data);
        System.out.println(data + " pushed to stack");
    }

    public T peek() {
        if (list.isEmpty())
            return null;
        return list.getFirst();
    }

    public T pop() {
        if (list.isEmpty())
            return null;
        return list.removeFirst();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}

public class StackMain {
    public static void main(String[] args) {
        StackBasic<Integer> stack = new StackBasic<>();
        Scanner ip = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 to push, 2 to peek, 3 to pop, 4 to exit");
            int n = ip.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter the value to push:");
                    int value = ip.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    System.out.println("Top element is: " + stack.peek());
                    break;
                case 3:
                    System.out.println("Popped element: " + stack.pop());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
