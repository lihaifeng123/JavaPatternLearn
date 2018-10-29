package org.pattern.lhf.singleton;

public class Singleton {
    private static Singleton singleton=new Singleton();

   private Singleton(){
       System.out.println("create a instance");
   }

   public static Singleton getInstance(){
       return singleton;
   }
}
