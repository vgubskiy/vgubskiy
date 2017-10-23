package ru.job4j.shapes;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Класс теста для квадрата
 */
public class SquareTest {
    /**.
     * Метод отрисовки квадрата
     */
    @Test
    public void whenDrawSquareThenReturnSquare() {
        Shape square = new Square();
        Paint paint = new Paint(square);
        String figure = paint.pic();
        assertThat(figure, is("***\n***\n***"));
    }
}
