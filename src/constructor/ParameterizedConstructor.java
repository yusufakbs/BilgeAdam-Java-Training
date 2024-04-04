package constructor;

public class ParameterizedConstructor {
    String name;
    String surname;
    int age;
    String gender;

    public ParameterizedConstructor(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }
}
