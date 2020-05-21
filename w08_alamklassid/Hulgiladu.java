
public abstract class Hulgiladu {

    public int amount; //atribuudid
    public String name;

    public Hulgiladu(int amount, String name){
        this.amount=amount;
        this.name=name;
    }

    public void KogusLaos(){
        System.out.println("Laos on "+name+" "+amount+" pakki.");
    }
    
    
}