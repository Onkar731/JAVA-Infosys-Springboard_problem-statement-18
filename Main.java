import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int income = sc.nextInt();

        // finding income category using incomeCategory() method of Income class
        System.out.println(IncomeDepartment.incomeCategory(income));

        // closing resource
        sc.close();
    }
}
