import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;

    Iterator<Integer> iter;

    public Randoms(int min, int max) {
        random = new Random();
        iter = new RandomIterator(random, min, max);
    }

    @Override
    public Iterator<Integer> iterator() {
        return iter;
    }
}