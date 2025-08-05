import java.util.Objects;

public class Hufflepuff extends Hogwarts {

    private int hardworking; // трудолюбивы,
    private int loyal; // верны
    private int honest; // честны.

    public Hufflepuff(String firstName, String lastName, int conjure, int lustForPower, int honest, int hardworking, int loyal) {
        super(firstName, lastName, conjure, lustForPower);
        this.honest = honest;
        this.hardworking = hardworking;
        this.loyal = loyal;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return hardworking == that.hardworking && loyal == that.loyal && honest == that.honest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardworking, loyal, honest);
    }

    @Override
    public String toString() {
        return "Пуффендуй: Трудолюбивы: " + hardworking +
                " Верны" + loyal +
                " Честны=" + honest;
    }
}
