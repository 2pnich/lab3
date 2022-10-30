import java.util.Scanner;
public class soup {
    public String soup_type;
    public float soup_price;

    public soup(String type, float price) {
        this.soup_type = type;
        this.soup_price = price;
    }

    public soup(float price) {
        this.soup_price = price;
    }

    public soup(){

    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вид супа");
        soup_type = in.nextLine();
        System.out.println("Введите цену супа");
        soup_price = in.nextFloat();
    }
    public void output(){
        System.out.println("Вид супа: " + soup_type + " цена: " + soup_price);
    }
}
