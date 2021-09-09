package prob04;

public class Depart extends Employee {

	private String department;
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Depart(String name, int salary, String department) {
		setName(name);
		setSalary(salary);
		setDepartment(department);
	}
	
	@Override
	public void getInformation() {
		System.out.println( "이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + getDepartment() );
	}
	
}
