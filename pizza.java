import java.util.Scanner;
public class pizza {
    public String pizza_type;
    public float pizza_weight;
    public float pizza_price;

    public pizza(String type, float weight, float price) {
        this.pizza_type = type;
        this.pizza_weight = weight;
        this.pizza_price = price;
    }

    public pizza(float price){
        this.pizza_price = price;
    }

    public pizza(){

    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вид пиццы");
        pizza_type = in.nextLine();
        System.out.println("Введите диаметр пиццы");
        pizza_weight = in.nextFloat();
        System.out.println("Введите цену пиццы");
        pizza_price = in.nextFloat();
    }

    public void output(){
        System.out.println("Вид пиццы: " + pizza_type + " диаметр: " + pizza_weight + " цена: " + pizza_price);
    }
}
