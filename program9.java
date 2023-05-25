import java.util.*;
import java.util.Scanner;

class Thread1 extends Thread{
    // Thread1()
    // {
    //     System.out.println("sj1");
    // }
    Scanner sc= new Scanner(System.in);
   String[] digits={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public void run()
    {
        try{
            
        int number=0;
        String enumber= sc.next();
        number=Integer.parseInt(enumber);
        
        if(number> 9999 || number<1000){
            throw new Exception();
        }
        
        else{
            while(number!=0)
            {
                int value= number%10;
                System.out.println(digits[value]);
                number/=10;
            }
        }
        
        }
        catch(Exception e)
        {
             System.out.println("v");
            System.out.println(e);
        }
    }
    
}

class Thread2 extends Thread{
    // Thread2()
    // {
    //     System.out.println("sj2");
    // }
    Scanner sc= new Scanner(System.in);
    public void run()
    {
        
        ArrayList<Character> list= new ArrayList<Character>();
        list.add('a'); list.add('e');
        list.add('o');list.add('i');
        list.add('u');
        list.add('A'); list.add('E');
        list.add('O');list.add('I');
        list.add('U');
        
        
        String input=sc.nextLine();
        
        int vowel= 0;
        for(int i =0; i< input.length(); i++)
        {
            char target= input.charAt(i);
            if(list.contains(target))
                vowel++;
        }
        
        System.out.println(vowel);
        
        
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Thread1 th1= new Thread1();
        Thread2 th2= new Thread2();
      
        th1.run();  th2.run();
        
    }
}
