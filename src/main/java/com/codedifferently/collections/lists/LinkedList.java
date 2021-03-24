package com.codedifferently.collections.lists;

public interface LinkedList<E> {
    public Node<E> insertAtStart();
    Node<E> insertAfter();
    Node<E> insertAtEnd();
    Node<E> containsValue();
    Boolean isEmpty();
    Node<E> removeOccurrence();

}
