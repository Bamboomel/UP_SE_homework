import java.util.Arrays;
import java.util.ArrayList;

public class Student extends Person implements Noten{

        private int matnr;
        private StudyProgram studyProgram;

        private ArrayList<Float> grades = new ArrayList<>();
        private float finalGrade;
        float[] validGrades = {1.0F, 1.3F, 1.7F, 2.0F, 2.3F, 2.7F, 3.0F, 3.3F, 3.7F, 4.0F, 4.3F, 4.7F, 5.0F};

        Student(String fn, String n, Date d, Gender g, int m, StudyProgram s) {
                super(fn, n, d, g);
                if (validateMatnr(m) == true) { //((m - 100000) >= 0 && (m - 1000000) < 0) {
                        this.matnr = m;
                        this.studyProgram = s;
                } else {
                        System.err.println("matriculation number invalid"); }
        }

        public boolean validateMatnr(int matnr){
                if ((matnr - 100000) >= 0 && (matnr - 1000000) < 0) {
                        return true;
                }
                return false;
        }

        public boolean validateGrade(float grade){
                return Arrays.asList(validGrades).contains(Float.toString(grade));
        }

        public void addGrade(ArrayList<Float> grades, float grade){
                if (validateGrade(grade) == true) {
                        grades.add(grade);
                }
        }
        public float calculateFinalGrade(ArrayList<Float> grades){
                int count = grades.size();
                float sum = 0;
                for (int i = 0; i < count; i++){
                        float tmp = grades.get(i);
                        sum = sum + tmp;
                }
                finalGrade = sum / count;
                return finalGrade;
        }

        public void show(){
                super.show();
                System.out.println("matrnr.: " + this.matnr);
                System.out.println("studyprogram: " + this.studyProgram);
                System.out.println("final grade: " + finalGrade);
                System.out.println("grade overview: " + grades.toString());
        }

}
