public class MainTwo {
    String languages;
    MainTwo(String lang){
        languages = lang;
        System.out.print(languages + " Programming Language ");
    }
    public static void main(String args[]){
        MainTwo main1 = new MainTwo("Java");
        MainTwo main2 = new MainTwo("Python");
        MainTwo main3 = new MainTwo("C");
    }
}
