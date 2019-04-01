package particularities;

import services.ExamenService;

public class ExamAutumn extends ExamenService {

    public ExamAutumn(String name) {
        super(name);
    }

    @Override
    public String getExam_name() {
        return super.getExam_name() + " - Sesiune Toamna";
    }

}
