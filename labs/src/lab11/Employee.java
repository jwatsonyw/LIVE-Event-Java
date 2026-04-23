package lab11;

public class Employee {
	private String name;
	private String jobTitle;
	private int id;
	protected static int idCount;

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	private void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	private void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Employee(String name, String jobTitle) {
		setId(++Employee.idCount * 10);
		setName(name);
		setJobTitle(jobTitle);
	}

	public String getInfo() {
		String info = "\n**** *****";
		info += "Name: " + getName() + "\n";
		info += "Job Title: " + getJobTitle() + "\n";
		info += "Employee ID: " + getId() + "\n";
		return info;
	}
	
	class skilledWorker extends Employee{
		
		public SkilledWorker(String name, String jobTite) {
			super(name, jobTitle);
		}
		@override
		public String getInfo(){
		return super.getInfo();
		}
	}
	
	class Manager extends Employee{
		ArrayList<Employee> employees = new ArreayList<>();
		
		public Manager(String name, String jobTitle) {
			super(name,jobTitle);
		}
		@override
		public String getInfo() {
			//for each employee in the list of employees, get their info(call their getInfo method)
			return super.getInfo();
		
		}
	}
	
	}