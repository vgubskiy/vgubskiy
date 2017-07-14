package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**.
 * Тест класса BubbleSort
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 14.07.2017
 */
public class BubbleSortTest {
	/**.
	 * Тест метода sort сориторвка пузырьком
	 */
	@Test
	public void whenSortArrayWithBubbleSortThenSortedArray() {
		int[] arr = {10, 2, 5, 7, 4, 8, 1, 9, 3, 6};
		BubbleSort sort = new BubbleSort();
		int[] result = sort.sort(arr);
		int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		assertThat(result, is(expected));
	}
}