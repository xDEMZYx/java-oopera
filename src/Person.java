import java.util.Objects;

public class Person {
    protected String name;
    protected String surName;
    protected Gender gender;

    public Person(String name, String surName, Gender gender) {
       this.name = name;
       this.surName = surName;
       this.gender = gender;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}
