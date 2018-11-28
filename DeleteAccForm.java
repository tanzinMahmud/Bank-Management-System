import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class DeleteAccForm extends JFrame implements ActionListener{
	private JLabel LabelTitle1;
	private JTextField TextName1;
	private ImageIcon image, img;
	JButton deleteButton,cancelButton;
	
	public DeleteAccForm()
	{	
		getContentPane().setBackground(Color.PINK);
		img = new ImageIcon(getClass().getResource("Icon.jpg"));
		this.setIconImage(img.getImage());
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(null);
		LabelTitle1 = new JLabel("Account No:");
		LabelTitle1.setBounds(70, 150, 150, 25);
		add(LabelTitle1);
		
		TextName1 = new JTextField();
		TextName1.setBounds(200, 150, 150, 25);
		add(TextName1);
		
		deleteButton = new JButton("Delete");
		deleteButton.setBounds(70, 250, 120, 40);
		deleteButton.addActionListener(this);
		add(deleteButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(220, 250, 120, 40);
		cancelButton.addActionListener(this);
		add(cancelButton);
		
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	public void actionPerformed(ActionEvent event){
			if(event.getSource()==deleteButton){
				String textFieldValue = TextName1.getText();
				Database db1=new Database();
				db1.deleteRow(textFieldValue);
			}
			else if(event.getSource()==cancelButton){
				dispose();
				Form2 ob=new Form2();
		}
	}
}
		
