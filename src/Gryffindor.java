import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility; //    благородство,
    private int honor; //  честь
    private int courage; //  храбрость.

    public Gryffindor(String firstName, String lastName, int conjure, int lustForPower, int nobility, int honor, int courage) {
        super(firstName, lastName, conjure, lustForPower);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (isCharacterTrait(nobility)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Благородство");
        }
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (isCharacterTrait(honor)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Честь");
        }
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        if (isCharacterTrait(courage)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Храбрость");
        }
        this.courage = courage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && courage == that.courage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, courage);
    }

    @Override
    public String toString() {
        return super.toString() + ". Факультет Гриффиндор: Благородство: " + nobility +
                " Честь: " + honor +
                " Храбрость: " + courage;
    }
}
