import java.util.*;

public class Text1 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("c");
        set.add("b");
        set.add("a");
        set.add("B");
        set.add("A");
        set.add("C");
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("A");
        list.add("B");
        System.out.println(set);
        System.out.println(list);
    }
}
