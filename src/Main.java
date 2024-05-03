public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        User user = new User("Ash");
//        user.name = "Ash";
//        System.out.println("My name is: " + user.name);

        IUserFactory userFactory  = new DefaultUserFactory();
        User user1 = userFactory.createUser("Ash", 36);
        user1.sayHello();

        User user2 = userFactory.createUser("Ash");
        user2.sayHello();

        // Interface
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
        System.out.println("The tax is:" + calculator.calculateTax());

        // Encapsulation
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println("The balance is: "+ account.getBalance());

        // Abstraction
        var mailService = new MailService();
        mailService.sendEmail();

        //Inheritance
        var textBox = new TextBox();
        textBox.enable();

        //polymorphism
        drawUIControl(new TextBox()); // to draw a textbox
        drawUIControl(new CheckBox());// to draw a checkbox

    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    // polymorphism - at runtime the UIControl object can take many different form
    public static void drawUIControl(UIControl control) {
        control.draw();
    }


}