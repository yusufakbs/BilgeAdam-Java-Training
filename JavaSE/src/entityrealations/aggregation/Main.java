package entityrealations.aggregation;

import entityrealations.aggregation.Adress;
import entityrealations.aggregation.AggregateEmployee;

public class Main {
    public static void main(String[] args) {
        Adress adress = new Adress("2037","Ankara");
        System.out.println(adress);

        AggregateEmployee aggregateEmployee = new AggregateEmployee(1,"Yusuf",new Adress("2034","2322"));
        System.out.println(aggregateEmployee);






    }
}
