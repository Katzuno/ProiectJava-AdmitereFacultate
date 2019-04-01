package particularities;

import services.CandidatService;

public class CandidatAutumn extends CandidatService {
    @Override
    public void calcMedieAdmitere() {
        super.setMedie_admitere(super.getMedie_examen());
    }

}
