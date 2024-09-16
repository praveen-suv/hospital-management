package hospital;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class hospital_admin extends hospital{
			
			int insert(int id,String patientname ,String doctor_name ,String patientadmit_date, long patient_phone_number)throws SQLException {
				String q="insert into hospital values(?,?,?,?,?)";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setInt(1,id);
				pst.setString(2,patientname);
				pst.setString(3,doctor_name);
				pst.setString(4,patientadmit_date);
				pst.setLong(5, patient_phone_number);
				int res=pst.executeUpdate();
				return res;
				}	
			
			
			void view() throws SQLException{
				String q="select * from hospital";
				PreparedStatement pst=con.prepareStatement(q);
				ResultSet rs=pst.executeQuery();
				while(rs.next()) {
					int id=rs.getInt(1);
					String patientname=rs.getString(2);
					String doctor_name=rs.getString(3);
					String patientadmit_date=rs.getString(4);
					Long patient_phone_number=rs.getLong(5);
					System.out.println(id+"\t"+patientname+"\t"+doctor_name+"\t"+patientadmit_date+"\t"+patient_phone_number);
								
				}
				
			}
			int delete(int id) throws SQLException{
				 String q="delete from hospital where id=?";
				 PreparedStatement pst=con.prepareStatement(q);
				 pst.setInt(1,id);
				 int res=pst.executeUpdate();
				 return res;
				
			}
			void search(int id) throws SQLException{
				String q="select * from hospital where id=?";
				PreparedStatement pst=con.prepareStatement(q);
				pst.setInt(1,id);
				ResultSet rs=pst.executeQuery();
				while(rs.next()) {
					int n=rs.getInt(1);
					String patientname=rs.getString(2);
					String doctor_name=rs.getString(3);
					String patientadmit_date=rs.getString(4);
					Long patient_phone_number=rs.getLong(5);
					System.out.println(id+"\t"+patientname+"\t"+doctor_name+"\t"+patientadmit_date+"\t"+patient_phone_number);
								
					
				}
			}
				int update(int id, String doctor_name) throws SQLException {
					String q="update hospital set doctor_name=?  where id=?";
					PreparedStatement pst=con.prepareStatement(q);
					pst.setInt(2, id);
					pst.setString(1,doctor_name);
					int res=pst.executeUpdate();	
					return res;
				
			}
		}

	

