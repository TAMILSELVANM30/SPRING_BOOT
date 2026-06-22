import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.PrintStream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);

        // Custom Banner
        app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                out.println("  .   ____          _            __ _ _");
                out.println(" /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\");
                out.println("( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\");
                out.println(" \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )");
                out.println("  '  |____| .__|_| |_|_| |_|\\__, | / / / /");
                out.println(" =========|_|==============|___/=/_/_/_/");
                out.println(" :: Spring Boot ::");
            }
        });

        app.run(args);
    }
}
