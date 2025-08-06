import java.util.Objects;

public class Hogwarts {
    private String firstName;
    private String lastName;
    private int conjure; // колдовать
    private int lustForPower; // жажда власти.

    public Hogwarts(String firstName, String lastName, int conjure, int lustForPower) {
        if (isCharacterTrait(conjure) || isCharacterTrait(lustForPower)) {
            throw new IllegalArgumentException("Введите корректное значение свойства от 0 до 100");
        }
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Поле Имя или Фималия не должно быть пустыми");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.conjure = conjure;
        this.lustForPower = lustForPower;
    }

    protected boolean isCharacterTrait(int number) {
        return (number < 0 || number > 100);
    }

    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        if (isCharacterTrait(conjure)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Колдовства");
        }
        this.conjure = conjure;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        if (isCharacterTrait(lustForPower)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Жажда власти");
        }
        this.lustForPower = lustForPower;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return conjure == hogwarts.conjure && lustForPower == hogwarts.lustForPower && Objects.equals(firstName, hogwarts.firstName) && Objects.equals(lastName, hogwarts.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, conjure, lustForPower);
    }

    @Override
    public String toString() {
        return "Хогвартс: Имя: " + firstName +
                "; Фамилия: " + lastName +
                "; Колдовства: " + conjure +
                "; Жажда власти: " + lustForPower;
    }
}
