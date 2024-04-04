package constructor;

public class NoArgsConstructor {
    String name;
    String surname;
    String country;


    public NoArgsConstructor(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public NoArgsConstructor() {
        country = "Turkey";
    }

}
