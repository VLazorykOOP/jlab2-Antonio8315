import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Payment {
    // Поля класу
    private String surname;
    private String name;
    private double salary;
    private Date hiredate;
    public int bonus_percentage;
    public int tax;
    public int number_of_employees_days_in_a_month;
    public int number_of_days_in_a_month;
    public double accrued_amount;
    public double withheld_amount;


    // Статичні поля
    private static int employeeCount = 0;
    private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

    // Ініціалізатор
    {
        name = "Noname N.";
        salary = 1005.01;
        hiredate = new GregorianCalendar().getTime();
        bonus_percentage = 40;
        tax = 10;
        number_of_employees_days_in_a_month = 21;
        number_of_days_in_a_month = 30;;
    }

    // Конструктори
    public Payment(String surname, String name, double salary, int year, int month, int day, int bonus_percentage, int tax, int number_of_employees_days_in_a_month) {
        this.surname = surname;
        this.name = name;
        this.salary = salary;
        this.hiredate = new GregorianCalendar(year, month - 1, day).getTime();
        this.bonus_percentage = bonus_percentage;
        this.tax = tax;
        this.number_of_employees_days_in_a_month = number_of_employees_days_in_a_month;
        employeeCount++;
    }

    public Payment(String surname, String name) {
        this.surname = surname;
        this.name = name;
        this.salary = 1000;
        this.hiredate = new GregorianCalendar(2017, 11, 31).getTime();
        employeeCount++;
    }

    public Payment() {
        employeeCount++;
    }

    // Статичний метод для отримання кількості працівників
    public static int getEmployeeCount() {
        return employeeCount;
    }

    // Методи класу
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    // Обчислення нарахованої суми
    public double calculateAccruedAmount() {
        accrued_amount = salary * number_of_employees_days_in_a_month
                + (salary * number_of_employees_days_in_a_month * bonus_percentage / 100);
        return accrued_amount;
    }

    // Обчислення утриманої суми
    public double calculateWithheldAmount() {
        withheld_amount = calculateAccruedAmount() - calculateAccruedAmount() * tax / 100;
        return withheld_amount;
    }

    // Обчислення стажу роботи
    public int calculateExperience() {
        Calendar hireCalendar = Calendar.getInstance();
        hireCalendar.setTime(hiredate);
        return CURRENT_YEAR - hireCalendar.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "Прізвище='" + surname + '\'' +
                ", Ім'я='" + name + '\'' +
                ", Заробітня плата=" + salary +
                ", Рік поступлення на роботу=" + hiredate +
                ", відсоток надбавки=" + bonus_percentage +
                ", податок=" + tax +
                ", кількість відпрацьованих днів в місяць=" +  number_of_employees_days_in_a_month +
                ", нарахована сума=" + calculateAccruedAmount() +
                ", утримана сума=" + calculateWithheldAmount() +
                ", досвід=" + calculateExperience() + " роки" +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Payment payment = (Payment) obj;

        if (Double.compare(payment.salary, salary) != 0) return false;
        if (!name.equals(payment.name)) return false;
        return hiredate.equals(payment.hiredate);
    }


}
