import java.util.Scanner;

public class Cashier extends Employee {
    private String branch;
    private double rate;

    public Cashier() {}
    @Override
    public void setRate(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter rate/day: ");
        rate = input.nextDouble();
    }
    public double getRate(){
        return  rate;
    }
    public void  setBranch(String branch){
        this.branch = branch;
    }
    public  String getBranch(){
        return branch;
    }
}
