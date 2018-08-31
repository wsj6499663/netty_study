package com.bjsxt.test;

import java.util.HashMap;
import java.util.Map;

public class TriceTree {
    private Node rt = new Node();

    public void insert(String str) {
        Node root = rt;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (!root.children.containsKey(temp)) {
                Node node = new Node();
                root.children.put(temp, node);
                root = node;//deep into othe bottom
            } else {
                root = root.children.get(temp);//deep into the bottom
            }
        }
        root.isEnd = true;
    }

    public boolean constains(String str) {
        Node tempRoot = rt;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (!tempRoot.children.containsKey(temp) || tempRoot.isEnd)
                return false;
            tempRoot = tempRoot.children.get(temp);

        }

        return true;
    }

    public void delete(String str) {
    Node pt = rt;
//        for (int i = 0; i < str.length(); i++) {
//            char tp = str.charAt(i);
//             if(tp)
//        }
    }


    class Node {
        Map<Character, Node> children = new HashMap<Character, Node>();
        boolean isEnd;
    }

    public static void main(String[] args) {
        String str = "wol";
        TriceTree triceTree = new TriceTree();
        triceTree.insert(str);
        triceTree.insert("wwe");
//        triceTree.insert("we");
        //  triceTree.insert("wsj");
        // triceTree.insert("jaxk");

        //System.out.println(triceTree.constains("jax"));


    }
}
