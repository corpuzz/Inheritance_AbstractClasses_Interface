public class CreateEmployee {
    public static void main(String[] args) {
        // Cashier Employee
        Cashier cashier = new Cashier();
        cashier.setName("Mekus Insan");
        cashier.setType('p');
        cashier.setBranch("Baguio");
        System.out.println("*========= CASHIER INFORMATION ========*");
        System.out.println("Name: " + cashier.getName() + "\nBranch: " + cashier.getBranch() + "\nSalary: ₱" + cashier.getSalary());
        System.out.println();

        // Physician Employee
        Physician physician = new Physician();
        physician.setName("Badong Balong");
        physician.setType('f');
        physician.setSpecialization("Cardiology");
        physician.setLicenseNumber(0222445);
        System.out.println("*========= PHYSICIAN INFORMATION ========*");
        System.out.println("Name: " + physician.getName() + "\nSpecialization: " + physician.getSpecialization() +
                           "\nLicense Number: " + physician.getLicenseNumber() + "\nSalary: ₱" + physician.getSalary());
        System.out.println();

        // Instructor Employee
        Instructor instructor = new Instructor();
        instructor.setName("Johnny Bravo");
        instructor.setType('f');
        instructor.setTitle("Instructor");
        instructor.setDepartment("CIT");
        instructor.addCoursesTaught("Data Structures and Algorithms");
        instructor.addCoursesTaught("Object Oriented Programming");
        System.out.println("*========= INSTRUCTOR INFORMATION ========*");
        System.out.println("Name and title: " + instructor.getTitle() + " " + instructor.getName() + "\nDepartment: " +
                           instructor.getDepartment() + "\nCourses Taught: " + instructor.getCoursesTaught() + "\nSalary: ₱" + instructor.getSalary());

    }
}
