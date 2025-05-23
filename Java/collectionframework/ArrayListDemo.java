package collectionframework;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> arrList = new ArrayList<>(Arrays.asList(10 , 20 , 30 , 50 , 60));
        arrList.add(20);
        List<Integer> arrList2 = new ArrayList<>();
        arrList2.add(5);
        arrList2.add(2);
        arrList.addAll(arrList2);
        System.out.println(arrList);

        //Retrieves the element at the given index
        System.out.println(arrList.get(0));
        //Updates the element at the specified index
        arrList.set(1 , 11);
        System.out.println(arrList.get(1));
        arrList.remove(1);
        System.out.println(arrList);
        int pos = arrList.indexOf(50);
        System.out.println(pos);

        //Iteraration using List Iterator
        ListIterator<Integer> listIterator = arrList.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        Integer[] arr = arrList.toArray(new Integer[0]);
        for(int val : arr){
            System.out.println(val);
        }
        arrList.forEach(System.out::println);


    }
}
