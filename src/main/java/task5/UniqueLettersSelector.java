package task5;

import java.util.List;
import java.util.stream.Stream;

public class UniqueLettersSelector {
    public static void main(String[] args) {
        List<String> wordsList = List.of("Napisz", "program", "który", "dla", "zadanej", "listy",
                "słów", "wyświetla", "występujące", "w", "nich", "litery", "Wyświetlone", "litery", "muszą",
                "być", "zapisane", "dużymi", "literami", "oraz", "być", "unikalne");
        List<String> letters = wordsList.stream()
                .flatMap(l-> Stream.of((l.toUpperCase()).split("")))
                .distinct()
                .toList();
        System.out.println(letters);
    }
}