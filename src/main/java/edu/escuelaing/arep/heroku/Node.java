package edu.escuelaing.arep.heroku;

public class Node {
    public double data;
    public Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Obtiene el valor del nodo
     * @return valor del nodo tipo Double
     */
    public Double getData(){
        return this.data;
    }

    /**
     * Obtiene el siguiente nodo
     * @return siguiente nodo tipo Node
     */
    public Node getNextNode(){
        return next;
    }

}

