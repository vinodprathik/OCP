package hashSetHashMap;

import java.util.HashSet;
import java.util.Set;

public class HashTest {
	
	public static void main(String[] args) {
		 Set<String>colours=new HashSet<>();
		 colours.add("yellow");
		 colours.add("black");
		 colours.add("Orange");
		 colours.add("black");
		 colours.add("yellow");
		 colours.add("white");
		 colours.add("purple");
		 
		 for(String col: colours){
		  System.out.println(col);
		 }
		
		    
		 
		 Student s1 = new Student("vinod","hyderabad");
		 Student s2 = new Student("varakanth","Dallas");
		 Student s3 = new Student("kalyan","hyderabad");
		 Student s4 = new Student("venkat","vijayawada");
		 Student s5 = new Student("Git","Practice");

		 
		 Set<Student> hash = new HashSet<>();
		 hash.add(s1);
		 hash.add(s2);
		 hash.add(s3);
		 hash.add(s4);
		 hash.add(s5);
		 for (Student employee : hash) {
		  System.out.println(employee);
		 }
	}

}