package ma.xproce.qr;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QrApplication {

    public static void main(String[] args) {
        // Load environement variables from .env
        /*Dotenv dotenv=Dotenv.load();
        System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
        System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
        System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));*/

        SpringApplication.run(QrApplication.class, args);
    }

}
