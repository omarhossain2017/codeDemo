import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializinganObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e = null;
		 Employee e1 = null;
	      try {
	         FileInputStream fileIn = new FileInputStream("D:\\\\EclipseIDEforJavaDevelopers-4.10\\\\serial\\\\Employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Employee) in.readObject();
	         e1 = (Employee) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.name);
	      System.out.println("Address: " + e.address);
	      System.out.println("SSN: " + e.SSN);
	      System.out.println("Number: " + e.number);
	      
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e1.name);
	      System.out.println("Address: " + e1.address);
	      System.out.println("SSN: " + e1.SSN);
	      System.out.println("Number: " + e1.number);
	   }
	

}
