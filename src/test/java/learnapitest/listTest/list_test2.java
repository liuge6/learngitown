package learnapitest.listTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 测试集合使用泛型
 * Created by sml
 * 2020/08/23 20:41
 */
public class list_test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("list的值是多少:" + list);
        //Collections.sort 排序的api
        Collections.sort(list);
        System.out.println("list的值是多少:" + list);
    }
}
