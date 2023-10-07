import ni.hiof.danieljr.Order;
import ni.hiof.danieljr.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BestillingApp extends JFrame {
    private JPanel mainPanel;
    private JPanel Panel;
    private JPanel Bestilling;
    private JLabel headerLabel;
    private JPanel manu;
    private JButton SalatButton;
    private JButton MiddagButton;
    private JButton SnacksButton;
    private JButton drikkeButton;
    private JButton FruktButton;
    private JTextField romNrField;
    private JButton BaguetterButton;
    private JPanel salatPanel;
    private JPanel MiddagPanel;
    private JButton middagTilbakeButton;
    private JButton salatTilbakeButton;
    private JPanel BaguetterPanel;
    private JButton baguetterTlbakeButton;
    private JPanel SnacksPanel;
    private JButton snackstilbakeButton;
    private JPanel FruktPanel;
    private JButton FruktTilbakeButton;
    private JPanel DrikkePanel;
    private JButton DrikkeTilbakeButton;
    private JComboBox MiddagcomboBox;
    private JComboBox salatcomboBox2;
    private JComboBox BaguetteComboBox;
    private JComboBox snacksComboBox;
    private JComboBox fruktComboBox;
    private JComboBox drikkeComboBox;
    private JButton SalatLeggtilButton;
    private JButton MiddagLeggtilButton;
    private JButton BaugetterLeggtTilButton;
    private JButton SnacksLeggTilButton;
    private JButton FruktLeggTilButton;
    private JButton DrikkeLeggTillButton;







    public BestillingApp(String title) {
        super(title);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        pack();

    

//--------------------------------------------------------------------------------------------------------------
//-----------------------------------------Drikke Panel----------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------

        drikkeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Panel.removeAll();
                Panel.add(DrikkePanel);
                Panel.repaint();
                Panel.revalidate();
            }
        });

        salatTilbakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel.removeAll();
                Panel.add(Bestilling);
                Panel.repaint();
                Panel.revalidate();
            }
        });


//--------------------------------------------------------------------------------------------------------------
//-----------------------------------------Salat Panel----------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------
       SalatButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               Panel.removeAll();
               Panel.add(salatPanel);
               Panel.repaint();
               Panel.revalidate();
           }
       });

       salatTilbakeButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               Panel.removeAll();
               Panel.add(Bestilling);
               Panel.repaint();
               Panel.revalidate();
           }
       });

//--------------------------------------------------------------------------------------------------------------
//----------------------------------------Middag Panel---------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------

    MiddagButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            Panel.removeAll();
            Panel.add(MiddagPanel);
            Panel.repaint();
            Panel.revalidate();
        }
    });

    middagTilbakeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Panel.removeAll();
            Panel.add(Bestilling);
            Panel.repaint();
            Panel.revalidate();
        }
    });
//--------------------------------------------------------------------------------------------------------------
//---------------------------------------BaguettPanel-----------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------

        BaguetterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Panel.removeAll();
                Panel.add(BaguetterPanel);
                Panel.repaint();
                Panel.revalidate();
            }
        });

        baguetterTlbakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel.removeAll();
                Panel.add(Bestilling);
                Panel.repaint();
                Panel.revalidate();
            }
 });

//--------------------------------------------------------------------------------------------------------------
//-----------------------------------------Snacks Panel--------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------

        SnacksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Panel.removeAll();
                Panel.add(SnacksPanel);
                Panel.repaint();
                Panel.revalidate();
            }
        });

        snackstilbakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel.removeAll();
                Panel.add(Bestilling);
                Panel.repaint();
                Panel.revalidate();
            }
        });
//--------------------------------------------------------------------------------------------------------------
//------------------------------------------Frukt Panel---------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------

        FruktButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Panel.removeAll();
                Panel.add(FruktPanel);
                Panel.repaint();
                Panel.revalidate();
            }
        });

        FruktTilbakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel.removeAll();
                Panel.add(Bestilling);
                Panel.repaint();
                Panel.revalidate();
            }
        });

        //Drikke panel
        drikkeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Panel.removeAll();
                Panel.add(Bestilling);
                Panel.repaint();
                Panel.revalidate();
            }
        });

        DrikkeTilbakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel.removeAll();
                Panel.add(Bestilling);
                Panel.repaint();
                Panel.revalidate();
            }
        });
//--------------------------------------------------------------------------------------
//---------------------------Legg til bestilling----------------------------------------
//--------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------------
//------------------------------------Salat---------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------

      SalatLeggtilButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              String gresk = salatcomboBox2.getItemAt(0).toString();
              String cæsar = salatcomboBox2.getItemAt(1).toString();

              if (romNrField.getText().isEmpty()){
                  Panel.removeAll();
                  Panel.add(Bestilling);
                  Panel.repaint();
                  Panel.revalidate();
                  romNrField.setText("Bord Nr....");
              }else {

                  if (gresk.equals(salatcomboBox2.getSelectedItem())) {
                      Order newOrder = new Order("Gresk salat", new User(romNrField.getText()));
                      newOrder.toString();
                      newOrder.writeTofile();

                  } else if (cæsar.equals(salatcomboBox2.getSelectedItem())) {
                      Order newOrder = new Order("Cæsar salat", new User(romNrField.getText()));
                      newOrder.toString();
                      newOrder.writeTofile();
                  }}
              }}
              );

////--------------------------------------------------------------------------------------------------------------
////---------------------------------------Middag-----------------------------------------------------------------
////--------------------------------------------------------------------------------------------------------------

       MiddagLeggtilButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String taco = MiddagcomboBox.getItemAt(0).toString();
               String kjottKaker = MiddagcomboBox.getItemAt(1).toString();
               String baktPopet = MiddagcomboBox.getItemAt(2).toString();
//
               if (romNrField.getText().isEmpty()) {
                   Panel.removeAll();
                   Panel.add(Bestilling);
                   Panel.repaint();
                   Panel.revalidate();
                   romNrField.setText("Bord Nr....");
               } else {


                   //Siden drikke er sammen med middag blir det neste valg automatisk.
                   Panel.removeAll();
                   Panel.add(DrikkePanel);
                   Panel.repaint();
                   Panel.revalidate();
                   if (taco.equals(MiddagcomboBox.getSelectedItem())) {
                       Order newOrder = new Order("Taco", new User(romNrField.getText()));
                       newOrder.toString();
                       newOrder.writeTofile();
                   } else if (kjottKaker.equals(MiddagcomboBox.getSelectedItem())) {
                       Order newOrder = new Order("Kjøttkaker i brunnsaus", new User(romNrField.getText()));
                       newOrder.toString();
                       newOrder.writeTofile();
                   } else if (baktPopet.equals(MiddagcomboBox.getSelectedItem())) {
                       Order newOrder = new Order("Bakt Potet", new User(romNrField.getText()));
                       newOrder.toString();
                       newOrder.writeTofile();
                   } else if (taco.equals(MiddagcomboBox.getSelectedItem())) {
                       Order newOrder = new Order("Taco", new User(romNrField.getText()));
                       newOrder.toString();
                       newOrder.writeTofile();
                   }


               }
           }}
       );
////--------------------------------------------------------------------------------------------------------------
//--------------------------------------Baguetter-----------------------------------------------------------------
////--------------------------------------------------------------------------------------------------------------

       BaugetterLeggtTilButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String ostSkine = BaguetteComboBox.getItemAt(0).toString();
               String kyllingCurry = BaguetteComboBox.getItemAt(1).toString();
               String falafell = BaguetteComboBox.getItemAt(2).toString();
               String kjottboller = BaguetteComboBox.getItemAt(3).toString();
//
               if (romNrField.getText().isEmpty()) {
                   Panel.removeAll();
                   Panel.add(Bestilling);
                   Panel.repaint();
                   Panel.revalidate();
                   romNrField.setText("Bord Nr....");
               } else {
//
                   if (ostSkine.equals(BaguetteComboBox.getSelectedItem())) {
                       Order newOrder = new Order(" Baguette/m ost og skine", new User(romNrField.getText()));
                       newOrder.toString();
                       newOrder.writeTofile();
                       Panel.removeAll();
                       Panel.add(Bestilling);
                       Panel.repaint();
                       Panel.revalidate();
                   } else if (kyllingCurry.equals(BaguetteComboBox.getSelectedItem())) {
                       Order newOrder = new Order("Baguette/m kylling curry", new User(romNrField.getText()));
                       newOrder.toString();
                       newOrder.writeTofile();
                       Panel.removeAll();
                       Panel.add(Bestilling);
                       Panel.repaint();
                       Panel.revalidate();
                   } else if (falafell.equals(BaguetteComboBox.getSelectedItem())) {
                       Order newOrder = new Order("Baguette/m falafell", new User(romNrField.getText()));
                       newOrder.toString();
                       newOrder.writeTofile();
                       Panel.removeAll();
                       Panel.add(Bestilling);
                       Panel.repaint();
                       Panel.revalidate();
                   } else if (kjottboller.equals(BaguetteComboBox.getSelectedItem())) {
                       Order newOrder = new Order("Baguette/m kjøttboller", new User(romNrField.getText()));
                       newOrder.toString();
                       newOrder.writeTofile();
                       Panel.removeAll();
                       Panel.add(Bestilling);
                       Panel.repaint();
                       Panel.revalidate();


                   }
               }
           }});


////--------------------------------------------------------------------------------------------------------------
//------------------------------------------Snacks----------------------------------------------------------------
////--------------------------------------------------------------------------------------------------------------

        SnacksLeggTilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String laysSalt = snacksComboBox.getItemAt(0).toString();
                String laysVinegar = snacksComboBox.getItemAt(1).toString();
                String Pringles = snacksComboBox.getItemAt(2).toString();
                String CheeseD = snacksComboBox.getItemAt(3).toString();
                String Melkesjok = snacksComboBox.getItemAt(4).toString();
                String firkløver = snacksComboBox.getItemAt(5).toString();

                if (romNrField.getText().isEmpty()) {
                    Panel.removeAll();
                    Panel.add(Bestilling);
                    Panel.repaint();
                    Panel.revalidate();
                    romNrField.setText("Bord Nr....");
                } else {

                    if (laysSalt.equals(snacksComboBox.getSelectedItem())) {
                        Order newOrder = new Order("Lays Chips/m salt", new User(romNrField.getText()));
                        newOrder.toString();
                        newOrder.writeTofile();
                        Panel.removeAll();
                        Panel.add(Bestilling);
                        Panel.repaint();
                        Panel.revalidate();
                    } else if (laysVinegar.equals(snacksComboBox.getSelectedItem())) {
                        Order newOrder = new Order("Lays Chips/m salt and vinegar", new User(romNrField.getText()));
                        newOrder.toString();
                        newOrder.writeTofile();
                        Panel.removeAll();
                        Panel.add(Bestilling);
                        Panel.repaint();
                        Panel.revalidate();
                    } else if (Pringles.equals(snacksComboBox.getSelectedItem())) {
                        Order newOrder = new Order("Pringles/m paprika", new User(romNrField.getText()));
                        newOrder.toString();
                        newOrder.writeTofile();
                        Panel.removeAll();
                        Panel.add(Bestilling);
                        Panel.repaint();
                        Panel.revalidate();
                    } else if (CheeseD.equals(snacksComboBox.getSelectedItem())) {
                        Order newOrder = new Order("Cheese Doodles", new User(romNrField.getText()));
                        newOrder.toString();
                        newOrder.writeTofile();
                        Panel.removeAll();
                        Panel.add(Bestilling);
                        Panel.repaint();
                        Panel.revalidate();
                    } else if (Melkesjok.equals(snacksComboBox.getSelectedItem())) {
                        Order newOrder = new Order("MelkeSjokolade", new User(romNrField.getText()));
                        newOrder.toString();
                        newOrder.writeTofile();
                        Panel.removeAll();
                        Panel.add(Bestilling);
                        Panel.repaint();
                        Panel.revalidate();
                    } else if (firkløver.equals(snacksComboBox.getSelectedItem())) {
                        Order newOrder = new Order("Firkløver", new User(romNrField.getText()));
                        newOrder.toString();
                        newOrder.writeTofile();
                        Panel.removeAll();
                        Panel.add(Bestilling);
                        Panel.repaint();
                        Panel.revalidate();
                    }
                }
            }});
////--------------------------------------------------------------------------------------------------------------
//--------------------------------------------Frukt---------------------------------------------------------------
////--------------------------------------------------------------------------------------------------------------
        FruktLeggTilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String banan = fruktComboBox.getItemAt(0).toString();
                String eple = fruktComboBox.getItemAt(1).toString();
                String pere = fruktComboBox.getItemAt(2).toString();
                String druer = fruktComboBox.getItemAt(3).toString();
                String kurv= fruktComboBox.getItemAt(4).toString();

                if (romNrField.getText().isEmpty()){
                    Panel.removeAll();
                    Panel.add(Bestilling);
                    Panel.repaint();
                    Panel.revalidate();
                    romNrField.setText("Bord Nr....");
                }else {

                     if (banan.equals(fruktComboBox.getSelectedItem())) {
                         Order newOrder = new Order("Banan", new User(romNrField.getText()));
                         newOrder.toString();
                         newOrder.writeTofile();
                         Panel.removeAll();
                         Panel.add(Bestilling);
                         Panel.repaint();
                         Panel.revalidate();
                     } else if (eple.equals(fruktComboBox.getSelectedItem())) {
                         Order newOrder = new Order("Eple", new User(romNrField.getText()));
                         newOrder.toString();
                         newOrder.writeTofile();
                         Panel.removeAll();
                         Panel.add(Bestilling);
                         Panel.repaint();
                         Panel.revalidate();
                     } else if (pere.equals(fruktComboBox.getSelectedItem())) {
                         Order newOrder = new Order("Pære", new User(romNrField.getText()));
                         newOrder.toString();
                         newOrder.writeTofile();
                         Panel.removeAll();
                         Panel.add(Bestilling);
                         Panel.repaint();
                         Panel.revalidate();
                     } else if (druer.equals(fruktComboBox.getSelectedItem())) {
                         Order newOrder = new Order("Druer", new User(romNrField.getText()));
                         newOrder.toString();
                         newOrder.writeTofile();
                         Panel.removeAll();
                         Panel.add(Bestilling);
                         Panel.repaint();
                         Panel.revalidate();
                     } else if (kurv.equals(fruktComboBox.getSelectedItem())) {
                         Order newOrder = new Order("Frukt kurv/m sesongens frukter", new User(romNrField.getText()));
                         newOrder.toString();
                         newOrder.writeTofile();
                         Panel.removeAll();
                         Panel.add(Bestilling);
                         Panel.repaint();
                         Panel.revalidate();
                     }
                }
            }
        });
////--------------------------------------------------------------------------------------------------------------
//--------------------------------------------Drikke--------------------------------------------------------------
////--------------------------------------------------------------------------------------------------------------

        DrikkeLeggTillButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cola = drikkeComboBox.getItemAt(0).toString();
                String pepsi = drikkeComboBox.getItemAt(1).toString();
                String zero = drikkeComboBox.getItemAt(2).toString();
                String max = drikkeComboBox.getItemAt(3).toString();
                String ims = drikkeComboBox.getItemAt(4).toString();
                String kuliA = drikkeComboBox.getItemAt(5).toString();
                String kuliJ = drikkeComboBox.getItemAt(6).toString();

                if (romNrField.getText().isEmpty()){
                    Panel.removeAll();
                    Panel.add(Bestilling);
                    Panel.repaint();
                    Panel.revalidate();
                    romNrField.setText("Bord Nr....");
                }else {

                if (cola.equals(drikkeComboBox.getSelectedItem())) {
                    Order newOrder = new Order("Coca Cola 05Ml", new User(romNrField.getText()));
                    newOrder.toString();
                    newOrder.writeTofile();
                    Panel.removeAll();
                    Panel.add(Bestilling);
                    Panel.repaint();
                    Panel.revalidate();
                } else if (pepsi.equals(drikkeComboBox.getSelectedItem())) {
                    Order newOrder = new Order("Pepsi 05Ml", new User(romNrField.getText()));
                    newOrder.toString();
                    newOrder.writeTofile();
                    Panel.removeAll();
                    Panel.add(Bestilling);
                    Panel.repaint();
                    Panel.revalidate();
                } else if (zero.equals(drikkeComboBox.getSelectedItem())) {
                    Order newOrder = new Order("Coca Cola Zero 05Ml", new User(romNrField.getText()));
                    newOrder.toString();
                    newOrder.writeTofile();
                    Panel.removeAll();
                    Panel.add(Bestilling);
                    Panel.repaint();
                    Panel.revalidate();
                } else if (max.equals(drikkeComboBox.getSelectedItem())) {
                    Order newOrder = new Order("Pepsi Max 05Ml", new User(romNrField.getText()));
                    newOrder.toString();
                    newOrder.writeTofile();
                    Panel.removeAll();
                    Panel.add(Bestilling);
                    Panel.repaint();
                    Panel.revalidate();
                } else if (ims.equals(drikkeComboBox.getSelectedItem())) {
                    Order newOrder = new Order("Imsdal vann 05Ml", new User(romNrField.getText()));
                    newOrder.toString();
                    newOrder.writeTofile();
                    Panel.removeAll();
                    Panel.add(Bestilling);
                    Panel.repaint();
                    Panel.revalidate();
                } else if (kuliA.equals(drikkeComboBox.getSelectedItem())) {
                    Order newOrder = new Order("Kuli/m Appelsin", new User(romNrField.getText()));
                    newOrder.toString();
                   newOrder.writeTofile();
                    Panel.removeAll();
                    Panel.add(Bestilling);
                    Panel.repaint();
                    Panel.revalidate();
                }else if (kuliJ.equals(drikkeComboBox.getSelectedItem())) {
                    Order newOrder = new Order("Kuli/m Jordbær og Appelsin", new User(romNrField.getText()));
                    newOrder.toString();
                    newOrder.writeTofile();
                    Panel.removeAll();
                    Panel.add(Bestilling);
                    Panel.repaint();
                    Panel.revalidate();
                }
                }


          } }
        );
    }
}





