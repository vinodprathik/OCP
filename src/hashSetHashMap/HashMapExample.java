package hashSetHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Student s1 = new Student("Ajay", "Hyderabad");
		Student s2 = new Student("John", "California");
		Student s3 = new Student("Mary", "Dallas");
		Student s4 = new Student("Naresh", "NewYork");
		Student s5 = new Student("vinay B reddy", "Califorina");

		Map<Student, Integer> stu = new HashMap<>();
		stu.put(s1, 1);
		stu.put(s2, 2);
		stu.put(s3, 3);
		stu.put(s4, 5);
		stu.put(s5, 5);

		System.out.print(stu);

	}

}
