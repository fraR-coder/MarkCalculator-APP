package com.example.login;

public class Linea {

    private String nGiuste,nSbagliate,nBianche;
    private String punti;

    public Linea(String nG,String nS,String nB,String p) {
        this.nGiuste=nG;
        this.nSbagliate=nS;
        this.nBianche=nB;
        this.punti=p;
    }



    @Override
    public String toString() {
        return "Linea{" +
                "nGiuste=" + nGiuste +
                ", nSbagliate=" + nSbagliate +
                ", nBianche=" + nBianche +
                ", punti='" + punti + '\'' +
                '}';
    }

    public String getnBianche() {
        return nBianche;
    }
    public String getnGiuste() {
        return nGiuste;
    }
    public String getnSbagliate() {
        return nSbagliate;
    }
    public String getPunti() {
        return punti;
    }


}
