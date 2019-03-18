package com.codecool.gaborkallos.stack;

import java.util.ArrayList;
import java.util.List;

public class DynamicStack extends Stack {

    private List<Object> items;


    public DynamicStack() {
        items = new ArrayList<>();
    }


    @Override
    public void push(Object newItem) {
        items.add(newItem);
        topItem = newItem;
    }


    @Override
    public Object pop() throws Exception {
        if (items.size() == 0) {
            throw new Exception("Stack is empty!");
        }
        Object result = items.get(items.size() - 1);
        items.remove(items.size() - 1);
        if (items.size() > 0) {
            topItem = items.get(items.size() - 1);
            return result;
        }
        topItem = null;
        return null;
    }

    @Override
    public Object peek() throws Exception {
        if (items.get(0) == null) {
            throw new Exception("Stack is empty!");
        }
        return topItem;
    }

    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public String toString() {
        return "items=" + items;
    }
}
