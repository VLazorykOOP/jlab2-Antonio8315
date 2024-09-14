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

    // Метод для порівняння периметрів двох прямокутників
    public boolean equals(Rectangle other) {
        return this.getPerimeter() == other.getPerimeter();
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
                "Сторона A=" + side_a +
                ", Сторона B=" + side_b +
                ", Периметр=" + getPerimeter() +
                ", Площа=" + getArea() +
                '}';
    }
}
