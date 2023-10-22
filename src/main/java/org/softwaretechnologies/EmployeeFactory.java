package org.softwaretechnologies;

import org.softwaretechnologies.employee.*;

import java.time.LocalDate;
import java.time.YearMonth;

public class EmployeeFactory {
    private static class Manager extends Employee {
        EmployeeType type = EmployeeType.Manager;
        public Manager(String name, int baseSalary) {
            super(name, baseSalary);
        }

        @Override
        public int getMonthSalary(int month) {
            if(month%2==0)return baseSalary;
            return baseSalary/2;
        }
    }
    private static class Programer extends Employee{
        EmployeeType type = EmployeeType.Programmer;

        public Programer(String name, int baseSalary) {
            super(name, baseSalary);
        }

        @Override
        public int getMonthSalary(int month) {
            return baseSalary;
        }
    }
    private static class Tester extends Employee{

        public Tester(String name, int baseSalary) {
            super(name, baseSalary);
        }

        @Override
        public int getMonthSalary(int month) {
            return baseSalary* YearMonth.of(LocalDate.now().getYear(),month).lengthOfMonth();
        }
    }
    /**
     * Сначала создайте классы, наследуемые от  {@link  org.softwaretechnologies.employee.Employee Employee} для каждого из значений в EmployeeType.
     * Функция должна создавать и возвращать Employee нужного типа. Тип зависит от значения параметра type.
     *  name имя сотрудника
     *  baseSalary базовая зарплата сотрудника
     *  type тип сотрудника
     * @return созданного сотрудника нужного типа. Тип зависит от параметра type.
     */



    public static Employee createEmployee(String name, int baseSalary, EmployeeType type) {
        // TODO: реализуйте вышеуказанную функцию
        return switch (type){
            case Manager -> new Manager(name,baseSalary);
            case Programmer -> new Programer(name,baseSalary);
            case Tester -> new Tester(name,baseSalary);
        };
    }
}
