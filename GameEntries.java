package Task3.Q3;

public class GameEntries {
    private String name;
    private int score;

    public GameEntries(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Q3{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
