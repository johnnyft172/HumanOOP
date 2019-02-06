package HomoSapien;

    public class Earth {
        public static void main(String[] args) {

            //Human1 is an instance of the human class & to represent this particular instance that "this" variable is being used in class definition
            //In short that "this" keyword is actually a variable that references "this" particular instance
            Human human1 = new Human("Tom", 25, 76, "Blue");
            Human human2 = new Human("Joe", 38, 68, "Red");
            Human human3 = new Human("Shomo", 105, 89, "Black");

            human1.speak();
            human2.speak();
            human3.speak();





/*
            Human Tom;    //Tom is known as an Instance variable cuz it points to actual object (instance) aka Object variable.

            Tom = new Human(); Here we made object in two lines  | It's important to keep in mind that this (new human) is a variable and the

            // actual object is created when this statement is executed. The location for where the object is created in memory is basically referenced by the this particular
               variable (Tom)



            Tom.age = 5;
            Tom.eyeColor= "brown";
            Tom.heightInInches = 72;
            Tom.name = "Tom Striznano";

            Tom.speak();


            Human joe = new Human(); //Here we made object Joe in one line, above in 2 lines

            joe.age = 36;
            joe.eyeColor = "Green";
            joe.name = "Joe Goldberg";
            joe.heightInInches = 68;

            joe.speak();*/

            /*Tom.eat();
            Tom.work();
            Tom.walk();

            joe.eat();
            joe.work();
            joe.walk();*/

    }

}
