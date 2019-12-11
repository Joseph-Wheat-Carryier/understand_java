import java.util.ArrayList;

public class StudentStore {
    private MyCollection<Students> store = new MyCollection<>();
    void add(Students students){
        store.add(students);
    }

    void delete(int id){
        for(Students temp:store){
            if(temp.getId()==id){
                store.remove(temp);
            }
        }
    }




    public static void main(String[] args) {
        StudentStore s =new StudentStore();
        Students a = new Students("小明");
        Students b = new Students("小刚");
        s.add(a);
        s.add(b);
        s.delete(0);
        System.out.println(s.store.get(0).getName());
    }
}
