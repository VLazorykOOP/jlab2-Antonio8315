import java.util.Objects;

public class Rectangle {
    // Поля класу
    private float side_a;
    private float side_b;

    // Ініціалізатор
    {
        side_a = 5.5f;
        side_b = 2.5f;
    }

    // Конструктори
    public Rectangle(float side_a, float side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public Rectangle() {
    }

    // Методи для знаходження периметра
    public float getPerimeter() {
        return (side_a + side_b) * 2;
    }

    // Метод для знаходження площі
    public float getArea() {
        return side_a * side_b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(side_a, rectangle.side_a) == 0
                && Float.compare(side_b, rectangle.side_b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side_a, side_b);
    }

    // Метод для визначення подібності (співвідношення сторін)
    public boolean isSimilar(Rectangle other) {
        float thisRatio = side_a / side_b;
        float otherRatio = other.side_a / other.side_b;
        return Math.abs(thisRatio - otherRatio) < 0.001;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side_a=" + side_a +
                ", side_b=" + side_b +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
