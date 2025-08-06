public class SlytherinService {
    public char isCompareCharacter(Slytherin slytherinFirst, Slytherin slytherinSecond) {
        if (slytherinFirst.getCunning() + slytherinFirst.getDetermination() + slytherinFirst.getAmbition() + slytherinFirst.getResourcefulness()
                + slytherinFirst.getThirstForPower() > slytherinSecond.getCunning() + slytherinSecond.getDetermination()
                + slytherinSecond.getAmbition() + slytherinSecond.getResourcefulness() + slytherinSecond.getThirstForPower()) {
            return '>';
        } else if (slytherinFirst.getCunning() + slytherinFirst.getDetermination() + slytherinFirst.getAmbition() + slytherinFirst.getResourcefulness()
                + slytherinFirst.getThirstForPower() < slytherinSecond.getCunning() + slytherinSecond.getDetermination()
                + slytherinSecond.getAmbition() + slytherinSecond.getResourcefulness() + slytherinSecond.getThirstForPower()) {
            return '<';
        } else {
            return '=';
        }
    }
}
