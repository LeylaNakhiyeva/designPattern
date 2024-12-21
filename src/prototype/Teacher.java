package prototype;

public class Teacher extends Person {
    private String specialty;
    public Teacher(){

    }
    public Teacher(Teacher target){
       super(target);
       this.specialty= target.specialty;
    }

    @Override
    public Person clone() {
        return new Person(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Teacher) || !super.equals(object2)) return false;
        Teacher person2 = (Teacher) object2;
        return person2.specialty.equals(specialty);
    }
}
