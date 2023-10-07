import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.format.DateTimeFormatter;
import  java.time.LocalTime;

public class IsaacForm extends JFrame {
    private JPanel mainPanel;
    private JPanel foodPanel;
    private JTextField amountField;
    private JTextField foodTimeField;
    private JRadioButton breastButton;
    private JRadioButton bottleButton;
    private JRadioButton probeButton;
    private JButton Add;
    private JPanel menuPanel;
    private JButton foodButton;
    private JButton peeAndPooButton;
    private JPanel peeAndPooPanel;
    private JRadioButton peeRadioButton;
    private JRadioButton pooRadioButton;
    private JRadioButton bothRadioButton;
    private JLabel peeNPooTimeLabel;
    private JButton pooAddButton;
    private JPanel weightPanel;
    private JTextField weightField;
    private JButton weightButton;
    private JButton weightAddButton;
    private JTextArea shouldEatAccordingToTextArea;
    private JButton foodBackButton;
    private JButton peeNPooBackButton;

    LocalTime now = LocalTime.now();
    public IsaacForm(String title) {
        super(title);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        pack();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = dateTimeFormatter.format(now);
        foodTimeField.setText(String.valueOf(formattedTime));
        peeNPooTimeLabel.setText(String.valueOf(formattedTime));

        


        foodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                mainPanel.removeAll();
                mainPanel.add(foodPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        foodBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(menuPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        peeAndPooButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(peeAndPooPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        peeNPooBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(menuPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        //------------------- (Enter button) with same code--------------------------------------

        foodButton.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                mainPanel.removeAll();
                mainPanel.add(foodPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        Add.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (breastButton.isSelected()) {

                    log log = new log(foodTimeField.getText(), amountField.getText(), true, false, false);
                    log.writeTofile();
                    amountField.setText("Added to file");
                    log.totalList.add(log.getAmount());
                    mainPanel.removeAll();
                    mainPanel.add(menuPanel);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                    amountField.setText(" ");

                } else if (bottleButton.isSelected()) {
                    log log = new log(foodTimeField.getText(), amountField.getText(), false, false, true);
                    log.writeTofile2();
                    amountField.setText("Added to file");
                    log.totalList.add(log.getAmount());
                    mainPanel.removeAll();
                    mainPanel.add(menuPanel);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                    amountField.setText(" ");

                } else if (probeButton.isSelected()) {
                    log log = new log(foodTimeField.getText(), amountField.getText(), false, true, false);
                    log.writeTofile3();
                    amountField.setText("Added to file");
                    log.totalList.add(log.getAmount());
                    mainPanel.removeAll();
                    mainPanel.add(menuPanel);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                    amountField.setText(" ");

                }


            }


            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        weightButton.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                mainPanel.removeAll();
                mainPanel.add(weightPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        peeAndPooButton.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                mainPanel.removeAll();
                mainPanel.add(peeAndPooPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        pooAddButton.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (pooRadioButton.isSelected()) {
                    pooAndPeeLog pooAndPeeLog = new pooAndPeeLog(true, false, false);
                    pooAndPeeLog.writeTofileAboutPoo();
                    mainPanel.removeAll();
                    mainPanel.add(menuPanel);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                } else if (peeRadioButton.isSelected()) {
                    pooAndPeeLog pooAndPeeLog = new pooAndPeeLog(false, true, false);
                    pooAndPeeLog.writeTofileAboutPee();
                    mainPanel.removeAll();
                    mainPanel.add(menuPanel);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                } else if (bothRadioButton.isSelected()) {
                    pooAndPeeLog pooAndPeeLog = new pooAndPeeLog(false, false, true);
                    pooAndPeeLog.writeTofileAboutPooNPee();
                    mainPanel.removeAll();
                    mainPanel.add(menuPanel);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        //-------------------------------------------------------------------------------

        weightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(weightPanel);
                mainPanel.repaint();
                mainPanel.revalidate();

            }
        });

        weightAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


               weight weight = new weight(Double.valueOf(weightField.getText()));

                //12% = 0.12
               double min = 12 * (weight.getWeight()*10);
               String mini = String.valueOf(min / 8);
               //15% = 0.15
               double max = 15 * (weight.getWeight()*10);
                String maxi = String.valueOf(max / 8);


               shouldEatAccordingToTextArea.append("\nBetween Min and max\n\n" + "Min: " + mini +
                       "\nMax: " + maxi);

                //mainPanel.removeAll();
                //mainPanel.add(menuPanel);
                //mainPanel.repaint();
                //mainPanel.revalidate();
            }
        });

        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (breastButton.isSelected()) {

                    log log = new log(foodTimeField.getText(), amountField.getText(), true, false,false );
                    log.getTotalOfTheDay();
                    log.writeTofile();
                    amountField.setText("Added to file");
                    log.totalList.add(log.getAmount());
                    mainPanel.removeAll();
                    mainPanel.add(menuPanel);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                    amountField.setText(" ");

                }
                else if (bottleButton.isSelected()) {
                    log log = new log( foodTimeField.getText(), amountField.getText(), false, false, true);
                    log.writeTofile2();
                    amountField.setText("Added to file");
                    log.totalList.add(log.getAmount());
                    mainPanel.removeAll();
                    mainPanel.add(menuPanel);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                    amountField.setText(" ");

                }
                else if (probeButton.isSelected()) {
                    log log = new log( foodTimeField.getText(), amountField.getText(), false, true, false);
                    log.writeTofile3();
                    amountField.setText("Added to file");
                    log.totalList.add(log.getAmount());
                    mainPanel.removeAll();
                    mainPanel.add(menuPanel);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                    amountField.setText(" ");

                }


            }
        });

        peeAndPooButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(peeAndPooPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        pooAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(menuPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });



        pooAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pooRadioButton.isSelected()) {
                    pooAndPeeLog pooAndPeeLog = new pooAndPeeLog(true, false, false);
                    pooAndPeeLog.writeTofileAboutPoo();
                } else if (peeRadioButton.isSelected()) {
                    pooAndPeeLog pooAndPeeLog = new pooAndPeeLog(false, true, false);
                    pooAndPeeLog.writeTofileAboutPee();
                } else if (bothRadioButton.isSelected()) {
                    pooAndPeeLog pooAndPeeLog = new pooAndPeeLog(false, false, true);
                    pooAndPeeLog.writeTofileAboutPooNPee();
                }
            }
        });








    }
}


