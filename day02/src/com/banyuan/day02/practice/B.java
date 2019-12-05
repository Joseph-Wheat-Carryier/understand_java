package com.banyuan.day02.practice;

public class B{
    void g(InterfaceA a){
        a.f();
    }

    void g(int a,double b){}
    void g(double a,int b){}

    public static void main(String[] args) {
        B b = new B();
        b.g(new A());
    }
}
