public class Company {
    String name;
    public Company(){
        name = "Programiz";
    }
    public static void main(String[] args){
        Company comp = new Company();
        System.out.println("Company name = "+comp.name);
    }
}
