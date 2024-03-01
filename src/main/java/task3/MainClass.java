package task3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<CinemaHall> hallList = List.of(
                new CinemaHall(CinemaHallName.SUPER_NOVA, "3D"),
                new CinemaHall(CinemaHallName.SUPER_NOVA, "4D"),
                new CinemaHall(CinemaHallName.DIAMOND, "2D"),
                new CinemaHall(CinemaHallName.DIAMOND, "3D"),
                new CinemaHall(CinemaHallName.DIAMOND, "4D"),
                new CinemaHall(CinemaHallName.PLATINIUM, "2D"),
                new CinemaHall(CinemaHallName.PLATINIUM, "3D"),
                new CinemaHall(CinemaHallName.PLATINIUM, "4D"),
                new CinemaHall(CinemaHallName.GOLD, "2D"),
                new CinemaHall(CinemaHallName.GOLD, "3D")
        );
        Map<String, List<CinemaHall>> hallsByType = hallList.stream()
                .collect(Collectors.groupingBy(CinemaHall::getType));
        hallsByType.forEach((type, hallName)->{
            System.out.println("Type: " + type + ", Hall number: " + hallName.size());
        });
    }
}