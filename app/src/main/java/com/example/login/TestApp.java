package com.example.login;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestApp {
    double punti;
    double giusta=3;
    double sbagliata=-0.5;
    double bianca=0;
    int N=30;
    double soglia=18;
    private int K=3;

    ArrayList<Linea> elencoLinee=new ArrayList<>();


    private int pos,start, count;
    private double[] val,sol;

    public int getN() {
        return N;
    }
    public int getK() {
        return K;
    }



    public TestApp(double giusta, double sbagliata, double bianca, int N, double soglia) {
        this.giusta = giusta;
        this.sbagliata = sbagliata;
        this.bianca = bianca;
        this.N = N;
        this.soglia = soglia;




        this.val = new double[K];
        val[0]=giusta;
        val[1]=sbagliata;
        val[2]=bianca;
        this.sol =new double[N];

        elencoLinee.add(new Linea("giuste","sbagliate","bianche","punti"));
    }


    public void setN(int n) {
        N = n;
    }

    public double getSoglia() {
        return soglia;
    }

    public void setSoglia(double soglia) {
        this.soglia = soglia;
    }

    public double getGiusta() {
        return giusta;
    }

    public void setGiusta(double giusta) {
        this.giusta = giusta;
    }

    public double getSbagliata() {
        return sbagliata;
    }



    public void setSbagliata(double sbagliata) {
        this.sbagliata = sbagliata;
    }

    public double getBianca() {
        return bianca;
    }

    public void setBianca(double bianca) {
        this.bianca = bianca;
    }

    private double calcola_punti(int numero_giuste, int numero_sbagliate, int numero_bianche){
        return ((numero_bianche*bianca)+(numero_giuste*giusta)+(numero_sbagliate*sbagliata));
    }

    private void stampa_punteggi(int numero_giuste, int numero_sbagliate, int numero_bianche,double punti){
        if(punti>=soglia){
            System.out.println(numero_giuste+"              "
                    +numero_sbagliate+"                   "
                    + numero_bianche+"                       ("+
                    punti+")");
        }
    }

    int comb_ripet(int pos, double []val, double []sol, int n, int start,int count) {
        int i;
        if (pos >= n) {

            int a=0;
            int b=0;
            int c=0;

            for (i=0; i<n; i++){
                if(sol[i]==giusta) a++;
                if(sol[i]==sbagliata) b++;
                if(sol[i]==bianca) c++;
            }
            punti=calcola_punti(a,b,c);

            if(punti>=soglia)
                elencoLinee.add(new Linea(String.valueOf(a),String.valueOf(b),String.valueOf(c),String.valueOf(punti)));
            //stampa_punteggi(a,b,c,punti);


            return count+1;
        }


        for (i=start; i<K; i++) {

            sol[pos] = val[i];
            count = comb_ripet(pos+1, val, sol, n, start,count);
            start++;
        }
        return count;
    }

    public ArrayList<Linea> getElencoLinee() {
        return elencoLinee;
    }

    public void prova(){

        comb_ripet(pos, val, sol, N, start, count);


    }
}
