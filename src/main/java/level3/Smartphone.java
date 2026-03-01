package level3;

public class Smartphone implements Phone{
    @Override
    public void call() {
        System.out.println("S'està trucant.");
    }

    public void takePhoto()
    {
        System.out.println("S'està prenent una foto.");
    }

    public Smartphone()
    {

    }
}
