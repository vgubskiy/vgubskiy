package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Тест класса Paint
 */
public class PaintTest {
	/**.
	 * Тест метода piramid
	 */
	@Test
	public void whenPiramidHeightThreeThenThreeRows() {
		Paint paint = new Paint();
		String line = System.getProperty("line.separator");
		String result = paint.piramid(3);
		String expect = String.format("  ^  %s ^^^ %s^^^^^", line, line);
		assertThat(result, is(expect));
	}
}