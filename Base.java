import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

class Base
{
    static void foo()
    {
        System.out.println("Base.foo()");
    }

    void nonStaticFoo() {
        System.out.println("Base.foo() : Non-static");
    }

    static void only() {
        System.out.println("Base.only()");
    }
}

class Derived extends Base implements NewInterface
{
    static void foo()
    {
        System.out.println("Derived.foo()");
    }

    void nonStaticFoo() {
        System.out.println("Derived.foo() : Non-static");
    }

    static void only() {
        System.out.println("Derived.only()");
    }

    @Override
    public void defaultFunc() {
        System.out.println("No. This is default");
    }
}

interface NewInterface {
    default void defaultFunc() {
        System.out.println("This is default");
    }
}


