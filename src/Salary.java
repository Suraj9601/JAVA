
public class Salary {
    public static void main(String[] args) {
        int salary = 25400;
        if (salary > 1000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println("New Salary is "+ salary);
    }
}
