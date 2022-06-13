package question3;

public class HashIndex {
    public int calHashIndex(Object ob) {
        return ob.hashCode() % 1000;
    }
}
