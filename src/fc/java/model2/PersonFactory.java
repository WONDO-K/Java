package fc.java.model2;
@FunctionalInterface
public interface PersonFactory {
    public Person creat(String name, int age);
}
