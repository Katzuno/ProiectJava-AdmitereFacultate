package services;

import com.sun.source.tree.TryTree;
import schemes.Candidat;
import schemes.Examen;

import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;


public class ExamenService implements Examen {
    private Set<CandidatService> candidati;
    private Date exam_date;
    private String exam_name;

    public ExamenService() {
        this.candidati = new TreeSet<CandidatService>(Comparator.comparing(CandidatService::getMedie_admitere).reversed());
        this.exam_date = new Date(); // TODO: Preluata data din stringul parametru
    }

    public ExamenService(String name) {
        this.exam_name = name;
        this.candidati = new TreeSet<CandidatService>(Comparator.comparing(CandidatService::getMedie_admitere).reversed());
        this.exam_date = new Date();// TODO: Preluata data din stringul parametru
    }

    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }

    public Date getExam_date() {
        return exam_date;
    }

    public void setExam_date(Date exam_date) {
        this.exam_date = exam_date;
    }

    public void addCandidat(CandidatService x) {
        try {
            this.candidati.add(x);
        } catch (NullPointerException e) {
            System.out.println("Candidat invalid - NULL");
        }
    }

    public void delCandidat(CandidatService x) {
        this.candidati.remove(x);
    }

    public void printCandidati() {
        try {
            this.candidati.stream()
                    .forEach(element -> System.out.println(element.getNume() + " " + element.getPrenume() + " " + element.getMedie_admitere()));
        } catch (NullPointerException e) {
            System.out.println("Nu exista nici un candidat valid. Toti sunt NULL");
        }
    }

    public Set<CandidatService> getCandidati() {
        return this.candidati;
    }
}
