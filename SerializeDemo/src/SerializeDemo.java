import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		  Employee e = new Employee();
	      e.name = "Reyan Ali";
	      e.address = "Phokka Kuan, Ambehta Peer";
	      e.SSN = 11122333;
	      e.number = 101;
	      
	      Employee e1 = new Employee();
	      e1.name = "Omar Ali";
	      e1.address = "540 madison street";
	      e1.SSN = 11122333;
	      e1.number = 101;
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream("D:\\EclipseIDEforJavaDevelopers-4.10\\serial\\Employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.writeObject(e1);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in D:\\\\EclipseIDEforJavaDevelopers-4.10\\\\serial\\\\Employee.ser");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	}

}
