package behavioral.iterator;

import behavioral.Iterator.queue.CustomQueue;
import behavioral.Iterator.stack.CustomStack;

public class Main {
    public static void main(String[] args) {

        System.out.println("<<<<<<<<<Queue Iterator>>>>>>>>>>");

        CustomQueue<String> queue = new CustomQueue<>();
        queue.enqueue("Item 1");
        queue.enqueue("Item 2");
        queue.enqueue("Item 3");

        Iterator<String> queueIterator = queue.createIterator();
        while (queueIterator.hasNext()) {
            System.out.println("Queue item: " + queueIterator.next());
        }

        System.out.println("<<<<<<<<<Stack Iterator>>>>>>>>>>");

        CustomStack<String> stack = new CustomStack<>();

        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        stack.push("Element 4");

        Iterator<String> stackIterator = stack.createIterator();

        while (stackIterator.hasNext()) {
            System.out.println("Queue item: " + stackIterator.next());
        }

    }
}
