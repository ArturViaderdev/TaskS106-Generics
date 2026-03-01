package level1Exercise1;

public class NoGenericMethods {
    private String a;
    private String b;
    private String c;
    public NoGenericMethods(String a, String b, String c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public String getElement1()
    {
        return a;
    }

    public String getElement2()
    {
        return b;
    }

    public String getElement3()
    {
        return c;
    }
}
