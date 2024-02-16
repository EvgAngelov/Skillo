package lecture_05;

import java.util.LinkedList;

public class reverseLinkedList {
    public static void main(String[] args)
    {
        // Declaring linkedlist without any initial size
        LinkedList<String> linkedlist = new LinkedList<String>();
        // Appending elements at the end of the list
        linkedlist.add("Cherry");
        linkedlist.add("Chennai");
        linkedlist.add("Bullet");
        System.out.print("Elements before reversing: " + linkedlist);
        linkedlist = reverseLinkedList(linkedlist);
        System.out.print("\nElements after reversing: " + linkedlist);
    }

    // Takes a linkedlist as a parameter and returns a reversed linkedlist
    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            revLinkedList.add(llist.get(i));
        }
        // Return the reversed arraylist
        return revLinkedList;
    }
}
