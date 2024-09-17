import java.util.Calendar;
import java.util.GregorianCalendar;

public class CustomCalendar {
    // Поля класу
    private int dayOfMonth;
    private int year1;
    private int month;
    private String dayOfWeek;

    // Ініціалізатор
    {
        GregorianCalendar currentDate = new GregorianCalendar();
        this.year1 = currentDate.get(Calendar.YEAR);
        this.dayOfMonth = 1;
        this.month = Calendar.JANUARY;
        this.dayOfWeek = "Понеділок";
    }

    public CustomCalendar(){

    }
    // Конструктор з вхідними параметрами
    public CustomCalendar(int dayOfYear, int year1) {
        this.year1 = year1;
        setDate(dayOfYear);
    }

    // Метод для встановлення дати на основі дня в році
    public void setDate(int dayOfYear) {
        GregorianCalendar calendar = new GregorianCalendar(year1, Calendar.JANUARY, 1);
        calendar.add(Calendar.DAY_OF_YEAR, dayOfYear - 1);

        this.month = calendar.get(Calendar.MONTH);
        this.dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        this.dayOfWeek = getDayOfWeekString(calendar.get(Calendar.DAY_OF_WEEK));
    }

    // Метод для перетворення числа дня тижня у рядкове значення
    private String getDayOfWeekString(int dayOfWeek) {
        switch (dayOfWeek-1) {
            case Calendar.SUNDAY:
                return "Неділя";
            case Calendar.MONDAY:
                return "Понеділок";
            case Calendar.TUESDAY:
                return "Вівторок";
            case Calendar.WEDNESDAY:
                return "Середа";
            case Calendar.THURSDAY:
                return "Четвер";
            case Calendar.FRIDAY:
                return "П'ятниця";
            case Calendar.SATURDAY:
                return "Субота";
            default:
                return "";
        }
    }

    // Метод для відображення результатів
    @Override
    public String toString() {
        return "Дата: " + (dayOfMonth) + " " + getMonthString(month) + ", " + dayOfWeek;
    }

    // Метод для перетворення числа місяця у рядкове значення
    private String getMonthString(int month) {
        switch (month) {
            case Calendar.JANUARY:
                return "Січня";
            case Calendar.FEBRUARY:
                return "Лютого";
            case Calendar.MARCH:
                return "Березня";
            case Calendar.APRIL:
                return "Квітня";
            case Calendar.MAY:
                return "Травня";
            case Calendar.JUNE:
                return "Червня";
            case Calendar.JULY:
                return "Липня";
            case Calendar.AUGUST:
                return "Серпня";
            case Calendar.SEPTEMBER:
                return "Вересня";
            case Calendar.OCTOBER:
                return "Жовтня";
            case Calendar.NOVEMBER:
                return "Листопада";
            case Calendar.DECEMBER:
                return "Грудня";
            default:
                return "";
        }
    }
}
