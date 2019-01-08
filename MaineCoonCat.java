package object_oriented_programming;

/**
 * Порода больших кошек.
 * Умеет: мурлыкать (purr), мяукать (meow) и прыгать Высоко (jump)
 * Имплементация метода display - своя.
 */
public class MaineCoonCat extends Cat {

    @Override
    public void display() {
        //display implementation

        System.out.println("Maine coon cat is displayed, it is very big");

    }

    public void jump(){
        System.out.println("Этот кот может прыгать, но очень низко");
    }
}