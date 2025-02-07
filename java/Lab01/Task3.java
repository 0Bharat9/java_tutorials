public class Task3 {
    public static void main(String[] args) {
        // Example usage
        int days = 7000;
        String result = ageInYearsDetailed(days);
        System.out.println(result);
    }

    public static String ageInYearsDetailed(int days) {
        // Calculate years, months, and remaining days
        int years = days / 365;
        int remainingDaysAfterYears = days % 365;
        int months = remainingDaysAfterYears / 30;
        int remainingDays = remainingDaysAfterYears % 30;

        // Format the result string
        return "Age in days (" + days + "), age in years is (" + years + 
               "), months (" + months + "), with remaining days (" + remainingDays + ")";
    }
}

