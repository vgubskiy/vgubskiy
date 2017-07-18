package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**.
 * Тест класса ArrayDublicate
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 17.07.2017
 */
public class ArrayDublicateTest {
	/**.
	 * Тест метода remove
	 */
	@Test
	public void whenDublicatesInArrayThenArrayWhithoutDublicates() {
		String[] arr = {"Привет", "Мир", "Привет", "Супер", "Мир"};
		ArrayDublicate remove = new ArrayDublicate();
		String[] result = remove.remove(arr);
		String[] expected = {"Привет", "Мир", "Супер"};
		assertThat(result, is(expected));
	}
}