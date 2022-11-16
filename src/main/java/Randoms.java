import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer>{

    private int max; //максимальное значение
    private int min;  //минимальное

    public Randoms(int min, int max) { //передаются через параметры конструктора
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator<Integer>{
        protected Random random;

        public RandomIterator() {
            this.random = new Random();
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {

            return random.nextInt((max - min) + 1) + min;
        }
    }
}
