package jug.java.item18;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class ListDelegate<E> extends AbstractList<E> {
    private final List<E> delegate;

    public ListDelegate(final List<E> delegate) {
        Objects.requireNonNull(delegate);
        this.delegate = delegate;
    }

    @Override
    public E get(int index) {
        return delegate.get(index);
    }

    @Override
    public int size() {
        return delegate.size();
    }
}
