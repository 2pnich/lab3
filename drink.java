import java.util.Scanner;
public class drink {
    public String drink_type;
    public float drink_volume;
    public float drink_price;

    public drink(String type, float volume, float price) {
        this.drink_type = type;
        this.drink_volume = volume;
        this.drink_price = price;
    }

    public drink(float price){
        this.drink_price = price;
    }

    public drink(){

    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вид напитка");
        drink_type = in.nextLine();
        System.out.println("Введите объем напитка");
        drink_volume = in.nextFloat();
        System.out.println("Введите цену напитка");
        drink_price = in.nextFloat();
    }
    public void output(){
        System.out.println("Вид напитка: " + drink_type + " объем: " + drink_volume + " цена: " + drink_price);
    }
}
