package com.julia;

public class OurLinkedList implements OurInterface {
    private int size;
    Node first;
    Node last;

    OurLinkedList() {
    }

    @Override
    public void append(Object value) {
        if (size == 0) {
            addFirst(value);
            return;
        }

        // 0. Оборачиваем value в объект Node что-бы иметь как значение (node.value) так
        // и возможность установить ссылки на следующий (node.next) за ним объект,
        // так и на предыдущий (node.prev) объект
        Node nodeToAdd = new Node();
        nodeToAdd.value = value;

        // 1. Указываем текущему последнему объекту что начиная с текущего момента
        // за ним будет следовать еще один объект (тот что необходимо добавить)
        last.next = nodeToAdd;

        //2. Нашему новому объекту нужно сказать что за ним находится последний объект
        nodeToAdd.prev = last;

        //3.

        //4. Заменяем последний в списке объект на только что добавленный
        // т.к. он становиться последним в этом самом списке
        last = nodeToAdd;

        //5. Обновляем значение размера листа = +1
        size++;
    }

    private void addFirst(Object value) {
        Node newNode = new Node();
        newNode.value = value;

        first = newNode;
        last = newNode;
        size++;
    }

    private static class Node {
        Node next;
        Node prev;
        Object value;

        Node() {

        }

        Node(Node next, Node prev, Object value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }
}
