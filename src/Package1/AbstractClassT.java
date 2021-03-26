package Package1;

abstract class Base {
    Base()
    {
        System.out.println("Base Constructor Called");
    }
    abstract void fun();
    public void fun2() {
    	System.out.println("Inside Base");
    }
    
    private void fun3() {
    	System.out.println("Derived fun3() called");
    }
    
}
class Derived extends Base {
    Derived()
    {
        System.out.println("Derived Constructor Called");
    }
    void fun()
    {
        System.out.println("Derived fun() called");
    }
    
    public void fun3() {
    	System.out.println("Derived fun3() called");
    }
}
class AbstractClassT {
    public static void main(String args[])
    {
    	Base d = new Derived();
        d.fun();
        d.fun2();       
    }
}
