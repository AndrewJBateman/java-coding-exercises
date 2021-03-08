package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyLinkedList myLinkedList = new MyLinkedList(new Node("ankara"));
        myLinkedList.addItem(new Node("canakkale"));
        myLinkedList.addItem(new Node("balıkesir"));
        myLinkedList.addItem(new Node("adana"));
        myLinkedList.removeItem(new Node("ankara"));
        myLinkedList.traverse(myLinkedList.getRoot());

        SearchTree st = new SearchTree(new Node("efe"));
        st.addItem(new Node("adnan"));
        st.addItem(new Node("tansel"));
        st.addItem(new Node("tansel"));
        st.addItem(new Node("zeynep"));
        st.addItem(new Node("atalay"));
        st.removeItem(new Node("adnan"));
        st.traverse(st.getRoot());
    }
}
