import java.util.Objects;

public class Kogtevran extends Hogwarts {
    private int smart; //умны
    private int wise; // мудры
    private int witty; //остроумны
    private int fullOfCreativity; //полны творчества

    public Kogtevran(String firstName, String lastName, int conjure, int lustForPower, int smart, int wise, int witty, int fullOfCreativity) {
        super(firstName, lastName, conjure, lustForPower);
        if (isCharacterTrait(smart) || isCharacterTrait(wise) || isCharacterTrait(witty) || isCharacterTrait(fullOfCreativity)) {
            throw new IllegalArgumentException("Введите корректное значение свойства от 0 до 100");
        }
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        if (isCharacterTrait(smart)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Умны");
        }
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        if (isCharacterTrait(wise)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Мудры");
        }
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        if (isCharacterTrait(witty)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Остроумны");
        }
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        if (isCharacterTrait(fullOfCreativity)) {
            throw new IllegalArgumentException("Введите корректное значение свойство Полны творчества");
        }
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kogtevran kogtevran = (Kogtevran) o;
        return smart == kogtevran.smart && wise == kogtevran.wise && witty == kogtevran.witty && fullOfCreativity == kogtevran.fullOfCreativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), smart, wise, witty, fullOfCreativity);
    }

    @Override
    public String toString() {
        return super.toString() +  ". Факультет Когтевранцы : Умны " + smart +
                " Мудры " + wise +
                " Остроумны " + witty +
                " Полны творчества " + fullOfCreativity;
    }
}
