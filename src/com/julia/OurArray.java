package com.julia;

public class OurArray implements OurInterface {
    private Object[] source;

    public OurArray() {
        source = new Object[0];
    }

    @Override
    public void append(Object value) {
        int newSize = source.length + 1;
        Object[] result = new Object[newSize];
        for (int i = 0; i < source.length; i++) {
            result[i] = source[i];
        }
        result[newSize - 1] = value;
        source = result;
    }
}
