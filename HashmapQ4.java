import java.util.*;

public class HashmapQ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> myList = new LinkedList<Integer>(Arrays.asList(1, 3, 5, 7 , 9 , 11));
        HashMap<Integer,Integer> hashList = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < myList.size(); i++){
            hashList.put(i, myList.get(i));
        }

        System.out.println("Original List(HashMap): " + hashList);
        System.out.print("Enter a integer to be put inside the list: ");
        int newNum = input.nextInt();
        
        System.out.println("List after adding integer: " + addAndSort(hashList, newNum) );
        input.close();
    }

    public static HashMap<Integer, Integer> addAndSort(HashMap<Integer, Integer> hashMap, int value){
        hashMap.put(hashMap.size(), value);

        //Create a list from elements of HashMap
        List< Map.Entry<Integer, Integer> > list =
            new LinkedList<Map.Entry<Integer, Integer> >(hashMap.entrySet());
        
        //Sort the list
        Collections.sort(list, new Comparator< Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                                Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}


