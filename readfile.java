import java.io.*;

import javax.xml.ws.Endpoint;
import javax.xml.ws.EndpointReference;
public class readfile {
    public void readdata(){
        try{
            FileInputStream file = new FileInputStream("Employee.bin");
            ObjectInputStream reader = new ObjectInputStream(file);
            Employee e = (Employee) reader.readObject();
            e.Display();
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error of file not found and io exception");
        }
    }
}
