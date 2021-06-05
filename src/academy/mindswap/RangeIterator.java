package academy.mindswap;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeIterator implements Iterable<Integer> {

   private final int start;
   private final int end;

    public RangeIterator(int start, int end){
        this.start=start;
        this.end=end;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private Integer current=start;
            @Override
            public boolean hasNext() {
                if(start>=end){
                    return current >= end;
                }
                return  current <= end;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if(start>=end){
                    return  current--;
                }
                return current++;
            }
        };
    }
}
