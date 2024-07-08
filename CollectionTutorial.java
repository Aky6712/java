import java.util.ArrayList;
import java.util.List;

public class CollectionTutorial {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2,25);
        System.out.println(list);
    }
}
