package test.lhf.pattern.singleton;

import org.pattern.lhf.singleton.Singleton;

public class Test {
    public static void main(String[] args){
        Singleton singleton=Singleton.getInstance();
        Singleton singleton1=Singleton.getInstance();

        if(singleton==singleton1){
            System.out.println("obj 1 same with obj2");
        }else{
            System.out.println("obj 1 unsame with obj2");
        }
    }
}
