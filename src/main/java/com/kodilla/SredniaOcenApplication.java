package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class SredniaOcenApplication {

    public static void main(String[] args) {
        ArrayList<Integer> listaOcen = new ArrayList<Integer>();
        listaOcen.add(3);
        listaOcen.add(3);
        listaOcen.add(4);
        listaOcen.add(4);
        listaOcen.add(4);
        listaOcen.add(5);
        listaOcen.add(5);
        listaOcen.add(5);
        listaOcen.add(6);

        System.out.println(listaOcen);

        SredUtil obiekt = new SredUtil(listaOcen);

        int indexB = obiekt.wyliczMin();
        int indexE = obiekt.wyliczMax();
        obiekt.removeRow(indexB,indexE);

        double t = obiekt.makeSrednia();


        System.out.println(t);

        obiekt.wyliczMin();
        obiekt.wyliczMax();




    }
  }
