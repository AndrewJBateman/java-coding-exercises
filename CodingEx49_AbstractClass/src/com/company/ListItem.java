package com.company;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
        this.rightLink = null;
        this.leftLink = null;
    }

    abstract ListItem next();
    abstract void setNext(ListItem item);
    abstract ListItem previous();
    abstract void setPrevious(ListItem item);
    abstract int compareTo(ListItem item);

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
