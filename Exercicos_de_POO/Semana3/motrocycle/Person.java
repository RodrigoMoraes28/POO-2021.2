public class Person {
    private String name;
    private int age;
 
    public Person(Person person){
        this.name = name;
        this.age = age;
    }

    public String toString(){
    return("pessoa: [" + name + ":" + age + "]");
    }
}

