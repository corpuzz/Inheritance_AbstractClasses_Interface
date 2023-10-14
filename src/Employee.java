import java.util.Scanner;
public abstract class Employee implements PartTimeEmployee, PermanentEmployee {
    private String name;
    private double salary;
    private  char type;

    public double calculatePartTimeSalary(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter days attended: ");
        int daysAttended = input.nextInt();
        setRate();
        return daysAttended*getRate();
    }
    public double calculateFullTimeSalary(){
        return salary = 30_000;
    }
    public void setSalary(){
        if(getType() == 'F' || getType() == 'f'){
            salary = calculateFullTimeSalary();
        }else if(getType() == 'P' || getType() == 'p')
            salary = calculatePartTimeSalary();
    }

    // Setters and Getters
    public void setName(String name){
        this.name = name;
    }
    public void setType(char type) {
        this.type = type;
    }
    public  String  getName() {
        return name;
    }
    public char getType() {
        return type;
    }
    public double getSalary() {
        setSalary();
        return salary;
    }
}
