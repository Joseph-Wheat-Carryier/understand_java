public class Students {
    static private int num=0;
    private String name;

    private int id;

    public Students(){};

    public Students( String name) {
        setId();
        num++;
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId() {
        this.id = num;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
