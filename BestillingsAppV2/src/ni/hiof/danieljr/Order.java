package ni.hiof.danieljr;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
    private String order;
    private User user;

    LocalDate today = LocalDate.now();

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM-YY");
    String formattedDate = dateTimeFormatter.format(today);


    public Order(String order, User user) {
        this.order = order;
        this.user = user;
    }

    public String getOrder() {
        return order;
    }
    public String getUser() {

        return user.getRomNr();
    }

    @Override
    public String toString() {
        System.out.println( "******* Ny bestilling *******" + "\n    --- Rom Nummer: " + user.getRomNr() + "\n" +
                "    --- Order: " + getOrder() + "\n");
        return null;
    }

    // eventuelt spesifiserer vi path!
    File file = new File("Ordre.txt");

    public String writeTofile() {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            bufferedWriter.write("--------Ordre den "+ today +"--------\n" +
                    //"- Dato: " + today + "\n" +
                    "- Bord Nummer: " + getUser() + "\n" +
                    "- Ordre: " + getOrder() +
                    "\n---------------------");
            bufferedWriter.newLine();
            bufferedWriter.close();
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
