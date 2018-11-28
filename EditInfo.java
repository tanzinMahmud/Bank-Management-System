import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class EditInfo extends JFrame implements ActionListener{
	private JLabel LabelTitle1;
	private JTextField TextName1;
	JButton Button1,Button2,Button3;
	public String Id;
	
	public EditInfo()
	{
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(null);
		
		
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setId(String Id)
	{
		this.Id=Id;
	}
	
	public void actionPerformed(ActionEvent event){
			
		}
}