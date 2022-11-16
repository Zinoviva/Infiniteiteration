import java.util.Random;

public class Randoms implements Iterator{
    protected Random random;
    private int max; //максимальное значение
    private int min;  //минимальное

    public Randoms(int min, int max) { //передаются через параметры конструктора
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator getIterator() {
        return (Iterator) new RandomIterator();
    }
    private class RandomIterator implements Iterable{

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            Random r = new Random();
            return r.nextInt((max - min) + 1) + min;
        }
    }
}
