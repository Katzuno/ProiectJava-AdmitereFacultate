package schemes;

import services.ExamenService;

import java.util.List;

public interface Facultate {
    public void addExam(ExamenService e);
    public void delExam(ExamenService e);
    public void printExams();
    public List<ExamenService> getExams();
}
