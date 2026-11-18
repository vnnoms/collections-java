public class ArrayStackDemo {
    public static void main(String[] args) {

        ArrayStack<Integer> numbers = new ArrayStack<>(3);

        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        System.out.println("Integer Stack:");
        System.out.println(numbers.pop());
        System.out.println(numbers.pop());
        System.out.println(numbers.pop());

        ArrayStack<String> texts = new ArrayStack<>(2);

        texts.push("OOP");
        texts.push("Collection");

        System.out.println("\nString Stack:");
        System.out.println(texts.pop());
        System.out.println(texts.pop());

        // Pengujian Overflow
        ArrayStack<Integer> overflowStack = new ArrayStack<>(3);

        overflowStack.push(1);
        overflowStack.push(2);
        overflowStack.push(3);

        try {
            overflowStack.push(4);
        } catch (ArrayStack.ArrayStackException e) {
            System.out.println("\nOverflow Test:");
            System.out.println(e.getMessage());
        }

        // Pengujian Underflow
        ArrayStack<Integer> underflowStack = new ArrayStack<>(2);

        try {
            underflowStack.pop();
        } catch (ArrayStack.ArrayStackException e) {
            System.out.println("\nUnderflow Test:");
            System.out.println(e.getMessage());
        }
    }
}