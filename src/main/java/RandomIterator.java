import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {
    private Random ran;
    private int min, max;

    public RandomIterator(Random ran, int min, int max) {
        if (max <= min) {
            throw new IllegalArgumentException("max <= min");
        }
        this.ran = ran;
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return ran.nextInt(max - min + 1) + min;
    }
}
