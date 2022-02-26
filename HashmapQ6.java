import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class HashmapQ6  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        HashMap<Integer, Integer> hashList = new HashMap<Integer, Integer>();

        for (int i = 0; i < 500; i++){
            hashList.put(i, rand.nextInt(1000,9999));
        }

        System.out.println("Hashmap: " + hashList);
        System.out.print("Enter a value to be search in the list: ");
        int value = input.nextInt();

        searchValue(hashList, value);
        input.close();
    }

    public static void searchValue(HashMap<Integer, Integer> hashMap, int value){
        for(Entry<Integer, Integer> entry: hashMap.entrySet()) {
            // if give value is equal to value from entry
            // print the corresponding key
            if(entry.getValue() == value) {
              System.out.println("The key for value " + value + " is " + entry.getKey());
            }
        }
    }
}