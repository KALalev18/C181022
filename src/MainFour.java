public class MainFour {
    private String name;
    MainFour(){
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public static void main(String[] args) {
        MainFour main = new MainFour();
        System.out.println("The name is: "+ main.name);
    }
}
