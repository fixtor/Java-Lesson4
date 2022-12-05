import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ReverseLinkedList {

	private static LinkedList <Integer> linkedIn = new LinkedList();

	public static void setLinkedList(LinkedList<Integer> linkedList) {
		ReverseLinkedList.linkedIn = linkedList;
	} //Собираем объект из сканера в LInkedList

	public static LinkedList<Integer> getLinkedOut(LinkedList<Integer> linkedIn) {
		return linkedListReverse(linkedIn);
	}

	private static LinkedList<Integer> linkedListReverse(LinkedList<Integer> linkedIn){
		ArrayDeque <Integer> arrayDeque = new ArrayDeque(linkedIn.size());
		LinkedList <Integer> linkedOut = new LinkedList<>();
		for(int i = 0; i< linkedIn.size(); i++){
			arrayDeque.addLast(linkedIn.get(i));
			linkedOut.addFirst(arrayDeque.getLast());
		}
		return linkedOut;
	}
}
