package setter_getter_methods_prog;

public class emp_name_sal_Increment {
	private String name;
	private String jobTitle;
	private int salary;
	
	public emp_name_sal_Increment(String name, String jobTitle, int salary) {
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	public String getName() {
		return name;
		
	}
	public String getjobTitle() {
		return jobTitle;
	}
	public int getsalary() {
		return salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle=jobTitle;
		
	}
	public void setSalary(int salary) {
		this.salary=salary;
		
	}
	public void increment(int percentage) {
		salary=salary+salary*percentage/100;
		System.out.println("incrementented present salary: "+salary);	
	}
	public void printDetails() {
		System.out.println(name+ " is emp name.");
		System.out.println(jobTitle+ " is emp jobTitle.");
		System.out.println(salary+ " is emp salary.");
	}
	
	public static void main(String[] args) {
		
		emp_name_sal_Increment emp1=new emp_name_sal_Increment("akila","QA",200000)	;
		emp_name_sal_Increment emp2=new emp_name_sal_Increment("poorna", "housewife",0);
		
		emp1.printDetails();
		emp2.printDetails();
		emp2.setSalary(300000);
		emp2.printDetails();
		emp1.increment(3);
		emp2.increment(5);
	}

}
