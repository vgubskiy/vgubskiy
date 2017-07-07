package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
* Тестовый класс для определения максимального
* значения из двух целочисленных чисел
* @version 1.0
* @since 07.07.2017
* @author Valeriy Gubskiy
*/
public class MaxTest {
	/**.
	* Тест метода, который возвращает максимальное значение из двух
	*/
	@Test
	public void whenFirstGtSecondThenTrue() {
		Max max = new Max();
		int result = max.max(3, 5);
		int expected = 5;
		assertThat(result, is(expected));
	}
}