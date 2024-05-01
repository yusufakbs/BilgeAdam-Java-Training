package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTest03 {
    public static void main(String[] args) {
        Function<Employee,String> employeeStringFunction = e -> e.getName();
        Employee emp = new Employee("Yusuf",23);
        System.out.println(employeeStringFunction.apply(emp));

    }
}
