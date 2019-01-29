package Adapter;

import Adapter.FirstAdapter.AdapteeEmployee;
import Adapter.FirstAdapter.Employee;
import Adapter.FirstAdapter.EmployeeAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main (String[] args)
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"saifeddine","abid","saif.abid@ymail.com"));

        System.out.println(employees.get(0));
        AdapteeEmployee employee2 = new AdapteeEmployee(2,"saif","eddinAbid","saif.123@o.com");
        employees.add(new EmployeeAdapter(employee2));
        Employee employee = new EmployeeAdapter(employee2);
        System.out.println(employees.get(1));
    }


}
