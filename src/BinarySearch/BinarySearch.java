package BinarySearch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by rickx058 on 12/17/15.
 */
public class BinarySearch {

    public static class IntegerComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }


    public static <T> Integer search(List<T> list,T obj,Comparator<T> comparator){
        return doSearch(list,obj,0,list.size()-1,comparator);
    }

    private static <T> Integer doSearch(List<T> list, T obj, int start, int end,Comparator<T> comparator){
        if(start>end){
            return -1; //Not Found
        }else{
            int middle = start+ (end-start)/2;
            int result = comparator.compare(obj, list.get(middle));

            if(result == 0){
                return middle;
            }else if(result<0){
                return doSearch(list,obj,start,middle-1,comparator);
            }else{
                return doSearch(list,obj,middle+1,end,comparator);
            }
        }


    }

    public static void main(String args[] ){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(10);
        System.out.println(BinarySearch.search(list,9,new IntegerComparator()));

    }
}
