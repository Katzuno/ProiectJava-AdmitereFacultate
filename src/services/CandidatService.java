package services;

import schemes.Candidat;

public class CandidatService implements Candidat {
    private String nume;
    private String prenume;
    private float medie_bac;
    private float medie_examen;
    private float medie_admitere;

    public  CandidatService()
    {


    }
    public CandidatService(String nume, String prenume)
    {
        this.nume = nume;
        this.prenume = prenume;
    }
    public void calcMedieAdmitere() {
        this.medie_admitere = this.medie_bac * 0.2f + this.medie_examen * 0.8f;
    }

    public float getMedie_examen() {
        return this.medie_examen;
    }

    public void setMedie_examen(float medie_examen) {
        this.medie_examen = medie_examen;
    }

    public float getMedie_admitere() {
        return medie_admitere;
    }

    public void setMedie_admitere(float medie_admitere) {
        this.medie_admitere = medie_admitere;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public float getMedie_bac() {
        return medie_bac;
    }

    public void setMedie_bac(float medie_bac) {
        this.medie_bac = medie_bac;
    }
}
