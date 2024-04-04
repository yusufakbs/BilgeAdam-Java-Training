package constructor;

public class Main {
//    private String name;
//    public Main() {
//        System.out.println("Constructor called.");
//        name = "Constructor name field.";
//    }

    public static void main(String[] args) {
//        Main obj = new Main();
//        System.out.println("The name is:" + obj.name);
//        Main obj2 = new Main();
//        System.out.println("The name is:" + obj2.name);
//        NoArgsConstructor test = new NoArgsConstructor();
//        test.name = "Yusuf";
//        test.surname = "Akbaş";
//        System.out.println("Name:" + test.name + "\nSurname:" + test.surname + "\nCountry:" + test.country);
//        System.out.println("------------------------------");
//        NoArgsConstructor test2 = new NoArgsConstructor();
//        test2.name = "Lulu";
//        test2.surname= "Qwe";
//        test2.country = "India";
//        System.out.println("Name:" + test2.name + "\nSurname:" + test2.surname + "\nCountry:" + test2.country);
//        System.out.println("------------------------------");
//        NoArgsConstructor test3 = new NoArgsConstructor();
//        test3.name = "Jack";
//        test3.surname = "London";
//        test3.country = "ABD";
//        System.out.println("Name:"+test3.name+ "\nSurname:"+ test3.surname+"\nCountry:" + test3.country);

        ParameterizedConstructor parameterizedConstructor1 = new ParameterizedConstructor(23,"Male");
        parameterizedConstructor1.name = "Yusuf";
        parameterizedConstructor1.surname = "Akbaş";
        System.out.println("Name:" + parameterizedConstructor1.name + "\nSurname:" + parameterizedConstructor1.surname +
                "\nGender:" + parameterizedConstructor1.gender + "\nAge:" + parameterizedConstructor1.age);

        System.out.println("-------------------------");

        ParameterizedConstructor parameterizedConstructor2 = new ParameterizedConstructor(29,"Female");
        parameterizedConstructor2.name = "Burçin";
        parameterizedConstructor2.surname = "Atak";
        System.out.println("Name:" + parameterizedConstructor2.name + "\nSurname:" + parameterizedConstructor2.surname +
                "\nGender:" + parameterizedConstructor2.gender + "\nAge:" + parameterizedConstructor2.age);


    }
}
