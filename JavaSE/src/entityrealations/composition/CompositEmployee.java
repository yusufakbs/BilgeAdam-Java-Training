package entityrealations.composition;

import entityrealations.aggregation.Adress;

public class CompositEmployee {
    private final int id;
    private final String name;
    private final Adress adress;

    public CompositEmployee(int id, String name, String street, String city) {
        this.id = id;
        this.name = name;
        this.adress = new Adress(street,city);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Adress getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "AggregateEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }
//
//    private static class Adress {
//        private final String street;
//        private final String city;
//
//        public Adress(String street, String city) {
//            this.street = street;
//            this.city = city;
//        }
//
//        public String getStreet() {
//            return street;
//        }
//
//        public String getCity() {
//            return city;
//        }
//
//        @Override
//        public String toString() {
//            return "Adress{" +
//                    "street='" + street + '\'' +
//                    ", city='" + city + '\'' +
//                    '}';
//        }
//    }
}
