import java.util.ArrayList;

public interface Noten {
    /*
        Die Aufgabe beschreibt:
        "Erstellen Sie für diese Teilaufgabe ein entsprechendes Interface Noten welches die Einzelnoten,
        die Gesamtnote und alle relevanten Methoden enthält"

        ANNAHME:
        Da Attribute in einem Interface nur sinnvoll verwendet werden können, wenn sie einen definierten Wert haben,
        werden in diesem Interface keine Attribute angelegt, sondern lediglich alle notwendigen Methoden
        zur Interaktion mit diesen Attributen.
        Die Frage dazu wurde am 22.12.2023 im Moodle Forum gestellt, aber nicht beantwortet.
        Darum berufe ich mich bei der Bearbeitung dieser Aufgabe auf diese Annahme.
     */

    boolean validateGrade(float grade);
    void addGrade(ArrayList<Float> grades, float grade);
    float calculateFinalGrade(ArrayList<Float> grades);



}
