package HomoSapien;

public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;    //"This" is a keyword is a variable in Java & it points to current object
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }

    public void eat() {
        System.out.println("I love breaking my fast and eating like a pig");
    }

    public void walk() {
        System.out.println("I love walking...");
    }

    public void work() {
        System.out.println("My work is my gift, the rest is up to the universe because I am not entitled to the fruits of " +
                "my labor. I am entitled to my hard work so trust the process and  get to work!");


 /*     age = 5;
        eyeColor= "brown";
        heightInInches = 72;
        name = "Tom Striznano";*/
    }

 }

