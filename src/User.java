public class User {
    //Fields(attributes)
    public String name;
    public Integer age;

    // Constructor - a constructor is a method that is called when we create a new instance of a class
    public User(String name) {
        //name = name; // if we do this java will think we are referring ti the name in the parameter above
        this.name = name; // set the name field of the current object to the value of the name parameter. this is a reference to the current object
        this.age = 18;
    }

    public User(String name, int age) {
        //name = name; // if we do this java will think we are referring ti the name in the parameter above
        this.name = name; // set the name field of the current object to the value of the name parameter. this is a reference to the current object
        this.age = age;
    }

    //Methods
    public void sayHello() {
        System.out.println("Hi my name is " + name);
        System.out.println("My age is " + age);
    }

}
