package learnapitest.listTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by sml
 * 2020/08/23 20:52
 */
public class list_sort_test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("你");
        list.add("我");
//        list.add("小马老师");
//        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(list);


//        List<Character> list2 = new ArrayList<>();
//        list2.add('你');
//        list2.add('我');
//
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
//        System.out.println(list2);
    }
}
