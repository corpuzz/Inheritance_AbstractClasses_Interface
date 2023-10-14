import java.util.ArrayList;
public class Instructor extends Employee {
    private String title;
    private String department;
    private ArrayList<String> coursesTaught;

    public Instructor() {}

    @Override
    public void setRate() {} // for compliance only

    @Override
    public double getRate() { return 0.0; } // not applicable, for compliance only

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void addCoursesTaught(String course) {
        coursesTaught.add(course);
    }

}
