package object_oriented_programming;

/**
 * Порода кошек, с короткими лапками.
 * Умеет: мурлыкать (purr), мяукать (meow), и прыгать Низко (jump, своя имплементация)
 * Имплементация метода display - своя.
 */
public class MunchkinCat extends Cat {

    @Override
    public void display() {
        //display implementation

        System.out.println("Munchkin cat is displayed, he has small paws");
    }

    @Override
    public void meow() {
        //do nothing

        System.out.println("This cat does not mew!");
    }

    @Override
    public void jump() {
        //jump implementation

        System.out.println("этот кот не умеет прыгать");
    }
}