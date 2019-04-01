import particularities.CandidatAutumn;
import particularities.ExamAutumn;
import services.CandidatService;
import services.ExamenService;
import services.FacultateService;



public class Main {
    public static void main(String[] args)
    {
        CandidatService c1, c2, c3, c4t;
        ExamenService e1, e2, e3t;
        FacultateService fmi;

        c1 = new CandidatService("Pazvante", "Chioru");
        c2 = new CandidatService();
        c3= new CandidatService();
        c4t = new CandidatAutumn();

        e1 = new ExamenService("Info");
        e2 = new ExamenService("Mate");
        e3t = new ExamAutumn("Info");

        fmi = new FacultateService();

        c1.setMedie_bac(9.81f);
        c1.setMedie_examen(9.0f);
        c1.calcMedieAdmitere();

        c2.setNume("Popescu2");
        c2.setPrenume("Ion2");
        c2.setMedie_bac(6.81f);
        c2.setMedie_examen(5.0f);
        c2.calcMedieAdmitere();

        c3.setNume("Popescu3");
        c3.setPrenume("Ion3");
        c3.setMedie_bac(7.51f);
        c3.setMedie_examen(7.0f);
        c3.calcMedieAdmitere();

        c4t.setNume("George");
        c4t.setPrenume("Arabescu");
        c4t.setMedie_bac(4.71f);
        c4t.setMedie_examen(4.0f);
        c4t.calcMedieAdmitere();

        e1.addCandidat(c1);
        e1.addCandidat(c2);
        System.out.println("\nCANDIDATI Examen E1:");
        e1.printCandidati();

        e2.addCandidat(c3);
        System.out.println("\nCANDIDATI Examen E2:");
        e2.printCandidati();

        e3t.addCandidat(c4t);
        System.out.println("\nCANDIDATI Examen E3T");
        e3t.printCandidati();


        fmi.addExam(e1);
        fmi.addExam(e2);
        System.out.println("\n Examene FMI: ");
        fmi.printExams();

        fmi.delExam(e1);
        System.out.println("\n Examene FMI: ");
        fmi.printExams();


    }
}
