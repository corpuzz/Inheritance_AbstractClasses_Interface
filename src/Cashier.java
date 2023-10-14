import java.util.Scanner;

public class Cashier extends Employee {
    private String branch;
    private double rate;

    public void  setBranch(String branch){
        this.branch = branch;
    }
    public void setRate(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter rate/day: ");
        rate = input.nextDouble();
    }
    public  String getBranch(){
        return branch;
    }
    public double getRate(){
        return  rate;
    }
}
