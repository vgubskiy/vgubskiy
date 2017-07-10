package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**.
* Тест класса фигуры ТРЕУГОЛЬНИК
* @version 1.0
* @since 10.07.2017
* @author Valeriy Gubskiy
*/
public class TriangleTest {
	/**.
	* Тест метода, вычисляющего площадь треугольника
	*/
	@Test
	public void whenAreaSetThreePointsThenTriagleArea() {
		// создаем три точки по координатам Х и У
		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		Point c = new Point(2, 0);
		// создаем треугольник по терм точкам
		Triangle triangle = new Triangle(a, b, c);
		// вычисляем площадь треугольника
		double result = triangle.area();
		// задаем ожидаемый результат вычисления площади
		double expected = 2D;
		// проверяем результат и ожидаемое значение
		assertThat(result, closeTo(expected, 0.1));
	}
}