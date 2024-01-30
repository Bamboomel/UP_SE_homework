import java.util.ArrayList;
import java.util.List;

// Klasse zur Erstellung eines anpassbaren Liedes
public class CustomizableSong {

	private List<String> animals; // Liste, die die Tiere speichert

	// Konstruktor, der eine Liste von Tieren entgegennimmt
	public CustomizableSong(List<String> animals) {
		this.animals = animals;
	}

	// Methode zur Generierung des Liedtextes basierend auf der Liste der Tiere
	private String createSong() {
		// Überprüfen, ob die Liste leer oder nicht vorhanden ist
		if (animals == null || animals.isEmpty()) {
			return "No animals provided for the song.";
		}

		StringBuilder song = new StringBuilder();
		// Schleife, die durch jedes Tier in der Liste iteriert
		for (int i = 0; i < animals.size(); i++) {
			// Hinzufügen des Textes für jedes Tier
			song.append("There was an old lady who swallowed a ")
					.append(animals.get(i)).append(";\n");

			// Spezieller Fall für das erste Tier in der Liste
			if (i == 0) {
				song.append("I don't know why she swallowed a ")
						.append(animals.get(i)).append(" - perhaps she'll die!\n\n");
			} else {
				// Schleife für den Text, der die Kettenreaktion der geschluckten Tiere zeigt
				for (int j = i; j > 0; j--) {
					song.append("She swallowed the ")
							.append(animals.get(j))
							.append(" to catch the ")
							.append(animals.get(j - 1))
							.append(",\n");
				}
				song.append("I don't know why she swallowed a ")
						.append(animals.get(0)).append(" - perhaps she'll die!\n\n");
			}
		}

		// Abschluss des Liedes
		song.append("There was an old lady who swallowed a horse...\n")
				.append("...She's dead, of course!");

		return song.toString();
	}

	// Hauptmethode zum Ausführen des Programms
	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		// Beispielhafte Liste von Tieren, kann vom Kunden angepasst werden
		animals.add("fly");
		animals.add("spider");
		animals.add("bird");
		animals.add("cat");
		animals.add("dog");
		animals.add("cow");

		// Erstellen eines neuen CustomizableSong-Objekts und Ausgeben des Liedes
		CustomizableSong song = new CustomizableSong(animals);
		System.out.println(song.createSong());
	}
}
