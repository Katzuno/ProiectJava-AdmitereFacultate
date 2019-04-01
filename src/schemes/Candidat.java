package schemes;

public interface Candidat {
    public String getNume();
    public String getPrenume();
    public float getMedie_bac();

    public void setNume(String nume);
    public void setPrenume(String prenume);
    public void setMedie_bac(float medie_bac);
    public void calcMedieAdmitere();
}
