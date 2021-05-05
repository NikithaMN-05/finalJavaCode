/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que12;

/**
 *
 * @author S541994
 */
import java.util.Comparator;

public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee employeeOne, Employee employeeTwo) {
		return employeeOne.getEmpName().compareTo(employeeTwo.getEmpName());
	}

}