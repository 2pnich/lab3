import java.util.Scanner;
public class fries {
    public String fries_type;
    public int fries_quantity;
    public float fries_price;

    public fries(String type, int quantity, float price) {
        this.fries_type = type;
        this.fries_quantity = quantity;
        this.fries_price = price;
    }

    public fries(float price) {
        this.fries_price = price;
    }

    public fries(){

    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вид фри");
        fries_type = in.nextLine();
        System.out.println("Введите количество фри");
        fries_quantity = in.nextInt();
        System.out.println("Введите цену фри");
        fries_price = in.nextFloat();
    }
    public void output(){
        System.out.println("Вид фри: " + fries_type + " количества: " + fries_quantity + " цена:" + fries_price);
    }
}
