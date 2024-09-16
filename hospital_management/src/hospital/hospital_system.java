package hospital;

import java.sql.SQLException;
import java.util.Scanner;

public class hospital_system {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		hospital_admin  a = new hospital_admin();
		patient p = new patient();
		while(true) {
			System.out.println("choose your role:");
			System.out.println("1.hospital admin\n2.patient\n3.Exit");
			int ch = sc.nextInt();
			
			if(ch==1) {
				String Username;
				String Password;
				
				Username="admin";
				Password="12345678";
				
				System.out.println("Enter username");
				String username=sc.next();
				System.out.println("Enter password");
				String password=sc.next();
				if(username.equals(Username)&&password.equals(Password)) {
					System.out.println("Access Granted!\nWelcome!!");
					while(true) {
					System.out.println("select your options");
					System.out.println("1.insert\n2.view\n3.update\n4.delete\n5.search\n6.EXIT");
					int n = sc.nextInt();
					if(n==1) {
						System.out.println("Enter the ID");
						int id = sc.nextInt();
						System.out.println("Enter the patient name");
						String patientname = sc.next();
						System.out.println("Enter the Doctor name");
						String doctor_name = sc.next();
						System.out.println("Enter the Admit date");
						String patientadmit_date= sc.next();
						System.out.println("Enter the phone number");
						long patient_phone_number = sc.nextLong();
						int q=a.insert( id, patientname ,doctor_name , patientadmit_date,  patient_phone_number);
						String res=(q>0)?"Added to DB":"Not Added";
						System.out.println(res);
						
					}
					if(n==2) {
						System.out.println("id+\t+patientname+\t+doctor_name+\t+patientadmit_date+\t+patient_phone_number");
						a.view();
					}
					if(n==3) {
						System.out.println("enter id");
						int id = sc.nextInt();
						System.out.println("Enter doctor name");
						String doctor_name = sc.next();
						int  q = a.update(id,doctor_name);
						System.out.println((q>0)?"Updated":"Not Updated");
					}
					if(n==4) {
						System.out.println("Enter ID");
						int id = sc.nextInt();
						int q=a.delete(id);
						System.out.println((q>0)?"deleted":"not deleted");
						
					}
					if(n==5) {
						System.out.println("Enter ID");
						int id = sc.nextInt();
						System.out.println("id+\\t+patientname+\\t+doctor_name+\\t+patientadmit_date+\\t+patient_phone_number");
						a.search(id);
					}
					else if(n==6) {
						System.out.println("THANK YOU ");
						break;
					}
					}
				}
											
				else if(username.equals(Username)) {
					System.out.println("Invalid password\nTry again..");
					
				}
				else if(password.equals(Password)) {
					System.out.println("Invalid username\nTry again..");
					
				}
				else {
					System.out.println("Invalid username and password\nTry again");
				}
			}
			if(ch==2) {
				while(true) {
					
				
				System.out.println("Patient Details");
				System.out.println("Select Option");
				System.out.println("1.insert\n2.view\n3.update\n4.delete\n5.search\n6.EXIT");
				int m =sc.nextInt();
				if(m==1) {
					System.out.println("Enter the ID");
					int id = sc.nextInt();
					System.out.println("Enter the patient name");
					String name = sc.next();
					System.out.println("Enter the age");
					int age= sc.nextInt();
					System.out.println("Enter the address");
					String address = sc.next();
					System.out.println("Enter the phone number");
					long phone = sc.nextLong();
					System.out.println("Enter the problem");
					String problem = sc.next();
					int r=p.insert( id, name, age ,address , phone,problem);
					String res=(r>0)?"Added to DB":"Not Added";
					System.out.println(res);
					
				}
				if(m==2) {
					System.out.println("id\tname\tage\taddress\tphone\tproblem");
					p.view();
				}
				if(m==3) {
					System.out.println("Enter ID");
					int id = sc.nextInt();
					System.out.println("Enter problem");
					String problem = sc.next();
					int r = p.update(problem, id);
					System.out.println((r>0)?"Updated":"Not Updated");
				}
				if(m==4) {
					System.out.println("Enter ID");
					int id = sc.nextInt();
					int r=p.delete(id);
					System.out.println((r>0)?"deleted":"not deleted");
					
				}
				if(m==5) {
					System.out.println("Enter ID");
					int id = sc.nextInt();
					System.out.println("id\tname\tage\taddress\tphone\tproblem");
					p.search(id);
				}
				else if(m==6) {
					System.out.println("THANK YOU");
					break;
					
				}
			}
			}
			else if(ch==3) {
				System.out.println("THANK YOU");
				break;
			}
				
			}
		}

	}


