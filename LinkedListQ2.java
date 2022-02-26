import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   
        LinkedList<Integer> myList = new LinkedList<Integer>();

        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(9);
        myList.add(11);

        System.out.println("List: " + myList );
        System.out.print("Enter two index from the list to be swapped: ");
        int firstInd = input.nextInt();
        int secondInd = input.nextInt();
        swapMethod(myList, firstInd, secondInd);
        input.close();
    }

    public static void swapMethod(LinkedList<Integer> list, int index1, int index2){
        if (index1 > list.size() || index2 > list.size()){
            System.out.println("Index not found in the list.");

        } else if (index1 == index2){
            System.out.println("Value is the same");
        } else{
            int val1 = list.get(index1);
            int val2 = list.get(index2);
            for (int i = 0; i < list.size(); i++){
                if (i == index1){
                    list.remove(index1);
                    list.add(i, val2);
                }
                if (i == index2){
                    list.remove(index2);
                    list.add(i, val1);
                }
            }
            System.out.println("Value at index " + index1 +  ": " + val1);
            System.out.println("Value at index " + index2 +  ": " + val2);
            System.out.println("New Swapped List: " + list);        
        }
    }
    
}
