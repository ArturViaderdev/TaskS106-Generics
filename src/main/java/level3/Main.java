package level3;

public class Main {
    public static void main(String[] args)
    {
        Smartphone smartphone = new Smartphone();
        GenericUtils genericUtils = new GenericUtils();
        genericUtils.usePhone(smartphone);
        genericUtils.useSmartphone(smartphone);
    }
}
