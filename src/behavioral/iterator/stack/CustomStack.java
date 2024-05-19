package behavioral.iterator.stack;

import behavioral.Iterator.Aggregator;
import behavioral.Iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class CustomStack<T> implements Aggregator<T> {
    private final List<T>items;

    public CustomStack() {
        this.items = new ArrayList<>();
    }

    public void push(T item) {
      items.add(item);
    }

    public T pop() {
       if (!items.isEmpty()) {
          items.remove(items.size() - 1);
       }
       return null;
    }

    public boolean isEmpty() {
       return items.isEmpty();
    }

    public int size() {
      return items.size();
    }

    public T getItemAt(int index) {
      return items.get(index);
    }

    @Override
    public Iterator<T> createIterator() {
        return new CustomStackIterator<>(this);
    }
}
