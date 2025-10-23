import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printListOfActors() {
        System.out.println("Представление: " + title + "\nСписок актеров: ");
        for (Actor actors : listOfActors) {
            System.out.println(actors);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)){
            System.out.println("Такой актер уже есть!");
            return;
        }
        listOfActors.add(actor);
        System.out.println("Актер: " + actor + " добавлен в шоу: " + title);
    }

    public void swapActor(Actor newActor, String surNameOldActor) {
        if (surNameOldActor.isEmpty()) {
            System.out.println("Фамилия не может быть пустой");
            return;
        }

        Actor actorToReplace = null;
        for (Actor actor : listOfActors) {
            if (actor.getSurName().equals(surNameOldActor)) {
                actorToReplace = actor;
                break;
            }
        }

        if (actorToReplace != null) {
            listOfActors.remove(actorToReplace);
            listOfActors.add(newActor);
            System.out.println("Актер " + actorToReplace.getName() + " " + actorToReplace.getSurName() +
                    " заменён на " + newActor.getName() + " " + newActor.getSurName() +
                    " в шоу: " + title);
        } else {
            System.out.println("Актёр с фамилией \"" + surNameOldActor +
                    "\" не найден в шоу: " + title);
        }
    }
}