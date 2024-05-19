package behavioral.iterator.queue;

import behavioral.Iterator.Aggregator;
import behavioral.Iterator.Iterator;

import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue<T> implements Aggregator<T> {
    private final Queue<T> items;

    public CustomQueue() {
        items = new LinkedList<>();
    }

    public void enqueue(T item) {
        items.add(item);
    }

    public T dequeue() {
        return items.poll();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public Iterator<T> createIterator() {
        return new CustomQueueIterator<>(this);
    }

    public T getItemAt(int index) {
        return (T) items.toArray()[index];
    }
}
