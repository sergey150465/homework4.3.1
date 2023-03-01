import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    public int min;
    public int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        //...
    }

    @Override
    public java.util.Iterator<Integer> iterator() {
        return new Iterator(random.nextInt(max - min) + min);
    }

    public class Iterator implements java.util.Iterator<Integer> {
        public int current;

        public Iterator(int current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(max - min + 1) + min;
        }
    }
}