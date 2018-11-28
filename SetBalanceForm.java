import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;


public class SetBalanceForm extends JFrame implements ActionListener{
	private JLabel LabelTitle,LabelTitle1;
	private JTextField TextName1,TextName2;
	public JButton okButton,cancelButton;
	private ImageIcon image, img;
	public String Id;
	
	public SetBalanceForm()
	{

		getContentPane().setBackground(Color.PINK);
		img = new ImageIcon(getClass().getResource("Icon.jpg"));
		this.setIconImage(img.getImage());
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(null);
		
		LabelTitle = new JLabel("Account No:");
		LabelTitle.setBounds(100, 50, 150, 25);
		add(LabelTitle);
		
		TextName1 = new JTextField();
		TextName1.setBounds(200, 50, 150, 25);
		add(TextName1);
		
		LabelTitle1 = new JLabel("New Balance:");
		LabelTitle1.setBounds(100, 100, 150, 25);
		add(LabelTitle1);
		
		TextName2 = new JTextField();
		TextName2.setBounds(200, 100, 150, 25);
		add(TextName2);
		
		okButton = new JButton("Update");
		okButton.setBounds(70, 250, 120, 40);
		okButton.addActionListener(this);
		add(okButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(220, 250, 120, 40);
		cancelButton.addActionListener(this);
		add(cancelButton);
		
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setId(String Id)
	{
		this.Id=Id;
	}
	
	public void actionPerformed(ActionEvent event){
			if(event.getSource()==okButton){
				String accNo=TextName1.getText();
				String newBalance=TextName2.getText();
				Database db=new Database();
				db.setBalance(accNo,newBalance);
			}
			else if(event.getSource()==cancelButton){
			
				dispose();
				ModifyAccForm ob=new ModifyAccForm();
			}
		}
}