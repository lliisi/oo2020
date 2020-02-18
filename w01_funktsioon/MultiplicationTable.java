public class MultiplicationTable{

    //private int num;
    public int multiplicate(int num){
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        return num;

    }


    public static void main(String[] args) {
        MultiplicationTable x=new MultiplicationTable();
        System.out.println(x.multiplicate(6));
    }
}
