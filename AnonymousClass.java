// by extending an interface
/*
@FunctionalInterface
interface Animal
{
    void bark();
}

public class AnonymousClass
{
    public static void main(String[] args) 
    {
        Animal Bruno = new Animal() 
        {
            @Override
            public void bark() 
            {
                System.out.println("Dog barks!");
            }
        };
        Bruno.bark();
    }
}*/

//by extending a class

abstract class Vehicle
{
    abstract void drive();
}

public class AnonymousClass
{
    public static void main(String[] args) 
    {
        Vehicle car = new Vehicle() 
        {
            @Override
            void drive() 
            {
                System.out.println("I'm driving a car.");
            }
        };
        car.drive();
        }
}