package com.company;

public class MyLinkedList implements NodeList {
    ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (root == null) {
            root = item;
            return true;
        }

        ListItem currentItem = root;
        while (currentItem.next() != null) {
            if (currentItem.compareTo(item) > 0) {
                if (currentItem.previous() != null) {
                    item.setPrevious(currentItem.previous());
                    currentItem.previous().setNext(item);
                } else root = item;
                currentItem.setPrevious(item);
                item.setNext(currentItem);
                return true;
            }
            if (currentItem.compareTo(item) == 0) return false;
            currentItem = currentItem.next();
        }
        currentItem.setNext(item);
        item.setPrevious(currentItem);
        return true;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (root != null) {
            ListItem currentItem = root;
            while (currentItem != null) {
                if (currentItem.compareTo(item) == 0) {
                    currentItem.previous().setNext(currentItem.next());
                    currentItem.next().setPrevious(currentItem.previous());
                    return true;
                }
                currentItem = currentItem.next();
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            while (root != null) {
                System.out.println(root.getValue().toString());
                root = root.next();
            }
        } else {
            System.out.println("The list is empty");
        }
    }
}
