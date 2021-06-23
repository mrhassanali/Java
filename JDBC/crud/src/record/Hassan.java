package record;
import java.io.*;
import java.sql.*;
import java.util.*;


public class Hassan{
public static void main(String args[]) throws Exception{
	System.out.println("\t\t\t_________________");
	System.out.println("");
	System.out.println("\t\t\tWelcome to LMS");
	System.out.println("\t\t\t_________________");
	BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
	
	while(true) {

		System.out.println("Press 1 to Show Record");
		System.out.println("Press 2 to update Record");
		System.out.println("Press 3 to Insert Record");
		System.out.println("Press 4 to Delete Record");
		System.out.println("Press 5 to Search Record");
		System.out.println("Press 6 to Exit");
		int a = Integer.parseInt(Bf.readLine());
		
		if(a == 1) {
			showData();
		}else if(a == 2) {
			//delete student
			updateData();
		}else if(a == 3) {
			//display
			insertData();
		}
		else if(a == 4) {
			deleteData();
		}else if(a==5) {
			searchRecord();
		}
		else if(a == 6) {
			break;
		}
		else {

		}
	}
	
	System.out.println("________________________"); 
	System.out.println("Thanks for using LMS");
	System.out.println("________________________");

}


//Connection Method
static Connection con;
public static Connection dbconnect() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String DB_URL = "jdbc:mysql://localhost:3306/crud";
		String DB_USER = "root";
		String DB_PASSWORD = "technicalhassanali";
		Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		return con;
	}catch(Exception e){
		System.out.println(e);
		return null;
	}
}
 

public static void showData() {
	try{
		con = dbconnect(); //call connection Method
		Statement stmt=con.createStatement();

		System.out.println("+------+-------------+----------------+--------+--------------+");
		ResultSet rs=stmt.executeQuery("select * from student");

		while(rs.next()) {
			String sid = rs.getString(1);
			String sname = rs.getString(2);
			String fname = rs.getString(3);
			String saddress = rs.getString(4);
			String sphone = rs.getString(5);
	    System.out.println("| "+sid+"    |  "+sname+" | "+fname+ " | "+saddress+ " | "+sphone+ " | "  );
		}
	    con.close();
	    System.out.println("+------+-------------+----------------+--------+--------------+");

	}catch(Exception e){
			System.out.println(e);
			}
}


								/*Update Data Method*/
public static void updateData() {
	BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));

	try{
		con = dbconnect(); //call connection Method
		Statement stmt=con.createStatement();

		//Get input to Update the Record
		System.out.print("Student ID = ");
		int rid = Integer.parseInt(Bf.readLine());
		System.out.print("Student Name = ");
			String stu_Name = Bf.readLine();
		System.out.print("Father Name = ");
			String stu_Father = Bf.readLine();
		System.out.print("Address = ");
			String stu_Address = Bf.readLine();
		System.out.print("Phone Number =");
			String stu_phone = Bf.readLine();
			//Update Query
		String update_query = "UPDATE student set Name=?,Father_Name=?,Address=?,Phone_Number=? where id=?";
		 
		PreparedStatement pst = con.prepareStatement(update_query);
		 pst.setString(1, stu_Name);
		 pst.setString(2, stu_Father);
		 pst.setString(3, stu_Address);
		 pst.setString(4, stu_phone);
		 pst.setInt(5, rid);
		 int result = pst.executeUpdate();
		 if(result>0) {
			 System.out.println("________________________");
			 System.out.println("Record Updated Sucessfully");
			 System.out.println("________________________");
		 }else {
			 System.out.println("________________________");
			 System.out.print("Record Not Updated");
			 System.out.println("________________________");
		 }
		 con.close(); //Connection Close
	}catch(Exception e){
			System.out.println(e);
			}
}


								/*Insert Data Method*/
public static void insertData() {
	BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
	try{
		con = dbconnect(); //call connection Method
		Statement stmt=con.createStatement();

		//Insert Date
		System.out.print("Student ID = ");
			int stu_id = Integer.parseInt(Bf.readLine());
		System.out.print("Student Name = ");
			String stu_Name = Bf.readLine();
		System.out.print("Father Name = ");
			String stu_Father = Bf.readLine();
		System.out.print("Address = ");
			String stu_Address = Bf.readLine();
		System.out.print("Phone Number =");
			String stu_phone = Bf.readLine();
			//Insert Query
		String insertQuery = "Insert into student(id,Name,Father_Name,Address,Phone_Number) values(?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(insertQuery);
		pst.setInt(1,stu_id);
		pst.setString(2,stu_Name);
		pst.setString(3, stu_Father);
		pst.setString(4, stu_Address);
		pst.setString(5, stu_phone);
	    pst.executeUpdate(); 
	    con.close();   //Connection Close
	    System.out.println("________________________");
	    System.out.println("Record Save Successfully");
	    System.out.println("________________________");
}catch(Exception e){
	System.out.println(e);
	}
}


						/*Delete Data Method*/
public static void deleteData() {
	BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
	Scanner input = new Scanner(System.in);

	try{
		con = dbconnect(); //call connection Method
		Statement stmt=con.createStatement();
		System.out.print("Enter the ID of the Record = ");
		int sid = Integer.parseInt(Bf.readLine());


		String sql = "Delete from student where id="+sid;
		
		int deleteRows = stmt.executeUpdate(sql);
		if(deleteRows>0) {
			System.out.println("________________________");
			System.out.println("Record Deleted successfully");
			System.out.println("________________________");
		}else {
			System.out.println("________________________");
			System.out.println("Record Not Found");
			System.out.println("________________________");
		}
}catch(Exception e){
	System.out.println(e);
	}
}


							/*Search Record Method*/
public static void searchRecord() {
	BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
	try {
		con = dbconnect(); //call connection Method
		Statement stmt=con.createStatement();
		System.out.print("Enter Student ID= ");
		int searchRecord = Integer.parseInt(Bf.readLine());
		
		String Search_Record = "Select * from student where id="+searchRecord;
		
		Statement search = con.createStatement();
		ResultSet rs = search.executeQuery(Search_Record);
		if(rs.next()) {
			System.out.println("________________________");	
			System.out.println("ID = "+rs.getString(1));
			System.out.println("Name = "+rs.getString(2));
			System.out.println("Father Name = "+rs.getString(3));
			System.out.println("Address = "+rs.getString(4));
			System.out.println("Phone Number = "+rs.getString(5));
	    System.out.println("________________________");
		}else {
			System.out.println("________________________");
			System.out.println("Record Not Found");
			System.out.println("________________________");
		}
		
	}catch(Exception e){
		System.out.println(e);
		}
	
	
}//close while loop 



}//class close



