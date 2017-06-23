package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Test
 *
 * @author Valeriy Gubskiy
 * @since 23.06.2017
 * @version 1.0
 */

public class CalculateTest {
	/**.
	 * Test add
	 */
	@Test
	public void whenAddOneToOneThenTwo() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculate.main(null);
		assertThat(
			out.toString(),
			is(String.format("Hello World!%s", System.getProperty("line.separator")))
		);
	}
}