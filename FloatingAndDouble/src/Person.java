public class Person {
    private String name;
    private int age;
    private String city;
    private String gender;

    public Person(String name, int age, String city, String gender) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    public void get(){
        System.out.println(this.name+" "+this.age+" "+this.city+" "+this.gender);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        Person student = new Person("Tugsuu", 24, "Ulaanbaatar", "male");
        System.out.println(student.getName());
        student.get();
    }
}
