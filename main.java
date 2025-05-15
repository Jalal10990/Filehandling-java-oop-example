public class main {
    public static void main(String[] args) {
        Employee emp = new Employee(01, "Tanzeel", 500000);
        WriteFile obj =new WriteFile();
        obj.writeData(emp);

        readfile obj2 = new readfile();
        obj2.readdata();
    }
}
