package hospital;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class patient extends hospital {
		
		int insert(int id,String name,int age,String address,long phone,String problem)throws SQLException{
			String q="insert into patient values(?,?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setInt(1,id);
			pst.setString(2,name);
			pst.setInt(3,age);
			pst.setString(4, address);
			pst.setLong(5, phone);
			pst.setString(6,problem);
			int res=pst.executeUpdate();
			return res;	
		}
		
		void view()throws SQLException{
			String q="select * from patient";
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String name =rs.getString(2);
				int age = rs.getInt(3);
				String address = rs.getString(4);
				Long phone = rs.getLong(5);
				String problem = rs.getString(6);
				System.out.println(id+"\t"+name+"\t"+age+"\t"+address+"\t"+phone+"\t"+problem);
			
			}
		}
		int delete(int id) throws SQLException{
			 String s="delete from patient where id=?";
			 PreparedStatement pst=con.prepareStatement(s);
			 pst.setInt(1,id);
			 int res=pst.executeUpdate();
			 return res;
			
		}
		
		int update(String problem,int id)throws SQLException{
			String s="update patient set problem=? where id=?";
			PreparedStatement pst=con.prepareStatement(s);
			pst.setInt(2,id);
			pst.setString(1,problem);
			int res=pst.executeUpdate();
			return res;
			
		}
		void search(int id) throws SQLException{
			String s="select * from patient where id=?";
			PreparedStatement pst=con.prepareStatement(s);
			pst.setInt(1,id);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				int m=rs.getInt(1);
				String name =rs.getString(2);
				int age = rs.getInt(3);
				String address = rs.getString(4);
				Long phone = rs.getLong(5);
				String problem = rs.getString(6);
				System.out.println(id+"\t"+name+"\t"+age+"\t"+address+"\t"+phone+"\t"+problem);
			
			}
		}
	}


