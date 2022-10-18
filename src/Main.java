public class Main {
    int i;
    private Main(){
        i = 5;
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Value of i: "+ main.i);
    }
}