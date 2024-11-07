package org.practice.trialerror;

public class TempImpl {

    public static void main(String[] args) {
        //System.out.println(A.class instanceof B);
        A a = new A();
        Class c = a.getClass();

    }

}

class A{
    public int a =10;
}

class B{

}


