package za.ac.cput.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= "za")
public class MainEntryPoint
{
    public static void main(String[] args)
    {
        SpringApplication.run(MainEntryPoint.class, args);

    }

}
