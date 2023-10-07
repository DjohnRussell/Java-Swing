import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class pooAndPeeLog {

    private boolean poo;
    private boolean pee;
    private boolean both;

    LocalDate today = LocalDate.now();

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM-YY");
    String formattedDate = dateTimeFormatter.format(today);

    public pooAndPeeLog(boolean poo, boolean pee, boolean both) {
        this.poo = poo;
        this.pee = pee;
        this.both = both;
    }

    public boolean isPoo() {
        return poo;
    }

    public boolean isPee() {
        return pee;
    }

    public boolean isBoth() {
        return both;
    }

    File file = new File("PooNPeeLog.txt");

    public String writeTofileAboutPoo() {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            bufferedWriter.write("--------Was it Poo or Pee?-------\n" +
                    "- Date: " + formattedDate + "\n" +
                    "- It was: Poo"  + "\n" +
                    "\n---------------------" + "\n\n");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public String writeTofileAboutPee() {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            bufferedWriter.write("--------was it Poo or Pee?-------\n" +
                    "- Date: " + formattedDate + "\n" +
                    "- It was: Pee"  + "\n" +
                    "\n---------------------" + "\n\n");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public String writeTofileAboutPooNPee() {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            bufferedWriter.write("--------was it Poo or Pee?-------\n" +
                    "- Date: " + formattedDate + "\n" +
                    "- It was: poo and pee"  + "\n" +
                    "\n---------------------" + "\n\n");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
