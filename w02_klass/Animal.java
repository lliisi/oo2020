public class Animal{

    private String name;
    private String animalType;
    private int age;
    private String color;

    public Animal(String name,String animalType,int age,String color){

        this.name=name;
        this.animalType=animalType;
        this.age=age;
        this.color=color;
    }

    @Override
    public String toString(){
        return "My name is "+name+" and I'm a "+color+" "+animalType+" and I'm "+age+" years old.";
    }



}
