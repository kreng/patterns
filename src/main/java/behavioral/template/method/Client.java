package behavioral.template.method;

import java.io.IOException;

public class Client {

    public static void main(String... args) throws IOException {
        new WriteToFileTemplate.DateWriter().writeToFile();
    }
}
