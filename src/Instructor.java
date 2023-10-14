import java.util.ArrayList;
public class Instructor extends Employee implements PermanentEmployee {
    private String title;
    private String department;
    private ArrayList<String> coursesTaught;

    public Instructor() {}

    @Override
    public void setRate() {}

    @Override
    public double getRate() { return 0.0; }


}
