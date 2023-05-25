import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.HashMap;

public class Shopping implements ActionListener{

    JLabel label1= new JLabel("Phone Number ");
	JTextField phone=new JTextField(10);
	JLabel label2= new JLabel("Enter id");
	JTextField cid=new JTextField(10);
	JButton check=new JButton("Check customer id ");
	JLabel label3= new JLabel("#1  APPLE 150rs/Kg   #2 Orange 60rs/kg");
	JLabel label4= new JLabel("Enter item Number ");
	JTextField item_no= new JTextField(5);
	JLabel label5= new JLabel("Quantity kg ");
	JTextField kg= new JTextField(5);
	JRadioButton rb1=new JRadioButton("Discount 30%");
	JButton Bill=new JButton("Bill");
	JTextField am=new JTextField(20);

    HashMap<String, Integer> hm= new HashMap<String, Integer>();
    HashMap<Integer, Double> item= new HashMap<Integer, Double>();

    void add_cust()
    {
        hm.put("9741278570",121);
		hm.put("9900726035",122);
		hm.put("9900001111",123);
    }
    void additem()
    {
        item.put(1,150.0);
		item.put(2,60.0);
    }

    Shopping()
    {
        JFrame jf= new JFrame("BILL");
        String user= JOptionPane.showInputDialog("Enter username");
        String password= JOptionPane.showInputDialog("Enter Password");
        add_cust();
        additem();

        if(user.equals("sj45") && password.equals("nobeaches"))
        {
            JOptionPane.showMessageDialog(null, "Valid user");
            jf.setSize(400, 400);
            jf.setVisible(true);
            jf.setLayout(new FlowLayout());
            jf.setLayout(new FlowLayout());
			jf.add(label1);
			jf.add(phone);
			jf.add(check);
			jf.add(label2);
			jf.add(cid);
			check.addActionListener(this);
			jf.add(label3);
			jf.add(label4);
			jf.add(item_no);
			jf.add(label5);
			jf.add(kg);
			jf.add(rb1);
			jf.add(Bill);
			Bill.addActionListener(this);
			jf.add(am);
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid User");
        }
    }
    public static void main(String [] args)
    {
        Shopping b1= new Shopping();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        if(e.getSource()==check)
        {
            String ph= phone.getText();
            if(hm.containsKey(ph))
            {
                JOptionPane.showMessageDialog(null, "OLD CUSTEMER ID"+hm.get(ph));
                cid.setText(Integer.toString(hm.get(ph)));
            }
            else{
                hm.put(ph, 124);
                JOptionPane.showMessageDialog(null, "NEW CUSTEMER ID"+hm.get(ph));
                cid.setText(Integer.toString(hm.get(ph)));
            }
        }
        else{
            double amount=0;
            if(item_no.getText().equals("1"))
            {
                amount=150*Integer.parseInt(kg.getText());
            }
            if(item_no.getText().equals("2"))
            {
                amount=60*Integer.parseInt(kg.getText());
            }
            if(rb1.isSelected())
            {
                amount-= (amount*0.30);
            }
            am.setText("After Discount"+ amount);
        }
    }
    
}

   
