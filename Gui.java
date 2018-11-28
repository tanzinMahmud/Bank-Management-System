import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
public class Gui extends JFrame implements ActionListener
{   
	private JTextField TextName;
	private JLabel LabelTitle;
	private JLabel Label1;
	private JPasswordField TextPassword;
	private ImageIcon image, img;
	private JButton Button, b1;
	public Gui() 
	{	
		getContentPane().setBackground(Color.PINK);
		img = new ImageIcon(getClass().getResource("Icon.jpg"));
		this.setIconImage(img.getImage());
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(null);

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		image = new ImageIcon(getClass().getResource("bank.jpg"));
		Label1 = new JLabel(image);
		Label1.setBounds(670, -27, 700,750);
		add(Label1);
		
		LabelTitle = new JLabel("BANK MANAGEMENT SYSTEM");
		LabelTitle.setBounds(245, -20, 200,100);
		add(LabelTitle);
		
		LabelTitle = new JLabel("Admin ID: ");
		LabelTitle.setBounds(140, 100, 150, 25);
		add(LabelTitle);
		
		
		TextName = new JTextField();
		TextName.setBounds(220, 100, 150, 25);
		add(TextName);
		setVisible(true);
		
		LabelTitle = new JLabel("Admin Password: ");
		LabelTitle.setBounds(90, 150, 150, 25);
		add(LabelTitle);
		
		TextPassword = new JPasswordField();
		TextPassword.setBounds(220, 150, 150, 25);
		TextPassword.setEchoChar('?');
		add(TextPassword);
		
		Button = new JButton("Login");
		Button.setBounds(220, 250, 120, 50);
		Button.addActionListener(this);
		add(Button);
		
	}
	 public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==Button){
				String id=TextName.getText();
				String pwd = new String(TextPassword.getPassword());
				if(pwd.equals("tss")&&id.equals("admin")){
					dispose();
					Form2 f=new Form2();
				}
				else{
					JOptionPane.showMessageDialog(null,"Incorrect ID or PASSWORD!");
				}
			}
		}
	public static void main(String [] args) 
	{
		Gui g=new Gui();
	}
}