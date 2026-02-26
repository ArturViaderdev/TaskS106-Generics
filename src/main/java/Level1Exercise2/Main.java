package Level1Exercise2;

public class Main {
    public static void main(String[] args)
    {
        GenericMethods genericMethods = new GenericMethods();
        System.out.println("Entro en un ordre");
        genericMethods.printElements("hola",5,new Person("Artur","Viader Mataix",43));
        System.out.println("Entro en un altre ordre.");
        genericMethods.printElements(new Person("Artur","Viader Mataix",43),"hola",5);
    }
}
