package com.company;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    void setNext(ListItem item) {
        rightLink = item;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    void setPrevious(ListItem item) {
        leftLink = item;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null) {
            return (this.value.toString().compareTo(item.getValue().toString()));
        } else return -1;

    }
}
