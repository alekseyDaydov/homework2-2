import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning;//хитрость,
    private int determination;// решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int thirstForPower; // жажда власти

    public Slytherin(String firstName, String lastName, int conjure, int lustForPower, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(firstName, lastName, conjure, lustForPower);
        if (isCharacterTrait(cunning) || isCharacterTrait(determination) || isCharacterTrait(ambition) || isCharacterTrait(resourcefulness) || isCharacterTrait(thirstForPower)) {
            throw new IllegalArgumentException("Введите корректное значение свойства от 0 до 100");
        }
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (isCharacterTrait(cunning)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Хитрость");
        }
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (isCharacterTrait(determination)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Решительность");
        }
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (isCharacterTrait(ambition)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Амбициозность");
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (isCharacterTrait(resourcefulness)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Находчивость");
        }
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        if (isCharacterTrait(thirstForPower)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Жажда власти");
        }
        this.thirstForPower = thirstForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, thirstForPower);
    }

    @Override
    public String toString() {
        return super.toString() + ". Факультет  Слизерин: Хитрость" + cunning +
                " Решительность " + determination +
                " Амбициозность" + ambition +
                " Находчивость=" + resourcefulness +
                " Жажда власти" + thirstForPower;
    }
}
