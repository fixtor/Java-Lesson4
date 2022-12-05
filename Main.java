import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseUnsignedInt;

public class Main {
	public static void main(String[] args) {
		// Задание 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> temp = new LinkedList<>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Введите число:");
			String userInput = scanner.nextLine();
			temp.add(Integer.parseInt(userInput));
		}
		System.out.println(temp);
		ReverseLinkedList.setLinkedList(temp);
		System.out.println(ReverseLinkedList.getLinkedOut(temp));

		//Задание 2. Реализуйте очередь с помощью LinkedList со следующими методами:
		//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент
		// из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
		Scanner scanner1 = new Scanner(System.in);
		System.out.println(enqueue(temp, scanner1));
		System.out.println("Удаленный первый элемент в списке: ");

		System.out.println(Dequeue(temp)); // Удаляет и возвращает первый элемент
		System.out.println(temp);

		System.out.println("Первый элемент в очереди " + getFirst(temp));
	}

	public static LinkedList<Integer> enqueue(LinkedList<Integer> linkedList, Scanner scanner) {
		String userInput = scanner.nextLine();
		linkedList.addLast(Integer.parseInt(userInput));
		return linkedList;
	}

	public static Integer Dequeue(LinkedList<Integer> linkedList) {
		return linkedList.removeFirst();
	}

	public static Integer getFirst(LinkedList<Integer> linkedList) {
		return linkedList.getFirst();
	}
}
