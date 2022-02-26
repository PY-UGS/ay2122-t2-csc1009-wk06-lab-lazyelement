import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListQ1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   
        LinkedList<Integer> myList = new LinkedList<Integer>();

        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(9);
        myList.add(11);

        System.out.println("Original Sorted List: " + myList );
        System.out.print("Enter an integer to be added into the linked list:");
        int newInt = input.nextInt();
        addAndSort(myList, newInt);
        System.out.println("New Sorted List: " + myList);
        input.close();
    }

    public static void addAndSort(LinkedList<Integer> list, int value){
        for(int i = 0; i < list.size(); i++){
            if(value < list.get(i)){
                list.add(i, value);
                return;
            }
        }
        list.add(value);
    }
}
