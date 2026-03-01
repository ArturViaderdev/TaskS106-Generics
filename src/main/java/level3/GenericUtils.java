package level3;

public class GenericUtils {
    public <T extends Phone> void usePhone(T phone)
    {
       phone.call();
       //phone.takephoto();
    }

    public <T extends Smartphone> void useSmartphone(T smartphone){
        smartphone.call();
        smartphone.takePhoto();
    }
}
