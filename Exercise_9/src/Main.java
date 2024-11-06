//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book english =new Book("English",50,"Maha");
        System.out.println("English price: "+english.getPrice());
        System.out.println("English price after discount 10% :"+english.getDiscount());
        System.out.println("English book information: "+english.toString());
        System.out.println("***********************************");
        Movie luca =new Movie("Luca",50,"Jeny");
        System.out.println("Luca price: "+luca.getPrice() );
        System.out.println("Luca price after discount 20%: "+luca.getDiscount() );
        System.out.println("Luca movie information: "+luca.toString());
        System.out.println("************************************");

        Book math =new Book();
        math.setName("Math");
        math.setPrice(40);
        math.setAuthor("khaled");
        System.out.println(math.toString());
        System.out.println("*********************************");
        Movie moana =new Movie();
        moana.setName("Moana");
        moana.setPrice(50);
        moana.setDirector("Luna");
        System.out.println("Moana price: "+moana.getPrice());
        System.out.println("Mouana movie after discount: "+moana.getDiscount());
        System.out.println("*************************************");


    }
}