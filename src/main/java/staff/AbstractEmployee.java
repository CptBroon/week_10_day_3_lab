package staff;

public abstract class AbstractEmployee {

    private String name;
    private String nationalInsuranceNumber;
    private Double salary;

    public AbstractEmployee(String _name, String _nationalInsuranceNumber, double _salary) {
        this.name = _name;
        this.nationalInsuranceNumber = _nationalInsuranceNumber;
        this.salary = _salary;
    }

    public String getName() {
        return name;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(double increaseSalary){
        if (increaseSalary >= 0) {
            this.salary += increaseSalary;
        }
    }

    public Double payBonus() {
        return salary/100;
    }

    public void setName(String _name) {
        if(_name != null) {
            this.name = _name;
        }
    }
}
