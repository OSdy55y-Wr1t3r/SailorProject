
public class Salary extends Inheritance {
    private double weeklySalary;

    public Salary(String firstName,
                  String lastName,
                  String socialSecurityNumber,
                  double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if( weeklySalary < 0.0 ) {
            throw new IllegalArgumentException("Weekly Salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;

    }

    public void setWeeklySalary(double weeklySalary) {

        if( weeklySalary < 0.0 ){
            throw new IllegalArgumentException("Weekly Salary must be >= 0.0");
        }
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }


    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%, .2f",
                super.toString(),
                "weekly salary",
                getWeeklySalary());
    }
}
