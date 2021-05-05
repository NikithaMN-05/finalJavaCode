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
public class Employee implements Comparable<Employee> {

	private Integer empId;
	private String empName;
	private float empSalary;

	public Employee(Integer empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Employee employee) {
		return this.getEmpId().compareTo(employee.getEmpId());

	}

	public Integer getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}


    
}
