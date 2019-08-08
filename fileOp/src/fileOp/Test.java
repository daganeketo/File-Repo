package fileOp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("Bike","Mountain");
		Vehicle v2 = new Vehicle("Car","Hyundai");
		Vehicle v13 = new Vehicle("Truck","Volvo");

		
		try {
			FileOutputStream fos = new FileOutputStream("Krishna.dat", true);
			ObjectOutputStream objs = new ObjectOutputStream(fos);
			objs.writeObject(v1);
			objs.writeObject(v2);
			objs.writeObject(v13);
		
			
			objs.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("Krishna.dat");
			ObjectInputStream objis = new ObjectInputStream(fis);
			Vehicle v3 = (Vehicle) objis.readObject();
			Vehicle v4 = (Vehicle) objis.readObject();
			Vehicle v5 = (Vehicle) objis.readObject();
	
			System.out.println("Vehicle v1 :"+v3);
			System.out.println("Vehicle v2:"+v4);
			System.out.println("Vehicle v3:"+v5);
			
			
			
			objis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
