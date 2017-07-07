package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
* Тестовый класс для определения положения точки
* по заданным координатам Х и У
* @version 1.0
* @since 07.07.2017
* @author Valeriy Gubskiy
*/
public class PointTest {
	/**.
	* Метод возвращает координату Х
	*/
	@Test
	public void whenSetXTwoThenGetTwo() {
		Point point = new Point(2, 5);
		int result = point.getX();
		int expected = 2;
		assertThat(result, is(expected));
	}
	/**.
	* Метод возвращает координату Х
	*/
	@Test
	public void whenSetYFiveThenGetFive() {
		Point point = new Point(2, 5);
		int result = point.getY();
		int expected = 5;
		assertThat(result, is(expected));
	}
	/**.
	* Метод проверяет принадлежит ли заданная точка с координатами X и Y
	* функции y(x) = a * x + b
	*/
	@Test
	public void isPointInFunction() {
		Point point = new Point(2, 5);
		boolean expected = true;
		boolean result = point.is(1, 3);
		assertThat(result, is(expected));
	}
}