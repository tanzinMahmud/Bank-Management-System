import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class AddAccForm extends JFrame implements ActionListener{
	private JLabel LabelTitle,LabelTitle1,LabelTitle2;
	private JTextField TextName1,TextName2,TextName3;
	private ImageIcon image, img;
	private JButton okButton,cancelButton;
	public static String name, accNo, bal;
	
	public AddAccForm()
	{	
		getContentPane().setBackground(Color.PINK);
		img = new ImageIcon(getClass().getResource("Icon.jpg"));
		this.setIconImage(img.getImage());
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(null);
		LabelTitle = new JLabel("Name:");
		LabelTitle.setBounds(100, 50, 150, 25);
		add(LabelTitle);
		
		TextName1 = new JTextField();
		TextName1.setBounds(200, 50, 150, 25);
		add(TextName1);
		
		
		LabelTitle1 = new JLabel("Account No:");
		LabelTitle1.setBounds(100, 100, 150, 25);
		add(LabelTitle1);
		
		TextName2 = new JTextField();
		TextName2.setBounds(200, 100, 150, 25);
		add(TextName2);
		
		
		LabelTitle2 = new JLabel("Balance:");
		LabelTitle2.setBounds(100, 150, 150, 25);
		add(LabelTitle2);
		
		TextName3 = new JTextField();
		TextName3.setBounds(200, 150, 150, 25);
		add(TextName3);
		
		
		okButton = new JButton("Add");
		okButton.setBounds(70, 250, 120, 40);
		okButton.addActionListener(this);
		add(okButton);
		
		cancelButton = new JButton("Back");
		cancelButton.setBounds(220, 250, 120, 40);
		cancelButton.addActionListener(this);
		add(cancelButton);
		
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent event){
			if(event.getSource()==okButton){
				name=TextName1.getText();
				accNo=TextName2.getText();
				bal=TextName3.getText();
				
				Database d=new Database(name, accNo, bal);
				JOptionPane.showMessageDialog(null,"Successful!");

			}
			else if(event.getSource()==cancelButton){
				dispose();
				Form2 ob=new Form2();
			}
		}
}
		
