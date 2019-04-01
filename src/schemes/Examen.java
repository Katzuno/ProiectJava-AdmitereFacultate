package schemes;

import services.CandidatService;

import java.util.Date;
import java.util.Set;

public interface Examen {
    public String getExam_name();
    public void setExam_name(String exam_name);
    public Date getExam_date();
    public void setExam_date(Date exam_date);
    public void addCandidat(CandidatService x);
    public void delCandidat(CandidatService x);
    public void printCandidati();
    public Set<CandidatService> getCandidati();
}
