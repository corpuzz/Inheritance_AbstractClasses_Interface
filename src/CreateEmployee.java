public class CreateEmployee {
    public static void main(String[] args) {
        Cashier cashier1 = new Cashier();
        cashier1.setName("Mekus Insan");
        cashier1.setBranch("Baguio");
        cashier1.setType('p');

        System.out.println(cashier1.getName() + " at " + cashier1.getBranch() + " branch : ₱" + cashier1.getSalary());



    }
}
