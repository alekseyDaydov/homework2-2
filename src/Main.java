//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HogwartsService hogwartsService = new HogwartsService();
        //Гриффиндор
        Gryffindor gryffindorGaryPotter = new Gryffindor("Гарри", "Поттер", 15, 4, 2, 8, 6);
        Gryffindor gryffindorHermioneGranger = new Gryffindor("Гермиона", "Грейнджер", 5, 2, 6, 7, 8);
        Gryffindor gryffindorRonWeasley = new Gryffindor("Рон", "Уизли", 15, 6, 7, 8, 5);

        System.out.println(gryffindorRonWeasley);
        //Слизерине
        Slytherin slytherinDracoMalfoy = new Slytherin("Драко", "Малфой", 34, 56, 78, 23, 89, 90, 10);
        Slytherin slytherinGrahamMontague = new Slytherin("Грэхэм", "Монтегю", 47, 13, 85, 56, 90, 91, 100);
        Slytherin slytherinGregoryGoyle = new Slytherin("Грегори", "Гойл", 47, 13, 85, 56, 90, 91, 100);

        //Пуффендуй
        Hufflepuff hufflepuffZacharySmith = new Hufflepuff("Захария", "Смит", 12, 34, 63, 29, 87);
        Hufflepuff hufflepuffCedricDiggory = new Hufflepuff(" Седрик", "Диггори", 12, 85, 90, 10, 91);
        Hufflepuff hufflepuffJustinFinch = new Hufflepuff("Джастин", "Финч-Флетчли", 62, 84, 65, 54, 87);


        //Когтевран
        Kogtevran kogtevranZhouChang = new Kogtevran("Чжоу", "Чанг", 34, 56, 12, 67, 65, 12);
        Kogtevran kogtevranPadmaPatil = new Kogtevran("Падма", "Патил", 56, 12, 67, 37, 38, 67);
        Kogtevran kogtevranMarcusBelby = new Kogtevran("Маркус", "Белби", 82, 78, 34, 90, 75, 74);

        System.out.println("hufflepuffCedricDiggory = " + hufflepuffCedricDiggory);
        System.out.println("kogtevranMarcusBelby = " + kogtevranMarcusBelby);

        final char compareOperationLarger = '>';
        final char compareOperationLess = '<';
        final char compareOperationEquals = '=';

        char compare = (hogwartsService.isCompareCharacter(hufflepuffCedricDiggory, kogtevranMarcusBelby));
        if (compare == compareOperationLarger) {
            System.out.println("Седриг Диггори обладает большей мощностью магии чем Маркус Белби");
        } else if (compare == compareOperationLess) {
            System.out.println("Маркус Белби обладает большей мощностью магии чем Седриг Диггори");
        } else {
            System.out.println("Магия Маркуса Белби и Седриг Диггори равны");
        }

        GryffindorService gryffindorService = new GryffindorService();
        System.out.println(gryffindorGaryPotter);
        System.out.println(gryffindorRonWeasley);
        compare = gryffindorService.isCompareCharacter(gryffindorGaryPotter, gryffindorRonWeasley);

        if (compare == compareOperationLarger) {
            System.out.println("Гарри Потер лучший Гриффиндорец, чем Рон Уизли");
        } else if (compare == compareOperationLess) {
            System.out.println("Рон Уизли лучший Гриффиндорец, чем Гарри Потер");
        } else {
            System.out.println("Рон Уизли и Гарри Потер равные Гриффиндорцы");
        }

        HufflepuffService hufflepuffService = new HufflepuffService();
        System.out.println(hufflepuffCedricDiggory);
        System.out.println(hufflepuffJustinFinch);
        compare = hufflepuffService.isCompareCharacter(hufflepuffCedricDiggory, hufflepuffJustinFinch);
        if (compare == compareOperationLarger) {
            System.out.println("Седрик Диггори лучший Пуффендуй, чем Джастин Финч-Флетчли");
        } else if (compare == compareOperationLess) {
            System.out.println("Джастин Финч-Флетчли лучший Пуффендуй, чем Седрик Диггори");
        } else {
            System.out.println("Джастин Финч-Флетчли и Седрик Диггори лучшие Пуффендуйцы");
        }

        KogtevranService kogtevranService = new KogtevranService();
        System.out.println(kogtevranMarcusBelby);
        System.out.println(kogtevranPadmaPatil);
        compare = kogtevranService.isCompareCharacter(kogtevranMarcusBelby, kogtevranPadmaPatil);
        if (compare == compareOperationLarger) {
            System.out.println("Маркус  Белби лучший Когтевранец, чем Падма Патил");
        } else if (compare == compareOperationLess) {
            System.out.println("Падма Патил лучший Когтевранец, чем  Маркус  Белби");
        } else {
            System.out.println("Падма Патил и Маркус  Белби лучшие Когтевранцы");
        }

        SlytherinService slytherinService = new SlytherinService();
        System.out.println(slytherinDracoMalfoy);
        System.out.println(slytherinGregoryGoyle);
        compare = slytherinService.isCompareCharacter(slytherinDracoMalfoy, slytherinGregoryGoyle);
        if (compare == compareOperationLarger) {
            System.out.println("Драко Малфой лучший Слизеринец, чем Грегори Гойл");
        } else if (compare == compareOperationLess) {
            System.out.println("Грегори Гойл  лучший Слизеринец, чем Драко Малфой");
        } else {
            System.out.println("Грегори Гойл и Драко Малфой лучшие Слизеринцы");
        }
    }
}