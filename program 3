import java.util.Arrays;
public class Detail {
    String name, usn, address,age, category;
    double sg[], cgpa;
    public Detail(String name, String usn, String age, String address, String category, double sg[], double cgpa)
    {
        super();
        this.address= address;
        this.name= name;
        this.category= category;
        this.usn= usn;
        this.age= age;
        this.sg=sg;
        this.cgpa= cgpa;
        
    }
    @Override
    public String toString()
    {
        return "Student [name=" + name + ", usn=" + usn + ", address=" + address + ", category=" + category + ", age="
        + age + ", sg=" + Arrays.toString(sg) + ", cgpa=" + cgpa + "]";
    }
}

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
public class Studentrepo implements ActionListener {

    static JFrame jf = new JFrame("Student Info");
    static JTextField name= new JTextField(20);
    static JTextField age= new JTextField(5);
    static JTextField usn= new JTextField(20);
    static JTextField address= new JTextField(50);
    static JTextField category= new JTextField(20);
    static JTextField sg[]= new JTextField[8];
    
    static JButton Submit= new JButton("Submit");
    static JButton Done= new JButton("Done");
    static JButton Display= new JButton("Display");
    
    static ArrayList<Detail> list= new ArrayList<Detail>();

    public static void main(String [] args)
    {
        jf.setSize(800, 900);
        jf.setLayout(new FlowLayout(0, 0, 0));

        jf.add(new JLabel(" Enter name"));
        jf.add(name);
        jf.add(new JLabel(" Enter USN"));
        jf.add(usn);
        jf.add(new JLabel(" Enter Age"));
        jf.add(age);
        jf.add(new JLabel(" Enter address"));
        jf.add(address);
        jf.add(new JLabel(" Enter category"));
        jf.add(category);

        for(int i=0; i< sg.length; i++)
        {
            sg[i]= new JTextField(5);
            jf.add(new JLabel("sgpa"+(i+1)));
            jf.add(sg[i]);
        }
        jf.add(Submit);
        jf.add(Done);
        jf.add(Display);
        
        Submit.addActionListener(new Studentrepo());
        Done.addActionListener(new Studentrepo());
        Display.addActionListener(new Studentrepo());
        jf.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        if(e.getSource()==Submit)
        {
            int a= Integer.parseInt(age.getText());
            if(a<18 || a>30)
            {
                JOptionPane.showMessageDialog(null, "Invalid age");
                String temp= JOptionPane.showInputDialog(null, "Enter age between 18 and 30");
                age.setText(temp);

            }
            else{
                System.out.println("Age Validated");
            }
        }
        if(e.getSource()==Done)
        {
            double sgpa[]= new double[8];
            for(int i=0; i<8; i++)
            {
                sgpa[i]= Double.parseDouble(sg[i].getText());
            }
            double cgpa= Arrays.stream(sgpa).sum()/ 8.0;
            JOptionPane.showMessageDialog(null, cgpa);
            list.add(new Detail(name.getText(), usn.getText(), address.getText(), category.getText(), age.getText(), sgpa, cgpa));
        }
        if(e.getSource()==Display)
        {
            jf.setVisible(false);
            JFrame newframe= new JFrame("All students");
            newframe.setSize(800,600 );
            newframe.setVisible(true);

            JTextArea Details= new JTextArea(50, 50);
            newframe.add(Details);

            for(Detail it: list)
            {
                Details.append(it.toString() + "\n");
            }
        }
    }
    
}


