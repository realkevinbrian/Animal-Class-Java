// import java.io.*;


public class Animal{

    int age ;
    int weight;
    String name;

    //set age
    public void setAge(int Newage){
        age = Newage;
        System.out.println("You set age to :" + age);
    }

    //set name
    public void setName(String Newname){
        name = Newname;
        System.out.println("You set name to :" + name);
    }
    
    //set weight
    public void setWeight(int Newweight){
        weight = Newweight;
        System.out.println("You set weight to :" + weight);
    }

    //print animal
    public void printInfo(){
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Weights :" + weight);
    }
}