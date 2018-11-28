import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.lang.Object;

public class Database{
		private JTable table;
		private JButton backButton;
		public JFrame f;
		private ImageIcon image, img;
	public Connection getDBConnection(){
		 try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/myproject", "root", "");
           System.out.println("Connection established  "+conn);
           return conn;
		}
	   catch(Exception e){
           System.out.println("Error!!! Driver is not started yet");
           return null;
         }
     }
	public Database(){
		f=new JFrame();
		img = new ImageIcon(getClass().getResource("Icon.jpg"));
		f.setIconImage(img.getImage());
	 }
    public Database(String name, String accNo, String bal){	
		int b=Integer.parseInt(bal);
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "");
           System.out.println("Cnnection established  "+con);
		   Statement stt=con.createStatement();
		   stt.execute("INSERT INTO `account` (`Name`, `AccountNo`, `Balance`) VALUES ('"+name+"', '"+accNo+"', '"+b+"');");
       }
	   catch(Exception e){
           System.out.println("Error!!! Driver is not started yet");
		}
	}
	public void deleteRow(String accNoValue){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "");
           System.out.println("Cnnection established  "+con);
		   Statement stt=con.createStatement();
		   stt.execute("delete from account where AccountNo= '"+accNoValue+"'"); 
		}
	   catch(Exception e){
           System.out.println("Error!!! Driver is not started yet");
		}
	}
	public void setName(String accNo,String newName)
	{
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "");
           System.out.println("Cnnection established  "+conn);
		   Statement sttt=conn.createStatement();
		   sttt.execute("update account set Name= '"+newName+"' where AccountNo= '"+accNo+"'");
		   
		}
	   catch(Exception e){
           System.out.println("Error!!! Driver is not started yet");
		}
	}
	public void setId(String accNo,String newAcc)
	{
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "");
           System.out.println("Cnnection established  "+con);
		   Statement stt=con.createStatement();
		   stt.execute("UPDATE account SET AccountNo= '"+newAcc+"' WHERE AccountNo= '"+accNo+"'");
		}
	   catch(Exception e){
           System.out.println("Error!!! Driver is not started yet");
		}
	}
	public void setBalance(String accNo,String newBalance)
	{
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "");
           System.out.println("Cnnection established  "+con);
		   Statement stt=con.createStatement();
		   stt.execute("UPDATE account SET Balance= '"+newBalance+"' WHERE AccountNo= '"+accNo+"'");
		}
	   catch(Exception e){
           System.out.println("Error!!! Driver is not started yet");
		}
	}
	public void showAllValue()
	{	
		Database db=new Database();
		String column[]={"Name","Account No","Balance"}; 
		   
		String[][] twoArr=new String[10][10];
	       		
		try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "");
           System.out.println("Cnnection established  "+con);
		   Statement stt=con.createStatement();
		   ResultSet rs;
		   rs = stt.executeQuery("select * from account");   
		   int i=0, j=0;
		   while(rs.next()){
				j=0;
				twoArr[i][j]=rs.getString("Name");
				j++;
				twoArr[i][j]=rs.getString("AccountNo");
				j++;
				twoArr[i][j]=rs.getString("Balance");	
				i++;
		   }
		}
	   catch(Exception e){
		   System.out.println(e.getMessage());
           System.out.println("Error!!! Driver is not started yet");
		}
		JTable jt=new JTable(twoArr,column); 
		jt.setBounds(30,40,200,300);
		f.add(jt); 
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp); 		
		f.setSize(300,400);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}