public class HogwartsService {

    public char isCompareCharacter(Hogwarts hogwartsFirst, Hogwarts hogwartsSecond) {
        if (hogwartsFirst.getConjure() + hogwartsFirst.getLustForPower() > hogwartsSecond.getConjure() + hogwartsSecond.getLustForPower()) {
            return '>';
        }else if ((hogwartsFirst.getConjure() + hogwartsFirst.getLustForPower() < hogwartsSecond.getConjure() + hogwartsSecond.getLustForPower()) ) {
            return '<';
        }else {
            return '=';
        }
    }
}
