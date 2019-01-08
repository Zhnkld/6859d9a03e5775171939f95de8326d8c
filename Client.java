package object_oriented_programming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Оптимизируйте код так, чтобы можно было:
 * - безболезненно добавлять новые реализации котиков;
 * - динамически подменять поведения у котиков. (Пример: чтобы MaineCoonCat мог прыгать Низко)
 */
public class Client {

    public static void main(String[] args) {



        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new MaineCoonCat());
        cats.add(new MunchkinCat());
        cats.add(new PiggyBankCat());
        cats.add(new ToyCat());

        for (Cat cat : cats) {
            cat.display();
            cat.purr();
            cat.meow();
            cat.jump();
            System.out.println();
        }
    }
}