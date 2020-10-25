package com.pdf.html2pdf;

import java.util.ArrayList;
import java.util.List;

/**
 * @author naor.
 * @created 06/10/2020 - 11:37
 * @project html2pdf
 */

public class ConvertAndReverse {

    public String mkt = "123456789";
    public String name = "המוצר הכי יקר בעולם";
    public int amount = 7;
    public double price = 56;
    public double sum = amount * price;

    public String HTML =
            "<meta charset=\"utf-8\">\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "    <title>הזמנה חדשה מClick</title>\n" +
                    "    <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h1>" + reverse("הזמנה") + "</h1>\n" +
                    "<table>" +
                    "<tr>" +
                    "<th>" + reverse("מק\"ט") + "</th>" +
                    "<th>" + reverse("שם מוצר") + "</th>" +
                    "<th>" + reverse("מחיר") + "</th>" +
                    "<th>" + reverse("כמות") + "</th>" +
                    "<th>" + reverse("סה\"כ") + "</th>" +
                    "</tr>" +

                    generateTableRow() +
                    generateTableRow() +
                    generateTableRow() +
                    generateTableRow() +
                    generateTableRow() +


                    "</table>" +
                    "</body>\n" +
                    "</html>";


    private String generateTableRow() {
        return "<tr>" +
                "<td>" + mkt + "</td>" +
                "<td>" + reverse(name) + "</td>" +
                "<td>" + price + "</td>" +
                "<td>" + amount + "</td>" +
                "<td>" + sum + "</td>" +
                "</tr>";
    }

    public String reverse(String s) {

        //Make String into char[]
        char[] myCharArray = s.toCharArray();

        //Create an Array
        List arr = new ArrayList<Character>();

        StringBuffer sb = new StringBuffer();

        //Run in for loop from char[].length
        for (int i = myCharArray.length - 1; i >= 0; i--) {

            //Add every char to the new array
            arr.add(myCharArray[i]);
            sb.append(myCharArray[i]);
        }

        //Return the Array as String
        return sb.toString();
    }
}
