import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyCollection implements Collection {
    private int size = 0;
    private Object[] collection = new Object[size];


    public Object get(int index) {
        return this.collection[index];
    }


    @Override
    public boolean removeIf(Predicate filter) {
        return false;
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public Stream stream() {
        return null;
    }

    @Override
    public Stream parallelStream() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object temp : collection) {
            if (temp.equals(o)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public Iterator iterator() {
        return new Iterator() {
            int ct = -1;

            @Override
            public boolean hasNext() {
                if (size == 0) {
                    return false;
                }
                ct++;
                return size > ct;
            }

            @Override
            public Object next() {
                return collection[ct];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return this.collection;
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] temp = new Object[this.size + a.length];
        if (temp.length - this.size >= 0)
            System.arraycopy(a, 0, temp, this.size, temp.length - this.size);
        return temp;
    }

    @Override
    public boolean add(Object o) {
        Object[] temp = new Object[++size];
        System.arraycopy(collection, 0, temp, 0, size - 1);

        temp[size - 1] = o;
        collection = temp;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (collection[i].equals(o)) {
                for (int j = i; j < size - 1; j++) {
                    Object temp = collection[j];
                    collection[j] = collection[j + i];
                    collection[j + 1] = temp;
                }
                Object[] collectionTemp = new Object[--size];
                System.arraycopy(collection, 0, collectionTemp, 0, size);
                collection = collectionTemp;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        int count1 = 0;
        if (this.size < c.size()) {
            return false;
        }

        if (this.hashCode() == c.hashCode()) {
            return true;
        } else {

            for (Object in : c) {
                int count2 = 0;
                for (Object out : this) {
                    if (!out.equals(in)) {
                        if (++count2 == this.size()) {
                            return false;
                        }
                    } else {
                        break;
                    }
                }
                if (++count1 == c.size()) {
                    return true;
                }
                System.out.println(in);
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o : c) {
            this.add(o);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        for(Object o:c){
            for(Object in:this){
                if(in.equals(o)){
                    this.remove(in);
                }
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection c) {
        MyCollection temp =new MyCollection();
        for(Object o:c){
            for(Object in:this){
                if(in.equals(o)){
                    temp.add(in);
                }
            }
        }

        collection = temp.toArray();
        return true;
    }

    @Override
    public void clear() {
        collection=new Object[]{};
    }
}
