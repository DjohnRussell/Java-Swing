package no.hiof.danieljr.Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wisperCave extends JFrame {

    private JPanel mainPanel;
    private JPanel cardLayoutPanel;
    private JPanel startPanel;
    private JTextField nameField;
    private JButton pressButton;
    private JPanel firstChoice;
    private JButton theRoarWayButton;
    private JButton theWisperWayButton;
    private JLabel setNameIntroLabel;
    private JLabel headLabel;
    private JPanel wisperPanel;
    private JPanel roarPanel;
    private JButton pretendLikeNothingAndButton;
    private JButton goUpToHerButton;
    private JPanel firstCPretendLikeNothing;
    private JButton playAgainButton;
    private JPanel goUpToHerPanel;
    private JButton continueDownTheCaveButton;
    private JButton tryToClimbOutButton;
    private JPanel tryToClimPanel;
    private JLabel nameClimbField;
    private JButton playAgainButton1;
    private JTextField numberField;
    private JButton guessButton;
    private JPanel youRRightPanel;
    private JLabel picLabel;
    private JTextField yNField;
    private JButton pressButton2;
    private JPanel Challenge;
    private JPanel wtfPanel;
    private JLabel wftPanel;

    public wisperCave(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(cardLayoutPanel);
        this.pack();


//------------------------------Star panel-------------------------------------------------
        pressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nameField.getText().equals("")) {
                    nameField.setText("Enter a name");
                } else if (nameField.getText().equals("Enter a name")) {
                    nameField.setText("Nice try, enter a name");
                } else
                    cardLayoutPanel.removeAll();
                cardLayoutPanel.add(firstChoice);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();
                String name = nameField.getText();
                setNameIntroLabel.setText("OK," + name + " you are cold, scared and facing an important choice");

            }


        });


//-----------------------------------the whisper way button-----------------------------------------
        theWisperWayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(wisperPanel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();

            }
        });

//-----------------------------------Pretend like nothing button-----------------------------------------
        pretendLikeNothingAndButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(firstCPretendLikeNothing);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();

            }
        });
//-----------------------------------Go up to her button-----------------------------------------
        goUpToHerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(goUpToHerPanel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();

            }
        });
//-----------------------------------Go up too her panel, play again button-----------------------------------------
        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(startPanel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();
            }
        });
//-----------------------------------Roar botton-----------------------------------------
        theRoarWayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(roarPanel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();

            }
        });
//-----------------------------------Continue into the cave buttonl-----------------------------------------
        continueDownTheCaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(wisperPanel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();

            }
        });
//-----------------------------------Climb out button-----------------------------------------
        tryToClimbOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name1 = nameField.getText();
                nameClimbField.setText(name1 + ", you got tempted. But temptation deceived you");
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(tryToClimPanel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();

            }
        });
//-----------------------------------Play again roar button-----------------------------------------
        playAgainButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                cardLayoutPanel.removeAll();
                cardLayoutPanel.add(startPanel);
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();

            }
        });
//-----------------------------------Guess button-----------------------------------------
        numberField.setText("A number between one and ten!");

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = "9";
                if (numberField.getText().equals("1")) {
                    numberField.setText("Too low, " + nameField.getText());
                } else if (numberField.getText().equals("2")) {
                    numberField.setText("Too low, " + nameField.getText());
                } else if (numberField.getText().equals("3")) {
                    numberField.setText("Too low, " + nameField.getText());
                } else if (numberField.getText().equals("3")) {
                    numberField.setText("Too low, " + nameField.getText());
                } else if (numberField.getText().equals("4")) {
                    numberField.setText("Too low, " + nameField.getText());
                } else if (numberField.getText().equals("5")) {
                    numberField.setText("Too low, " + nameField.getText());
                } else if (numberField.getText().equals("6")) {
                    numberField.setText("Too low, " + nameField.getText());
                } else if (numberField.getText().equals("7")) {
                    numberField.setText("Too low, " + nameField.getText());
                } else if (numberField.getText().equals("8")) {
                    numberField.setText("Too low, " + nameField.getText());
                } else if (numberField.getText().equals("9")) {
                    cardLayoutPanel.removeAll();
                    cardLayoutPanel.add(youRRightPanel);
                    cardLayoutPanel.repaint();
                    cardLayoutPanel.revalidate();
                } else if (numberField.getText().equals("10")) {
                    numberField.setText("Too High, " + nameField.getText());
                } else
                    numberField.setText("Not a valid guess! ");
            }

        });

        pressButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(yNField.getText().equalsIgnoreCase("y")){
                    cardLayoutPanel.removeAll();
                    cardLayoutPanel.add(Challenge);
                    cardLayoutPanel.repaint();
                    cardLayoutPanel.revalidate();
                }else if (yNField.getText().equalsIgnoreCase("n")) {
                    cardLayoutPanel.removeAll();
                    cardLayoutPanel.add(wtfPanel);
                    cardLayoutPanel.repaint();
                    cardLayoutPanel.revalidate();
                }else yNField.setText("Enter something valid!!!!!!!!!");

            }
        });


    }}

