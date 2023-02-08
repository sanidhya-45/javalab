
//Create a hash map of students with unique USN's.
//Retrieve the student with USN ending with 18
//Update the cgpa of the student with USN ending with 106
//Print the student details with cgpa > 9 8 //Generate arrays of USN and student record
//Print students with age < 21
//remove a student from the hashmap given the usn
//Search for a student with a USN;

public class myclass {
	
	
		// create class of students with unique usn's
			String name;
			int age;
			double cgpa;
			myclass(String n, int a, double cg)
			{
				name=n; 
				age=a;
				cgpa=cg;
			}
			public String toString()
			{
				return name+" "+age+" "+cgpa;
			}
}
