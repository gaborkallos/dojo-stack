package com.codecool.gaborkallos.stack;

public abstract class Stack {

    protected Object topItem;

    /**
     This method push an item to the stack
     */
    public abstract void push(Object Item) throws Exception;

    /**
     This method remove and return the top item from the stack
     */
    public abstract Object pop() throws Exception;

    /**
     This method return the top item from the stack
     */
    public abstract Object peek() throws Exception;

    public abstract int getSize();

}
