
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyCollection <E> implements Collection<E> {

    private int size = 0;
    private Object[] collection = new Object[size];

    @SuppressWarnings("all")

    public E get(int index) {
        return (E)this.collection[index];
    }


    @Override
    public boolean removeIf(Predicate filter) {
        return false;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Spliterator spliterator() {
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Stream stream() {
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
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
    @SuppressWarnings("unchecked")
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
    @SuppressWarnings("unchecked")
    public E[] toArray() {
        return (E[]) this.collection;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E[] toArray(Object[] a) {
        Object[] temp = new Object[this.size + a.length];
        if (temp.length - this.size >= 0)
            System.arraycopy(a, 0, temp, this.size, temp.length - this.size);
        return (E[]) temp;
    }

    @Override
    public boolean add(E o) {
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
                if (size - 1 - i >= 0) System.arraycopy(collection, i + 1, collection, i, size - 1 - i);
                Object[] collectionEemp = new Object[--size];
                System.arraycopy(collection, 0, collectionEemp, 0, size);
                collection = collectionEemp;
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
    @SuppressWarnings("unchecked")
    public boolean addAll(Collection c) {
        for (Object o : c) {
            this.add((E) o);
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

    @SuppressWarnings("unchecked")
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

        for(int i=0;i<temp.size;i++){
            for(int j=i+1;j<temp.size;j++){
                if(temp.get(i).equals(temp.get(j))){
                    temp.remove(temp.get(j));
                }
            }
        }

        collection = temp.toArray();
        size = temp.size;
        return true;
    }

    @Override
    public void clear() {
        collection=new Object[0];
    }
}
