package ru.job4j.loop;
/**.
 * Класс шахматной доски
 * @since 11.07.2017
 * @version 1.0
 * @author Valeriy Gubskiy
 */
public class Board {
    /**.
     * Метод рисует доску из символов Х и пробелов
     * @param width - ширина доски
     * @param height - высота доски
	 * @return - строка
     */
    public String paint(int width, int height) {
        StringBuilder board = new StringBuilder("X");
        for (int i = 1; i <= width * height - 1; i++) {
            if (i % width == 0) {
                board.append(System.getProperty("line.separator"));
            }
            if (i % 2 == 0) {
                board.append("X");
            } else {
                board.append(" ");
            }
        }
        return board.toString();
    }
}