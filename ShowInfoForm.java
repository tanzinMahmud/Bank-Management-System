import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class ShowInfoForm implements ActionListener{
	private JLabel LabelTitle1;
	private JTable table;
	private JButton backButton;
	JFrame f; 
	
	public ShowInfoForm(){
		Database db=new Database();
		db.showAllValue();
	}
	public void actionPerformed(ActionEvent event){
			if(event.getSource()==backButton){
				f.dispose();
				Form2 f2=new Form2();
			}
	}
}
		
