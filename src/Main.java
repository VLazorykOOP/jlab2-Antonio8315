import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Lab 2");

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть ім'я: ");
        String name = in.nextLine();
        System.out.print("Введіть прізвище: ");
        String surname = in.nextLine();
        System.out.print("Введіть розмір зарплати: ");
        double salary = in.nextDouble();
        System.out.print("Введіть рік прийому на роботу: ");
        int year = in.nextInt();
        System.out.print("Введіть місяць прийому на роботу: ");
        int month = in.nextInt();
        System.out.print("Введіть день прийому на роботу: ");
        int day = in.nextInt();
        System.out.print("Введіть відсоток надбавки: ");
        int bonus = in.nextInt();
        System.out.print("Введіть податок: ");
        int tax = in.nextInt();
        System.out.print("Кількість відпрацьованих днів в місяць: ");
        int number_of_employees_days_in_a_month = in.nextInt();

        Payment employee1 = new Payment(surname, name, salary, year, month, day, bonus, tax, number_of_employees_days_in_a_month);
        System.out.println(employee1.toString());

        Payment employee2 = new Payment("Зубенко", "Міхаєль");
        System.out.println(employee2.toString());

        Payment employee3 = new Payment();
        System.out.println(employee3.toString());

        System.out.println("Кількість працівників: " + Payment.getEmployeeCount());

        if (employee1.equals(employee2)) {
            System.out.println("Працівники однакові.");
        } else {
            System.out.println("Працівники різні.");
        }

        //////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Прямокутник 1:");
        System.out.print("Введіть сторону A: ");
        float sideA1 = in.nextFloat();
        System.out.print("Введіть сторону B: ");
        float sideB1 = in.nextFloat();

        Rectangle rectangle1 = new Rectangle(sideA1, sideB1);
        System.out.println(rectangle1.toString());



        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2.toString());

        // Порівняння периметрів
        if (rectangle1.equals(rectangle2) && rectangle1.isSimilar(rectangle2)) {
            System.out.println("\nПрямокутники рівні.");
        } else {
            System.out.println("\nПрямокутники різні.");
        }

        // Перевірка на подібність
        if (rectangle1.isSimilar(rectangle2)) {
            System.out.println("Прямокутники подібні.");
        } else {
            System.out.println("Прямокутники не подібні.");
        }

        System.out.println("\nПрямокутник 2:");
        System.out.print("Введіть сторону A: ");
        float sideA2 = in.nextFloat();
        System.out.print("Введіть сторону B: ");
        float sideB2 = in.nextFloat();

        Rectangle rectangle3 = new Rectangle(sideA2, sideB2);
        System.out.println(rectangle3.toString());

        // Порівняння периметрів
        if (rectangle1.equals(rectangle3)) {
            System.out.println("\nПрямокутники рівні.");
        } else {
            System.out.println("\nПрямокутники різні.");
        }

        // Перевірка на подібність
        if (rectangle1.isSimilar(rectangle3)) {
            System.out.println("Прямокутники подібні.");
        } else {
            System.out.println("Прямокутники не подібні.");
        }

        ////////////////////////////////////////////////////////////////////////////

        System.out.print("Введіть номер дня в році: ");
        int dayOfYear = in.nextInt();
        System.out.print("Введіть рік: ");
        int year1 = in.nextInt();

        CustomCalendar customCalendar1 = new CustomCalendar();
        System.out.println(customCalendar1.toString());
        CustomCalendar customCalendar = new CustomCalendar(dayOfYear, year);
        System.out.println(customCalendar.toString());
        in.close();

    }
}