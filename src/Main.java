import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Nail Zinnurov
 * cobratms@gmail.com
 * on 09.10.2018
 */

public class Main {
    public static void main(String[] args) {
        Set<String> strSet= new HashSet<>();
        strSet.add("foo");
        strSet.add("buzz");
        strSet.add("bar");
        strSet.add("fork");
        strSet.add("bort");
        strSet.add("spoon");
        strSet.add("!");
        strSet.add("dude");
        System.out.println(removeEvenLength(strSet).toString());

    }

    private static Set<String> removeEvenLength(Set<String> strSet) {
        String[] arr = strSet.toArray(new String[strSet.size()]);
        for (int i = 0; i < arr.length; i++) {
            if((arr[i].length() % 2) == 0) {
                for(int j = 0; j < strSet.size(); j++) {
                    if(strSet.contains(arr[i])) {
                        strSet.remove(arr[i]);
                    }
                }
            }
        }
        return strSet;

    }
}
