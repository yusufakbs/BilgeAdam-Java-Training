package entityrealations.aggregation;

public class AggregateEmployee {
    private final int id;
    private final String name;
    private final Adress adress;

    public AggregateEmployee(int id, String name, Adress adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
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
}
