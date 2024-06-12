class Store {
    String a,b;
    public void item(String a, String b) //parameter
    {
        System.out.println("Store item is "+ a +" and " + b );
    }
}
class pens extends Store{
    public void P_types(String a, String b)
    {
        System.out.println("There are two types of Pens "+ a + " and "+ b);
    }
}
class Books extends pens
{
    public void Books_types(String a, String b)
    {
        System.out.println("There are two types of Books "+ a + " and "+ b);
    }
}
public class Main
{
    public static void main(String[] args) {
        Books b = new Books();
        b.item("pens","Books");
        b.P_types("Cello","RaJ");
        b.Books_types("Plain page","Blank page");

    }
}