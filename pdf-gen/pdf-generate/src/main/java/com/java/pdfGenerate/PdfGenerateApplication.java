package com.java.pdfGenerate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@EnableAutoConfiguration
@SpringBootApplication
@ImportResource({"dubbo-provider.xml"})
public class PdfGenerateApplication {

    public static void main(String[] args) {
        SpringApplication.run(PdfGenerateApplication.class, args);
        System.out.println("success");
    }

}
