package prototype;

public class Person implements Cloneable{
    private String name;
    private String surname;

    public Person(){

    }

    public Person(Person target){
        if (target!=null){
        this.name=target.name;
        this.surname= target.surname;
    }}

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setSurname(String surname){
//        this.surname= surname;
//    }
//
//    public String getSurname(){
//        return surname;
//    }

    public abstract Person clone();
    @Override
    public boolean equals(Object object2){
        if (!(object2 instanceof Person)) return false;
        Person person2 = (Person) object2;
        return person2.name.equals(name) && person2.surname.equals(surname);
    }
}
