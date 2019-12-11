package com.julia;

public class Application {

    public static void main(String[] args) {
        AppendPerformanceTester tester = new AppendPerformanceTester();


        OurArray ourArray = new OurArray();
        long time = tester.perform(ourArray, 'a', 10000);
        System.out.println("OurArray: " + time);

        OurArrayList ourArrayList = new OurArrayList();
        time = tester.perform(ourArrayList, 'a', 10000);
        System.out.println("OurArrayList: " + time);

        OurLinkedList ourLinkedList = new OurLinkedList();
        time = tester.perform(ourLinkedList, 'a', 10000);
        System.out.println("OurLinkedList: " + time);

    }
}
