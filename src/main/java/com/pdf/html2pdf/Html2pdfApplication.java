package com.pdf.html2pdf;

import com.itextpdf.html2pdf.HtmlConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileOutputStream;
import java.io.IOException;

@SpringBootApplication
public class Html2pdfApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Html2pdfApplication.class, args);

        HtmlConverter.convertToPdf(new ConvertAndReverse().HTML, new FileOutputStream("הזמנה.pdf"));
        System.out.println("PDF Created!");
    }
}

