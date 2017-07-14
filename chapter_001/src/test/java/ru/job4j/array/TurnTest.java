package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**.
 * Тест класса Turn
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 14.07.2017
 */
public class TurnTest {
	/**.
	 * Тест метода back с четным числом элементов массива
	 */
	@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		int[] arr = {1, 2, 3, 4};
		Turn turn = new Turn();
		int[] result = turn.back(arr);
		int[] expected = {4, 3, 2, 1};
		assertThat(result, is(expected));
	}
	/**.
	 * Тест метода back с нечетным числом элементов массива
	 */
	@Test
	public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		int[] arr = {11, 3, 8, 44, 15};
		Turn turn = new Turn();
		int[] result = turn.back(arr);
		int[] expected = {15, 44, 8, 3, 11};
		assertThat(result, is(expected));
	}
}