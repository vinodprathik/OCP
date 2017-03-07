package hashSetHashMap;

public class Student {

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	Student() {
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			Student es = (Student) obj;
			return this.getName().equals(es.getName());
		}
		return false;
	}
}
