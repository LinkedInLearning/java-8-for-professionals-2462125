package project.product;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;

public class Shirt extends Product implements Customizeable {
    private Object image;

    @Override
    public Object customize()  {
        return image;
    }

    public void printCustomPart() {
        System.out.println(customize());
    }
}
