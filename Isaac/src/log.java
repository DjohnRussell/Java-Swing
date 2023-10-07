import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class log {
    private String date;
    private String time;
    private String amount;
    private boolean isBreast;
    private boolean isProbe;
    private boolean isBottle;
    LocalDate today = LocalDate.now();

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM-YY");
    String formattedDate = dateTimeFormatter.format(today);
    ArrayList totalList = new ArrayList<>();
    ArrayList<Double> list = new ArrayList<Double>();


    public log(String time, String amount, boolean isBreast, boolean isProbe, boolean isBottle) {
        this.time = time;
        this.amount = amount;
        this.isProbe = isProbe;
        this.isBottle = isBottle;
        this.isBreast = isBreast;

    }


    public boolean isBreast() {
        return isBreast;
    }

    public boolean isProbe() {
        return isProbe;
    }

    public boolean isBottle() {
        return isBottle;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getAmount() {
        return amount;
    }


    @Override
    public String toString() {
        System.out.println("******* Baby logger *******" + "\n    --- Amount: " + getAmount() + "\n" +
                "    --- time: " + getTime() + "\n");
        return null;
    }


    // eventuelt spesifiserer vi path!
    File file = new File("Log.txt");


    public String writeTofile() {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            bufferedWriter.write("--------Baby logger--------\n" +
                    "- Date: " + formattedDate + "\n" +
                    "- Time: " + getTime() + "\n" +
                    "- Feed: Breastfeed " + "\n" +
                    "- Amount: " + getAmount() + "ml" + "\n" +
                    "- Total of to day: " + getTotalOfTheDay() + "\n" +
                    "\n---------------------" + "\n\n");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public String writeTofile2() {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            bufferedWriter.write("--------Baby logger--------\n" +
                    "- Date: " + formattedDate + "\n" +
                    "- Feed: Bottle " + "\n" +
                    "- Amount: " + getAmount() + "ml" + "\n" +
                    "- Time: " + getTime() +
                    "\n---------------------" + "\n\n");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public String writeTofile3() {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            bufferedWriter.write("--------Baby logger--------\n" +
                    "- Date: " + formattedDate + "\n" +
                    "- Feed: Probe " + "\n" +
                    "- Amount: " + getAmount() + "ml" + "\n" +
                    "- Time: " + getTime() +
                    "\n---------------------" + "\n\n");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public double getTotalOfTheDay() {

        double sum = 0;
        if (today == today) {
            list.add(Double.valueOf(getAmount()));
            for (Double value : list) {
                sum+=value;

                }

            }
        return sum;
        }

    }










