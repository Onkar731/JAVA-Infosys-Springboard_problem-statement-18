public class IncomeDepartment {
    public static String incomeCategory(int income) {
        String category = "NP";
        // finding income category
        if(income > 6250) {
            category = "Above poverty line";
        } else {
            category = "Below poverty line";
        }

        return category;
    }
}
