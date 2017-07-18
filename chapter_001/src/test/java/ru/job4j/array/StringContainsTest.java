package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**.
 * Тест класса StringContains
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 18.07.2017
 */
public class StringContainsTest {
	/**.
	 * Тест метода cont
	 */
	@Test
	public void whenStringContainsSpecialWordThenTrue() {
		String string = "Hello Java world!";
		String find = "llo Jav";
		StringContains isContains = new StringContains();
		Boolean result = isContains.cont(string, find);
		Boolean expected = true;
		assertThat(result, is(expected));
	}
}