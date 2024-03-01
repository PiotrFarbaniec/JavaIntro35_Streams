package task3;

public class CinemaHall {
    private String type;
    private CinemaHallName name;

    public CinemaHall() {}

    public CinemaHall(CinemaHallName name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public CinemaHallName getName() {
        return name;
    }
}