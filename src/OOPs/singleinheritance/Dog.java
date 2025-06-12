package OOPs.singleinheritance;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog sound");
        super.sound();
        this.sound();
    }
}
