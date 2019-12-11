package com.julia;

public class OurArrayList implements OurInterface {

    Object[] source;
    private static int INITIAL_CAPACITY = 16;
    private int size;             //количество заполненных ячеек в массиве

    public OurArrayList() {
        source = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public void append(Object value) {
        if (source.length == size) {
            Object[] newSource = new Object[source.length * 2];
            System.arraycopy(source, 0, newSource, 0, source.length);
            source = newSource;
        }

        source[size] = value;
        size++;
    }
}