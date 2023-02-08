
// import java.util.*;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class hashmap {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		HashMap<String, myclass> hm= new HashMap<String, myclass>();
		myclass s1= new myclass("Sanidhya", 21, 9.00);
		myclass s2= new myclass("Yogesh", 20, 9.24);
		myclass s3= new myclass("Utkarsh", 21, 9.29);
		myclass s4= new myclass("Zeeshan", 21, 9.01);
		myclass s5= new myclass("Dhruv Pratap", 20, 8.00);
		
		hm.put("1ms20is104", s1);
		hm.put("1ms20is137", s2);
		hm.put("1ms20is129", s3);
		hm.put("1ms20is138", s4);
		hm.put("1ms20ec018", s5);
		
		System.out.println(" finding student with usn ending with 18");
		System.out.println(hm.get("1ms20ec018"));
		
		// updating cgpa of student with usn 104
		
		System.out.println("before updation" + "\n" + hm.get("1ms20is104"));
		s1.cgpa=9.05;
		hm.put("1ms20is104", s1);
		System.out.println("After updation\n");
		System.out.println(hm.get("1ms20is104"));
		
		// printing details of students whose cgpa is > 9
		for(Map.Entry <String, myclass> h: hm.entrySet())
		{
			if(h.getValue().cgpa >9)
			{
				System.out.println(h.getKey()+ " "+ h.getValue()+ "\n");
			}
		}
		
		// arrays of usn 
		ArrayList arr= new ArrayList();
		for(Map.Entry< String, myclass> h : hm.entrySet())
		{
			arr.add(h.getKey());
		}
		System.out.println(arr + "\n");
		
		// array list of values
		Collection<myclass> values= hm.values();
		ArrayList<myclass> stud= new ArrayList<myclass>(values);
		
		Iterator it= stud.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("printing students with age less than 21\n");
		for(Map.Entry <String, myclass> h: hm.entrySet())
		{
			if(h.getValue().age<21)
			{
				System.out.println(h.getKey()+ " "+ h.getValue()+ "\n");
			}
		}
		System.out.println("Enter usn of student to remove \n");
		String usn= sc.next();
		
		// to remove we use inbuilt function remove( key);
		hm.remove(usn);
		for(Map.Entry <String, myclass> h: hm.entrySet())
		{
			System.out.println(h.getKey()+ " "+ h.getValue()+ "\n");
		}
		
		// search for a student with usn
		System.out.println("Enter usn of student to search \n");
		String s= sc.next();
		if(hm.containsKey(s))
			System.out.println("Present\n");
		else System.out.println("Not Present");
	}
}
