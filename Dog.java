// import java.io.*;


public class Dog{

    public static void main(String []args){

        Animal Dog = new Animal();
        Dog.setAge(9);
        Dog.setName("Maxxx!");
        Dog.setWeight(30);

        System.out.println("---------------NEW LINE-------------------------------------");

        //print all infos
        Dog.printInfo();

    }
}