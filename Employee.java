import java.io.Serializable;

class Employee implements Serializable{

    private int id;
    String name;
    double salary;

    Employee(int i, String n, double s){
        id = i;
        name =  n;
        salary = s;
    }
    public void Display(){
        System.out.println("Employee id is :" + id);
        System.out.println("Employee name is :" + name);
        System.out.println("Employee Salary is :" + salary);

    }
}