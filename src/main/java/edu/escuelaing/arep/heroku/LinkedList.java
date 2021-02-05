package edu.escuelaing.arep.heroku;

public class LinkedList {

    public static Node head = null;
    public Node tail = null;

    /**
     * Agrega el nuevo elemento al nodo
     * @param data tipo double
     */
    public void addNode(double data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * Calcula la longitud de nuestra LinkedList
     * @return size tipo int
     */
    public int size() {
        int size = 0;
        if (head != null) {
            size++;
            Node next = head.getNextNode();
            while (next != null) {
                size++;
                next = next.getNextNode();
            }
        }
        return size;
    }

    /**
     * Obtiene el valor de una posicion especifica de la LinkedList
     * @param index tipo int
     * @return get tipo Double
     */
    public Double get(int index) {
        if (head != null) {
            if (index == 0) {
                return head.getData();
            } else {
                int i = 0;
                Node next = head.getNextNode();
                Double value = null;
                while (i != index) {
                    i++;
                    value = next.getData();
                    next = next.getNextNode();
                }
                return value;
            }
        } else {
            return null;
        }
    }
}
