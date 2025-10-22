public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Виталий","Куликов",Gender.MALE,184);
        Actor actor2 = new Actor("Вадим","Климашин",Gender.MALE,180);
        Actor actor3 = new Actor("Екатерина","Суслова",Gender.FEMALE,163);

        Director musicalDirector = new Director("Юрия","Чинько",Gender.FEMALE,5);
        Director fantasticDirector = new Director("Никита","Титов",Gender.FEMALE,3);

        Person musicAuthor = new Person("Никита","Пряслов",Gender.MALE);
        Person choreographer = new Person("Елена","Кантамирова",Gender.FEMALE);

        Show fantasticShow = new Show("Фантастическое шоу", 100, fantasticDirector);
        Opera operaShow = new Opera("Любовная опера", 120, musicalDirector, musicAuthor,
                "Классическая история о любви", 3 );
        Ballet balletShow = new Ballet("Классический балет", 80, musicalDirector, musicAuthor,
                "Постановка классического балета в хореографии", choreographer);

        fantasticShow.addActor(actor2);
        fantasticShow.addActor(actor1);

        operaShow.addActor(actor2);
        operaShow.addActor(actor3);

        balletShow.addActor(actor1);
        balletShow.addActor(actor3);

        System.out.println("Список актёров в шоу");
        fantasticShow.printListOfActors();
        operaShow.printListOfActors();
        balletShow.printListOfActors();

        System.out.println("Замена актёра в фантастическом шоу");
        fantasticShow.swapActor(actor3, "Куликов");
        fantasticShow.printListOfActors();


        operaShow.swapActor(actor2, "Сидоров");

        System.out.println("Тексты либретто");
        operaShow.printLibrettoText();
        balletShow.printLibrettoText();
    }
}
