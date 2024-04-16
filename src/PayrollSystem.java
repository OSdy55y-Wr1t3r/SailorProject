public class PayrollSystem {
    public static void main(String[] args) {
        Salary salary =
                new Salary(
                        "Ned",
                        "Jones",
                        "323-33-3212",
                        10_000
                );

        System.out.printf("%n%s%n%s: $%, .2f%n%n",
                salary,
                "earned",
                salary.earnings());





    } //main end
} //class end
