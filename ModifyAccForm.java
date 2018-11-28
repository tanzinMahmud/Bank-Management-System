import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;


public class ModifyAccForm extends JFrame implements ActionListener{
	private JLabel LabelTitle1;
	private JTextField TextName1;
	public String Id;
	private ImageIcon image, img;
	private JButton Button1,Button2,Button3, Button4;
	
	public ModifyAccForm()
	{
		getContentPane().setBackground(Color.PINK);
		img = new ImageIcon(getClass().getResource("Icon.jpg"));
		this.setIconImage(img.getImage());
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(null);
		
		
		Button1 = new JButton("Set Name");
		Button1.setBounds(50, 75, 150, 25);
		Button1.addActionListener(this);
		add(Button1);
		
		Button2 = new JButton("Set Account No");
		Button2.setBounds(50, 150, 150, 25);
		Button2.addActionListener(this);
		add(Button2);
		
		Button3 = new JButton("Set Balance");
		Button3.setBounds(250, 75, 150, 25);
		Button3.addActionListener(this);
		add(Button3);
		
		Button4 = new JButton("Back");
		Button4.setBounds(250, 150, 150, 25);
		Button4.addActionListener(this);
		add(Button4);
		
		
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent event){
				dispose();
				if(event.getSource()==Button1)
			{
				dispose();
				SetNameForm ob=new SetNameForm();
				ob.setId(Id);
				
			}
			else if(event.getSource()==Button2){
			
				dispose();
				SetIdForm ob=new SetIdForm();
				ob.setId(Id);
			}
			else if(event.getSource()==Button3){
			
				dispose();
				SetBalanceForm ob=new SetBalanceForm();
				ob.setId(Id);
			}
			else if(event.getSource()==Button4){
			
				dispose();
				Form2 f=new Form2();
			}
		}
}