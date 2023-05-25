import java.util.*;

public class Call {
    public static void main(String[] args)
    {
        HashMap<Long, String> contact= new HashMap<Long, String>();
        ArrayList<missCall> list= new ArrayList<missCall>();
        Scanner sc= new Scanner(System.in);
        System.out.println("List first 3 contacts");
        for(int i=0; i<3; i++)
        {
            System.out.println("Enter name:");
            String name= sc.next();
            System.out.println("Enter phone number:");
            Long num= sc.nextLong();
            contact.put(num, name);

        }

        System.out.println(contact);
        for(int i=0; i<3; i++)
        {
            System.out.println("Enter a number for missed call");
            long number= sc.nextLong();
            if(contact.containsKey(number))
            {
                missCall ms= new missCall(number, contact.get(number));
                list.add(ms);
            }
            else{
                missCall ms= new missCall(number, "Private Number");
                list.add(ms);
            }
        }
        System.out.println("Missed calls in order");
        for(int i=0;i<3;i++)
        {
        list.get(i).display();
        }

        System.out.println("Enter a number for deletion");
        {
            long number= sc.nextLong();
            if(contact.containsKey(number))
            {
                contact.remove(number);
            }
            else{
                System.out.println("Number not found");
            }
        }
    }
}
