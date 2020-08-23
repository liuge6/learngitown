package learnapitest.listTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 测试集合demo Created by sml 2020/08/23 20:12
 */
public class list_test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("123");
        list.add("xuexi");
        list.add("123");
        list.add("java");
//        System.out.println("list里面装的是啥：" + list);

        int size = list.size();
        System.out.println(size);

        boolean empty = list.isEmpty();
//        System.out.println("empty:" + empty);

        /**
         * 使用迭代器进行遍历集合
         */
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if ("123".equals(next)) {

            System.out.println("===========================list:>" + list);
            }
        }
    }
}
