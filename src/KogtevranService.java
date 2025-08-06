public class KogtevranService {
    public char isCompareCharacter(Kogtevran kogtevranFirst, Kogtevran kogtevranSecond) {
        if (kogtevranFirst.getSmart() + kogtevranFirst.getWise()+ kogtevranFirst.getWitty()+kogtevranFirst.getFullOfCreativity()
                > kogtevranSecond.getSmart() + kogtevranSecond.getWise()+ kogtevranSecond.getWitty()+kogtevranSecond.getFullOfCreativity()) {
            return '>';
        }else if (kogtevranFirst.getSmart() + kogtevranFirst.getWise()+ kogtevranFirst.getWitty()+kogtevranFirst.getFullOfCreativity()
                < kogtevranSecond.getSmart() + kogtevranSecond.getWise()+ kogtevranSecond.getWitty()+kogtevranSecond.getFullOfCreativity()) {
            return '<';
        }else {
            return '=';
        }
    }
}
