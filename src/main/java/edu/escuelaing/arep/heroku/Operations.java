package edu.escuelaing.arep.heroku;

import java.lang.Math;


public class Operations {
    private LinkedList linkedList;

    /**
     * Constructor que inicializa la lista
     */
    public Operations(){
        linkedList = new LinkedList();
    }

    /**
     * Constructor que recibe la linkedlist con los valores indicados
     * @param linkedList tipo LinkedList
     */
    public Operations(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    /**
     *Calcula la media de la LinkedList dada
     * @return mean tipo Double
     */
    public Double mean(){
        LinkedList data = linkedList;
        Double  rest=0.0;
        for(int i=0; i<data.size(); i++){
            rest += data.get(i);
        }
        return (Math.round((rest/ data.size())*100.0)/100.0);
    }

    /**
     * Calcula la desviacion estandar de la LinkedList dada
     * @return stdDev tipo Double
     */
    public Double stdDev(){
        LinkedList data = linkedList;
        Double mean = mean();
        Double numerator = 0.0;
        for(int i=0; i<data.size(); i++){
            numerator+= Math.pow(data.get(i)-mean, 2);
        }
        Double inSide = numerator/(data.size()-1);
        return (Math.round((Math.sqrt(inSide))*100.0)/100.0);
    }

    /**
     * Lee el String json que es la lista de numeros introducida en la web y
     * asigna sus valores a la LinkedList
     * @param json de tipo String
     */
    public void readJSON (String json) {
        linkedList = new LinkedList();
        String[] webList = json.replace("\"", "").replace("]", "").replace("[", "").split(",");
        for (int i = 0; i < webList.length; i++) {
            double value = Double.parseDouble(webList[i]);
            linkedList.addNode(value);
        }
    }
}
