package SelectCourse;

/*@SuppressWarnings("all")*/
public class Course {
    String name;
    String courseId;

    Course(String name,String courseId){
        this.name = name;
        this.courseId = courseId;
    }

    @SuppressWarnings("all")
    public String getName() {
        return name;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
