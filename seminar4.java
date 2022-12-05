import java.util.LinkedList;
import java.util.Scanner;
/*Реализовать консольное приложение, которое в цикле:
Принимает от пользователя строку вида
text~num
Нужно разделить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.*/

public class seminar4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<String> strings = new LinkedList<>();

		while (true) {
			System.out.printf("Введите текст ~ index, индекс <= %d", strings.size());
			System.out.println();


			String userInput = scanner.nextLine();
			if (userInput.equals("quit")) return;
			String[] parts = userInput.split("~");

			if (parts.length != 2) throw new IllegalStateException("Wrong text");
			if (parts[0].equals("print"))
				System.out.println(strings.remove(Integer.parseInt(parts[1])));

			else {
				strings.add(Integer.parseInt(parts[1]), parts[0]);
			}
			System.out.println(strings);
		}
	}
}
