class StaticDynamicPolymorphism {
}

// static
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// dynamic
class A {
    public void print() {
        System.out.println("Original");
    }
}

class B extends A {
    @Override
    public void print() {
        System.out.println("Overriding");
    }
}
