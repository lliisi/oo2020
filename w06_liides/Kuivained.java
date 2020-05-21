import java.util.*;

class Kuivained implements Toit {
    public void ToiduKogus() {
        Random hulk = new Random();
        int  min, max, range;
        double amount;
        min = 100000;
        max = 200000;
        range = (max - min) + 1;
        amount = (Math.random() * range) + min;
        System.out.println("Hulgi laos on hetkel" + Math.round(amount) + " kuivaineid");
    }
    public void HulgilaoSeis() {
        Random hulk = new Random();
        int  min, max, range;
        double amount;
        min = 1000000;
        max = 2000000;
        range = (max - min) + 1;
        amount = (Math.random() * range) + min;
        System.out.println("Laos on kuivaineid " + Math.round(amount) + " krooni väärtuses");
    }
}