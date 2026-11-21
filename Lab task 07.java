public class Main {

    // Calculates the salary by multiplying the hours worked by the hourly rate.
    public static int calculateSalary(int hours, int rate) {
        return hours * rate;
    }

    // Returns the category ("High", "Medium", or "Low") based on the salary amount.
    public static String getCategory(int salary) {
        if (salary >= 50000) {
            return "High";
        } else if (salary >= 30000) {
            return "Medium";
        } else {
            return "Low";
        }
    }

    // Checks whether the worked hours fall within the valid range of 0 to 60.
    public static boolean isValid(int hours) {
        return hours >= 0 && hours <= 60;
    }

    public static void main(String[] args) {
        String[] names = {"Hina", "Omar", "Zara", "Bilal"};
        int[] hours = {40, 25, 70, 55};
        int rate = 1000;

        int validEmployees = 0;
        int totalSalary = 0;

        for (int i = 0; i < names.length; i++) {
            if (!isValid(hours[i])) {
                System.out.println("Invalid hours for " + names[i]);
                continue;
            }

            int salary = calculateSalary(hours[i], rate);
            String category = getCategory(salary);

            System.out.println(names[i] + ": " + hours[i] + " hours, Rs " + salary + " " + category);

            validEmployees++;
            totalSalary += salary;
        }

        double averageSalary = validEmployees > 0 ? (double) totalSalary / validEmployees : 0.0;

        System.out.println("Valid employees: " + validEmployees);
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Average salary: " + averageSalary);
    }
}
