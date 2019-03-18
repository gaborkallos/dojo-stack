package com.codecool.gaborkallos.stack;

import java.util.Arrays;

public class StaticStack extends Stack {

    private Object[] items;
    private int maxSize;

    public StaticStack(int maxSize) {
        this.maxSize = maxSize;
        items = new String[maxSize];
    }

    @Override
    public void push(Object newItem) throws Exception {
        if (items[maxSize - 1] != null) {
            throw new Exception("Stack is full! Couldn't put " + newItem + " to the stack!");
        } else {
            for (int i = 0; i < maxSize; i++) {
                if (items[i] == null) {
                    items[i] = newItem;
                    topItem = newItem;
                    break;
                }
            }

        }
    }

    @Override
    public Object pop() throws Exception {
        if (items[0] == null) {
            throw new Exception("Stack is empty!");
        } else {
            Object result;
            for (int i = maxSize - 1; i >= 0; i--) {
                if (items[i] != null && i > 0) {
                    result = items[i];
                    topItem = items[i - 1];
                    items[i] = null;
                    return result;
                }
            }
            topItem = null;
            result = items[0];
            items[0] = null;
            return result;
        }
    }

    @Override
    public Object peek() throws Exception {
        if (items[0] == null) {
            throw new Exception("Stack is empty!");
        }
        return topItem;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Object item : items) {
            if (item!=null){
                size++;
            }
        }
        return size;
    }

    @Override
    public String toString() {
        return "items= " + Arrays.toString(items);
    }
}
