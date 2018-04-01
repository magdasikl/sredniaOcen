package com.kodilla;

import java.util.ArrayList;

public class SredUtil {
    private ArrayList<Integer> tablicaOcen;
    public SredUtil(ArrayList<Integer> tablicaOcen){
        this.tablicaOcen = tablicaOcen;
        System.out.println(tablicaOcen);
    }

    public double makeSrednia(){
        int suma = 0;
        double sredniaArytm = 0;
        for(int n =0; n<tablicaOcen.size(); n++ ){
            suma = suma + tablicaOcen.get(n);

        }
        sredniaArytm = suma / tablicaOcen.size();
        System.out.println(suma);
        return sredniaArytm;

    }

    public void removeRow(int indexBeg, int indexEnd){
        tablicaOcen.remove(indexEnd);
        tablicaOcen.remove(indexBeg);
        System.out.println(tablicaOcen);
    }

    public int wyliczMin() {
        int euqelMin = 6;
        int indeksMin = 0;


        for(int i=0; i < tablicaOcen.size(); i++) {

            if(euqelMin > tablicaOcen.get(i)){
                euqelMin = tablicaOcen.get(i);
                indeksMin = i;
            }
        }

        System.out.println("ocena najniższa " + euqelMin + " jej indeks " + indeksMin );
        return indeksMin;

    }

    public int wyliczMax() {
        int euqelMax = 0;
        int indexMax = 100;

        for (int i = 0; i < tablicaOcen.size(); i++) {
            if (euqelMax < tablicaOcen.get(i)) {
                euqelMax = tablicaOcen.get(i);
                indexMax = i;
            }

        }
        System.out.println("cena najwyższa " + euqelMax + " jej indeks " + indexMax);
        return indexMax;


    }


}
