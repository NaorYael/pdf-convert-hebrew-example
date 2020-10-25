pdf-converter
===========
A Java library to convert pdf files using IText library hebrew example

**Dependencies**

Find on [Maven central](https://mvnrepository.com/) repository.

		<!-- iText Core -->
		<dependency>
			<groupId>com.itextpdf</groupId>
			<artifactId>itext7-core</artifactId>
			<version>7.1.9</version>
			<type>pom</type>
		</dependency>

		<!-- iText pdfHTML -->
		<dependency>
			<groupId>com.itextpdf</groupId>
			<artifactId>html2pdf</artifactId>
			<version>2.1.6</version>
		</dependency>
 
**Example**
 
```java
        HtmlConverter.convertToPdf(new ConvertAndReverse().HTML, new FileOutputStream("הזמנה.pdf"));
        System.out.println("PDF Created!");
```

**PDF**
![oie_v0EACS4HuLZX](https://user-images.githubusercontent.com/47955339/97100645-37b22e00-169e-11eb-82f5-472d911e35ad.png)
