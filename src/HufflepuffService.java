public class HufflepuffService {
    public char isCompareCharacter(Hufflepuff hufflepuffFirst, Hufflepuff hufflepuffSecond) {
        if (hufflepuffFirst.getHardworking() + hufflepuffFirst.getLoyal() + hufflepuffFirst.getHonest()
                > hufflepuffSecond.getHardworking() + hufflepuffSecond.getLoyal() + hufflepuffSecond.getHonest()) {
            return '>';
        }else if (hufflepuffFirst.getHardworking() + hufflepuffFirst.getLoyal() + hufflepuffFirst.getHonest()
                < hufflepuffSecond.getHardworking() + hufflepuffSecond.getLoyal() + hufflepuffSecond.getHonest()) {
            return '<';
        }else {
            return '=';
        }
    }
}
