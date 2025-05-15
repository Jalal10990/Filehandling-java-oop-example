import java.io.*;
class WriteFile {
public void writeData(Employee p){

    try {
        FileOutputStream file = new FileOutputStream("EmployeeData.bin");
        ObjectOutputStream writer = new ObjectOutputStream(file);
        writer.writeObject(p);
    }
    catch(FileNotFoundException  ex){
        ex.printStackTrace();
    }
    catch(IOException ex){
        ex.printStackTrace();
    }
}
}
