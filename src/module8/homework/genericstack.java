package module8.homework;

import java.util.Stack;

public class genericstack <E> {
    Stack<E> stk = new Stack<E>();

    public void push(E obj){
        stk.push(obj);
    }

    public E pop (){
        E obj = stk.pop();
        return obj;
    }

}
