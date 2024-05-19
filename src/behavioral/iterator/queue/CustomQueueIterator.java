package behavioral.iterator.queue;

import behavioral.Iterator.Iterator;

public class CustomQueueIterator<T> implements Iterator<T> {
    private final CustomQueue<T> queue;
    private int index;

    public CustomQueueIterator(CustomQueue<T> queue) {
        this.queue = queue;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < queue.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return queue.getItemAt(index++);
        }
        return null;
    }
}
