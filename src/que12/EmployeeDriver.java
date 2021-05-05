/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author S541994
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***Narsing Rao Nikitha Madhari***");

        ArrayList<Employee> employeeList = new ArrayList<>();

        Employee williamEmp = new Employee(109, "William", 1000f);
        Employee emmaEmp = new Employee(103, "Emma", 9000f);
        Employee jenniferEmp = new Employee(106, "Jennifer", 800f);
        Employee jamesEmp = new Employee(101, "James", 100f);
        Employee johnEmp = new Employee(104, "John", 400f);

        employeeList.add(williamEmp);
        employeeList.add(emmaEmp);
        employeeList.add(jenniferEmp);
        employeeList.add(jamesEmp);
        employeeList.add(johnEmp);

        // printing Original list by using enhanced forloop
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee arg0, Employee arg1) {
                Integer i1 = arg0.getEmpId();
                Integer i2 = arg1.getEmpId();
                return i1.compareTo(i2);

            }
        });
        System.out.println("----------------------------------------");
        for (Employee empList : employeeList) {
            System.out.println(empList);
        }

    }
}
