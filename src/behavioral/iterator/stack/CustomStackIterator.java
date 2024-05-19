package behavioral.iterator.stack;

import behavioral.Iterator.Iterator;

public class CustomStackIterator<T> implements Iterator<T> {
    private final CustomStack<T> customStack;
    private int index;

    public CustomStackIterator(CustomStack<T> customStack) {
        this.customStack = customStack;
        this.index = customStack.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public T next() {
        if(this.hasNext()) {
          return customStack.getItemAt(index--);
        }
        return null;
    }
}
