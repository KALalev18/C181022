abstract class FruitsOne{
    abstract void taste();
}
class AppleOne extends Fruits{

    @Override
    void taste() {
        System.out.println("Sweet taste");
    }
}
class Pineapple extends Fruits{

    @Override
    void taste() {
        System.out.print("Sour taste");
    }
}
public class AbstractDemoTwo {
    public static void main(String[] args) {
        AppleOne a = new AppleOne();
        a.taste();
        Pineapple p = new Pineapple();
        p.taste();
    }
}
