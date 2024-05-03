public class DefaultUserFactory implements IUserFactory{

    @Override
    public User createUser(String name) {
        return new User(name);
    }


    @Override
    public User createUser(String name, int age) {
        return new User(name, age);
    }



}
