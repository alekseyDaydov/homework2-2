public class GryffindorService {
    public char isCompareCharacter(Gryffindor gryffindorFirst, Gryffindor gryffindorSecond) {
        if (gryffindorFirst.getNobility() + gryffindorFirst.getHonor() + gryffindorFirst.getCourage() >
                gryffindorSecond.getNobility() + gryffindorSecond.getHonor() + gryffindorSecond.getCourage()) {
            return '>';
        } else if (gryffindorFirst.getNobility() + gryffindorFirst.getHonor() + gryffindorFirst.getCourage() <
                gryffindorSecond.getNobility() + gryffindorSecond.getHonor() + gryffindorSecond.getCourage()) {
            return '<';
        } else {
            return '=';
        }
    }
}
