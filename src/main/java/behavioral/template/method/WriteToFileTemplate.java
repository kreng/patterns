package behavioral.template.method;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class WriteToFileTemplate {

    public void writeToFile() throws IOException {
        Path path = Paths.get("output.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path))
        {
            writer.write(getContent());
        }
    }

    protected abstract String getContent();

    public static class DateWriter extends WriteToFileTemplate{

        static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        @Override
        protected String getContent() {
            return  LocalDateTime.now().format(formatter);
        }
    }

    public static class TimeWriter extends WriteToFileTemplate{

        static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        @Override
        protected String getContent() {
            return  LocalDateTime.now().format(formatter);
        }
    }
}
