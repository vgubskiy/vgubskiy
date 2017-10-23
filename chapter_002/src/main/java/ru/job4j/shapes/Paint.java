package ru.job4j.shapes;

/**.
 * Класс отрисовки фигур
 */
public class Paint {
    /**.
     * Создаем объект фигуры
     */
    private Shape shape;

    /**.
     * Задаем конструктор
     * @param shape - фигура для отрисовки
     */
    public Paint(Shape shape) {
        this.shape = shape;
    }

    /**.
     * Метод отрисовки фигуры
     * @return - строка с фигурой
     */
    public String pic() {
        return shape.draw();
    }
}
