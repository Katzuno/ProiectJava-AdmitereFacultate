package services;

import schemes.Facultate;

import java.util.ArrayList;
import java.util.List;

public class FacultateService implements Facultate {
    List<ExamenService> exams;

    public FacultateService() {
        this.exams = new ArrayList<ExamenService>();
    }

    public void addExam(ExamenService e)    {
        this.exams.add(e);
    }

    public void delExam(ExamenService e)    {
        this.exams.remove(e);
    }

    public void printExams()    {
        this.exams.stream()
                .forEach(element -> System.out.println(element.getExam_name() + " " + element.getExam_date()));
    }

    public List<ExamenService> getExams() {
        return this.exams;
    }
}
