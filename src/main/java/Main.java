import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by tish on 07.06.2014.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"services.xml"});



    }
}
