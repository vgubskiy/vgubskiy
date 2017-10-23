package ru.job4j.shapes;

/**.
 * Класс треугольник
 */
public class Triangle implements Shape {
    /**.
     * Метод отрисовки треугольника
     * @return - строка треугольника
     */
    @Override
    public String draw() {
        StringBuilder triangle = new StringBuilder();
        triangle.append("  *  ");
        triangle.append("\n");
        triangle.append(" *** ");
        triangle.append("\n");
        triangle.append("*****");
        return triangle.toString();
    }
}
