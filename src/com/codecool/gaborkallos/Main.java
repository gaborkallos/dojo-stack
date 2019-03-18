package com.codecool.gaborkallos;

import com.codecool.gaborkallos.stack.DynamicStack;
import com.codecool.gaborkallos.stack.StaticStack;

public class Main {

    public static void main(String[] args) {
//        staticStack();
        DynamicStack();
    }

    private static void DynamicStack() {
        DynamicStack dynamicStack = new DynamicStack();
        try{
           dynamicStack.push("1");
           dynamicStack.push("2");
           dynamicStack.push("3");
            System.out.println(dynamicStack.toString());
            System.out.println(dynamicStack.pop());
            dynamicStack.push("5");
            System.out.println(dynamicStack.toString());
            System.out.println(dynamicStack.peek());
            System.out.println("size of dynamic stack: " + dynamicStack.getSize());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static void staticStack() {
        StaticStack staticStack = new StaticStack(5);
        try{
            staticStack.peek();
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            staticStack.push("one");
            staticStack.push("two");
            System.out.println(staticStack.peek());
            staticStack.push("three");
            System.out.println(staticStack.toString());
            staticStack.pop();
            System.out.println(staticStack.peek());
            staticStack.pop();
            System.out.println(staticStack.peek());
            staticStack.pop();
            System.out.println(staticStack.toString());
            staticStack.push("1");
            staticStack.push("2");
            System.out.println(staticStack.getSize());
            staticStack.push("3");
            staticStack.push("4");
            staticStack.push("5");
            System.out.println(staticStack.toString());
            System.out.println(staticStack.getSize());
            staticStack.push("6");


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
