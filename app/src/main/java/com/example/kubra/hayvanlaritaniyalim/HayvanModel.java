package com.example.kubra.hayvanlaritaniyalim;
public class HayvanModel {

    private int hayvanFotoId,sesDosyasıId;
    private String hayvanIsmi;

    public HayvanModel(int hayvanFotoId, int sesDosyasıId, String hayvanIsmi) {
        this.hayvanFotoId = hayvanFotoId;
        this.sesDosyasıId = sesDosyasıId;
        this.hayvanIsmi = hayvanIsmi;
    }

    public int getHayvanFotoId() {
        return hayvanFotoId;
    }

    public void setHayvanFotoId(int hayvanFotoId) {
        this.hayvanFotoId = hayvanFotoId;
    }

    public int getSesDosyasıId() {
        return sesDosyasıId;
    }

    public void setSesDosyasıId(int sesDosyasıId) {
        this.sesDosyasıId = sesDosyasıId;
    }

    public String getHayvanIsmi() {
        return hayvanIsmi;
    }

    public void setHayvanIsmi(String hayvanIsmi) {
        this.hayvanIsmi = hayvanIsmi;
    }
}
