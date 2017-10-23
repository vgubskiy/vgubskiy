package ru.job4j.shapes;

/**.
 * Класс квадрат
 */
public class Square implements Shape {
    /**.
     * Метод отрисовки квадрата
     * @return - строка квадрата
     */
    @Override
    public String draw() {
        StringBuilder square = new StringBuilder();
        square.append("***");
        square.append("\n");
        square.append("***");
        square.append("\n");
        square.append("***");
        return square.toString();
    }
}
