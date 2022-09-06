class Solution {
    public static void main(String[] args) {
    }
}

final class Person {
    public final StringBuilder name;

    public Person() {
        name = new StringBuilder("original");
    }

    public final void modifyName(String name) {
        this.name.delete(0, this.name.length());
        this.name.append(name);
    }
}
