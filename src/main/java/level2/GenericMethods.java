package level2;

public class GenericMethods {
    @SafeVarargs
    public final <T> void printAll(String a, T... generics)
    {
        System.out.println(a);
        for(T generic:generics)
        {
            System.out.println(generic.toString());
        }
    }

    public <T> void printElements(String a, T b, T c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public GenericMethods()
    {

    }


}
