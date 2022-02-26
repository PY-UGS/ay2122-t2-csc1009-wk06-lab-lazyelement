import java.util.*;
public class HashmapQ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, Integer> hashList = new HashMap<Integer, Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1 , 3, 5, 7, 9 ,11));
        
        for (int i = 0; i < list.size(); i++){
            hashList.put(i, list.get(i));
        }

        System.out.println("HashMap before Swap: " + hashList);
        System.out.print("Enter two index to be swap: ");
        int index1 = input.nextInt();
        int index2 = input.nextInt();

        swapVal(hashList, index1, index2);

        System.out.println("HashMap After Swap: " + hashList );
        input.close();
    }

    public static void swapVal(HashMap<Integer, Integer> hashMap, int ind1, int ind2){
        System.out.print("Value at index " + ind1 + ": " + hashMap.get(ind1));
        System.out.println(" | Value at index " + ind2 + ": " + hashMap.get(ind2));
        
        int temp = hashMap.get(ind1);
        hashMap.put(ind1, hashMap.get(ind2));
        hashMap.put(ind2, temp);
        
        //System.out.println("Values after swapping: " + ind1 + ": " + hashMap.get(ind1) + " | " + ind2 + ": " + hashMap.get(ind2));
    
    }
}
