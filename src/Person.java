
import java.time.LocalDate;
import java.time.Period;


public class Person implements BirthDateCalculate {

    private Name name;
    private Address address;
    private String age;
    private String birthDate;

    public Person(){
        this.name = new Name();
        this.address = new Address();
        this.age = "UNKNOWN";
        this.birthDate = "UNKNOWN";
    }

    public Person(Name name, Address address1, String age, String bithDate) {
        this.name = name;
        this.address = address1;
        this.age = age;
        this.birthDate = bithDate;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address1) {
        this.address = address1;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String bithDate) {
        this.birthDate = bithDate;
    }
    
    @Override public void calcAge(){
        
        
        String[] birthDateArray = new String[3]; 
        birthDateArray = this.birthDate.split("-");
        
        int day = Integer.parseInt(birthDateArray[0]);
        int month = Integer.parseInt(birthDateArray[1]);
        int year = Integer.parseInt(birthDateArray[2]);
        
        LocalDate today = LocalDate.now();
        LocalDate birthDateObj = LocalDate.of(year, month, day);
        
        int ageInt = Period.between(birthDateObj, today).getYears();
        String ageString = Integer.toString(ageInt);
                
        this.age = ageString;
    }
}
 