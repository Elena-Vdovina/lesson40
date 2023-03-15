package homework1;

// Создайте своё собственное исключение IncorrectWeightException и унаследуйте его
// от IllegalArgumentException.
// Добавьте ему конструктор, в который можно передавать одно целое число.
// При этом супер-класс IllegalArgumentException должен создаваться с сообщением об ошибке
// вида "Вес не может быть отрицательным: [некорректный вес]"
public class IncorrectWeight extends IllegalArgumentException {

}
