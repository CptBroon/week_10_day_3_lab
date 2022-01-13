package staff.management;

public class Director extends Manager{

    private double budget;
    public Director(String _name, String _nationalInsuranceNumber, double _salary, String _deptName, double _budget) {
        super(_name, _nationalInsuranceNumber, _salary, _deptName);
        this.budget = _budget;
    }

    public double getBudget() {
        return budget;
    }

    public Double payBonus() {
        return getSalary()/100;
    }
}
