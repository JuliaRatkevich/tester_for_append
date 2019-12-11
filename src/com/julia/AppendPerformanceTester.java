package com.julia;

public class AppendPerformanceTester {

    public long perform(OurInterface test, Object element, int count) {
        long now = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            test.append(element);
        }
        return System.currentTimeMillis() - now;
    }

}
