class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ember { Nev: " + name + ", Kor: " + age + " }";
    }

}
public class Main {
    public static void main (String[] args) {

        Person person = new Person("Toth Zoltan", 25);

        System.out.println("Nev: " + person.getName());
        System.out.println("Kor: " + person.getAge());

        person.setName("Zoltan Toth");
        person.setAge(42);

        System.out.println("UjNev: " + person.getName());
        System.out.println("UjKor: " + person.getAge());

        System.out.println(person);
    }
}