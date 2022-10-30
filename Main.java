public class Main {
    public static void main(String[] args) {
        float sum;
        System.out.println("здарова");
        shaurma _shaurma = new shaurma("type", 0, 0);
        pizza _pizza = new pizza("type", 0, 0);
        drink _drink = new drink("type", 0, 0);
        soup _soup = new soup("type", 0);
        fries _fries = new fries("type", 0, 0);
        basket bas = new basket(_shaurma, _pizza, _drink, _soup, _fries);
        basket.input();
        basket.output();
        sum = basket.sum();
        basket.payment(sum);
    }
}