package com.company;

public class SearchTree implements NodeList{
    private ListItem root;

    public SearchTree(ListItem root) {
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
        while (true) {
            if(currentItem.compareTo(item) > 0) {
                if(currentItem.previous() == null) {
                    currentItem.setPrevious(item);
                    return true;
                } else {
                    currentItem = currentItem.previous();
                    continue;
                }
            }
            if(currentItem.compareTo(item) < 0) {
                if(currentItem.next() == null) {
                    currentItem.setNext(item);
                    return true;
                } else {
                    currentItem = currentItem.next();
                    continue;
                }
            }
            break;
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }


    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null) {
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            if (parent.next() == item) {
                 parent.setNext(item.next());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        } else {
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if (leftmostParent == item) {
                item.setNext(current.next());
            } else {
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if(root != null) {
            if(root.previous() != null) {
                traverse(root.previous());
            }
            System.out.println(root.getValue().toString());
            if(root.next() != null) {
                traverse(root.next());
            }
        }

    }
}
