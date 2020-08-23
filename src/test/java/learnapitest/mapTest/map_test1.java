package learnapitest.mapTest;

import java.util.*;

/**
 * 遍历map的三种方式
 * Created by sml
 * 2020/08/23 21:21
 */
public class map_test1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("语文", 88);
        map.put("数学", 98);
        map.put("英语", 118);
        map.put("物理", 128);
        map.put("化学", 1288);
//        System.out.println(map);
        Integer value = map.get("化学");
//        System.out.println(value);
//        map.remove("化学");
//        System.out.println(map);
        boolean containsKey = map.containsKey("语文");
//        System.out.println(containsKey);


        /**
         * 遍历key
         */
        Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println("=================key：" + s);
        }
        /**
         * 遍历键值对entry
         */
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : entries) {
            String key = stringIntegerEntry.getKey();
            Integer value1 = stringIntegerEntry.getValue();
            System.out.println("key:" + key + "\t" + "value:" + value1);
        }
        /**
         * 编辑value
         */
        List<Integer> values = (List<Integer>) map.values();
        for (Integer o : values) {
            System.out.println("============>value:" + o);
        }

    }
}
