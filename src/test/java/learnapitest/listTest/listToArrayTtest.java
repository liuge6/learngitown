package learnapitest.listTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合转换为数组
 * Created by sml
 * 2020/08/23 21:09
 */
public class listToArrayTtest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("王五");
        list.add("李六");
        list.add("张七");
        list.add("刘八");


        String s = list.get(1);
        for (int i = 0; i < list.size() ; i++) {
            String s1 = list.get(i);
            System.out.println("==========================>s1" + s1);

        }
        System.out.println(s);

//        Object[] objects = list.toArray();
        String[] strings = list.toArray(new String[list.size()]);
        System.out.println("len:"+strings.length);
        for (Object o : strings) {
            System.out.println("=========================>o:" + o);
        }



    }

}
