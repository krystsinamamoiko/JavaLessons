package oop.sample08;

public class A {
    private static int iPrivVar;
    class B {
        void setPrivateOfA(int var)
        {
            A.iPrivVar = var;
        }
    }
}
