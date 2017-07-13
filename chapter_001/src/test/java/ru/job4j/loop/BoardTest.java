package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Тест класса Board
 */
public class BoardTest {
	/**.
	 * Тест метода paint с полем 3 Х 3
	 */
	@Test
	public void whenDrawTreeToThreeThenThreeRowsAndThreeColums() {
		Board board = new Board();
		String result = board.paint(3, 3);
		String line = System.getProperty("line.separator");
		String expect = String.format("X X%s X %sX X", line, line);
		assertThat(result, is(expect));
	}
	/**.
	 * Тест метода paint с полем 5 Х 4
	 */
	@Test
	public void whenDrawFiveToFourThenFourRowsAndFiveColums() {
		Board board = new Board();
		String result = board.paint(5, 4);
		String line = System.getProperty("line.separator");
		String expect = String.format("X X X%s X X %sX X X%s X X ", line, line, line);
		assertThat(result, is(expect));
	}
}