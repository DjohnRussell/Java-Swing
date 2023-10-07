package Form;

import Users.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameScreen extends JFrame{
    private JPanel mainPanel;
    private JPanel startPanel;
    private JPanel manuPanel;
    private JPanel CharacterPanel;
    private JButton playButton;
    private JButton CharecterButton;
    private JButton shopButton;
    private JButton pressToStartButton;
    private JPanel loginPanel;
    private JTextField usernameField;
    private JButton LoginButton;
    private JPanel passwordPanel;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton createUserButton;
    private JPanel createUserPanel;
    private JTextField createIserNameField;
    private JPasswordField CreatePasswordField;
    private JButton c0KSC$Button;

    public GameScreen(String title) {
        super(title);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        pack();

        pressToStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(loginPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        pressToStartButton.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                mainPanel.removeAll();
                mainPanel.add(loginPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        LoginButton.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                mainPanel.removeAll();
                mainPanel.add(passwordPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(passwordPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        CharecterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(CharacterPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });


        CharecterButton.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                mainPanel.removeAll();
                mainPanel.add(CharacterPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();

                User user = new User(username, password);
                
                //Password checker will come...
                mainPanel.removeAll();
                mainPanel.add(manuPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        loginButton.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();

                User user = new User(username, password);
                //Password checker will come...
                mainPanel.removeAll();
                mainPanel.add(manuPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        createUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(createUserPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });

        createUserButton.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                mainPanel.removeAll();
                mainPanel.add(createUserPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        });
}


}
