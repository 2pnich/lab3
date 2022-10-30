import java.util.Scanner;
public class shaurma {
    public String sh_type;
    public float sh_weight;
    public float sh_price;

    public shaurma(String type, float weight, float price) {
        sh_type = type;
        sh_weight = weight;
        sh_price = price;
    }

    public shaurma(float price){
        sh_price = price;
    }

    public shaurma(){

    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вид шаурмы");
        sh_type = in.nextLine();
        System.out.println("Введите вес шаурмы");
        sh_weight = in.nextFloat();
        System.out.println("Введите цену шаурмы");
        sh_price = in.nextFloat();
    }

    public void output(){
        System.out.println("Вид шаурмы: " + sh_type + " Вес: " + sh_weight + " цена " + sh_price);
    }
}
