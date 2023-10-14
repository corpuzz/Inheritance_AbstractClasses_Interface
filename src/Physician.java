public class Physician extends Employee {
    private String specialization;
    private int licenseNumber;

    public Physician() {}

    @Override
    public void setRate() {} // for compliance only

    @Override
    public double getRate() { return 0.0; } // not applicable, for compliance only

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }
}

