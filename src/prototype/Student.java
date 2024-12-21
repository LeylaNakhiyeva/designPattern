package prototype;

public class Student extends Person {
    private String group;
    public Student(){

    }
    public Student(Student target){
        super(target);
        this.group= target.group;
    }
    @Override
    public Person clone() {
        return new Student(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Student) || !super.equals(object2)) return false;
        Student person2 = (Student) object2;
        return person2.group.equals(group);
    }
}
