public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("-----Turkey-----");
        turkey.gobble();
        turkey.fly();

        System.out.println("-----Duck-----");
        duck.quack();
        duck.fly();

        System.out.println("-----TurkeyAdapter-----");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
