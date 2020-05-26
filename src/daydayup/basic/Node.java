package daydayup.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-26
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class Node {
    public int value;
    public List<Node> children;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, List<Node> children) {
        this.value = value;
        this.children = children;
    }

    public Node(int value, int[] sub) {
        this.value = value;
        this.children = generateNodeList(sub);
    }


    public static Node mockData() {
        Node node3 = new Node(3, new int[]{5, 6});
        List<Node> nodes = generateNodeList(new int[]{2, 4});
        nodes.add(0,node3);
        return new Node(1, nodes);
    }

    public static List<Node> generateNodeList(int[] arr) {
        if (arr == null) {
            return null;
        }
        List<Node> list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            list.add(new Node(arr[i]));
        }
        return list;
    }
}
