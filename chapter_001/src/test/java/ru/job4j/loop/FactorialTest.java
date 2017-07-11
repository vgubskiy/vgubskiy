package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
* Тест класса Factorial
* @version 1.0
* @since 11.07.2017
* @author Valeriy Gubskiy
*/
public class FactorialTest {
	/**.
	* Тест мтода calc
	* Метод вычисляет факториал заданного числа
	*/
	@Test
	public void whenFactorialOfFiveThenOneHundredTwenty() {
		Factorial fct = new Factorial();
		int result = fct.calc(5);
		int expected = 120;
		assertThat(result, is(expected));
	}
}