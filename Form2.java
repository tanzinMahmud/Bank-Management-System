import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Form2 extends JFrame implements ActionListener
{
	private JLabel LabelTitle;
	private JTextField TextName;
	private JPasswordField TextPassword;
	private JLabel Label1;
	private ImageIcon image, img;
	private JButton Button1,Button2,Button3,Button4,Button5, Button6;
	private JPanel PanelForm1;
	
	public Form2()
	{	
		img = new ImageIcon(getClass().getResource("Icon.jpg"));
		getContentPane().setBackground(Color.PINK);
		this.setIconImage(img.getImage());
		Label1 = new JLabel(image);
		Label1.setBounds(670, -40, 700,750);
		add(Label1);
	
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(null);
		Button1 = new JButton("Add Account");
		Button1.setBounds(50, 75, 150, 25);
		Button1.addActionListener(this);
		add(Button1);
		
		Button2 = new JButton("Delete Account");
		Button2.setBounds(50, 150, 150, 25);
		Button2.addActionListener(this);
		add(Button2);
		
		Button3 = new JButton("Modify Account");
		Button3.setBounds(250, 75, 150, 25);
		Button3.addActionListener(this);
		add(Button3);
		
		
		
		Button5 = new JButton("Show Info");
		Button5.setBounds(250, 150, 150, 25);
		Button5.addActionListener(this);
		add(Button5);
		
		Button6 = new JButton("Logout");
		Button6.setBounds(50, 225, 150, 25);
		Button6.addActionListener(this);
		add(Button6);
		
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent event){
			if(event.getSource()==Button1){
				dispose();
				AddAccForm ob=new AddAccForm();
			}
			else if(event.getSource()==Button2){
				dispose();
				DeleteAccForm ob=new DeleteAccForm();
			}
			else if(event.getSource()==Button3){
				dispose();
				ModifyAccForm ob=new ModifyAccForm();
			}
			
			else if(event.getSource()==Button5){
				dispose();
				ShowInfoForm ob=new ShowInfoForm();
			}
			else if(event.getSource()==Button6){
				dispose();
				Gui g=new Gui();
			}
		}
	}
		
