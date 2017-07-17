package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**.
 * Тест класса RotateArray
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 17.07.2017
 */
public class RotateArrayTest {
	/**.
	 * Тест метода rotate на двумерном квадратном массиве
	 */
	@Test
	public void whenRotateSquareArrayThenRotatedArray() {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		RotateArray rotate = new RotateArray();
		int[][] result = rotate.rotate(arr);
		int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(result, is(expected));
	}
	/**.
	 * Тест метода rotate на двумерном прямоугольном массиве
	 */
	@Test
	public void whenRotateRectangleArrayThenRotatedArray() {
		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
		RotateArray rotate = new RotateArray();
		int[][] result = rotate.rotate(arr);
		int[][] expected = {{5, 1}, {6, 2}, {7, 3}, {8, 4}};
		assertThat(result, is(expected));
	}
}