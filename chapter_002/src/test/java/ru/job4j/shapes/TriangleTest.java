package ru.job4j.shapes;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Класс теста для треугольника
 */
public class TriangleTest {
    /**.
     * Метод отрисовки треугольника
     */
    @Test
    public void whenDrawTriangleThenReturnTriangle() {
        Shape triangle = new Triangle();
        Paint paint = new Paint(triangle);
        String figure = paint.pic();
        assertThat(figure, is("  *  \n *** \n*****"));
    }
}
