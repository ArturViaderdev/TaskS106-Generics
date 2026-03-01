package level2;

public class Main {
    public static void main(String[] args)
    {
        GenericMethods genericMethods = new GenericMethods();
        System.out.println("Provo el mètode amb un string i dos generics.");
        genericMethods.printElements("hola",5,new Person("Artur","Viader Mataix",43));
        System.out.println("Provo el mètode amb un string i un nombre variable de genèrics.");
        genericMethods.printAll("Varios",4,5,6,new Person("Artur","Viader Mataix",43));
        System.out.println("Torno a provar.");
        genericMethods.printAll("Varios",4,5,6,7,8,new Person("Artur","Viader Mataix",43),"hola","adeu");
    }
}
