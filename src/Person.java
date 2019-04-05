
public class Person implements BirthDateCalculate {

    private Name name;
    private Address address1;
    private int age;
    private String birthDate;

    public Person(){
        this.name = new Name();
    }

    public Person(Name name, Address address1, int age, String bithDate) {
        this.name = name;
        this.address1 = address1;
        this.age = age;
        this.birthDate = bithDate;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String bithDate) {
        this.birthDate = bithDate;
    }
}
 