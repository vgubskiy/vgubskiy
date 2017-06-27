package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
* Класс теста калькулятора. Выполняет тесты 4ех математических операций:
* сложение, вычитание, умножение, деление
* @author Valeriy Gubskiy
* @version 1.0
* @since 27.06.2017
*/

public class CalculatorTest {
	/**.
	* Класс теста калькулятора
	*/
	@Test
	/**.
	* Тест метода сложения
	*/
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
	/**.
	* Тест метода вычитания
	*/
	@Test
	public void whenAddOneMinusOneThenZero() {
		Calculator calc = new Calculator();
		calc.substruct(1D, 1D);
		double result = calc.getResult();
		double expected = 0;
		assertThat(result, is(expected));
	}
	/**.
	* Тест метода умножения
	*/
	@Test
	public void whenAddTwoMultipleTwoThenFour() {
		Calculator calc = new Calculator();
		calc.multiple(2D, 2D);
		double result = calc.getResult();
		double expected = 4D;
		assertThat(result, is(expected));
	}
	/**.
	* Тест метода деления
	*/
	@Test
	public void whenAddFourDivTwoThenTwo() {
		Calculator calc = new Calculator();
		calc.div(4D, 2D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
}