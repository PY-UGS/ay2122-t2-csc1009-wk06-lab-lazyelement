import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LinkedListQ3 {
    public static void main(String[] args) {
        LinkedList<Integer> randomList = new LinkedList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 500; i++){
            randomList.add(rand.nextInt(1000, 9999));
        }
        System.out.println(randomList);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value to be search in the list: ");
        int value = input.nextInt();
    
        System.out.println("Index for value " + value + " is: " + valueSearch(randomList, value));

        input.close();
    }

    public static int valueSearch(LinkedList<Integer> list, int value){
        int result = list.indexOf(value);
        return result;
    }
}
