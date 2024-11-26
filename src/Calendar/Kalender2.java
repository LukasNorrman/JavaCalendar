
//                                  --------------------------------Källor----------------------------

//  https://stackoverflow.com/questions/14159536/creating-jbutton-with-customized-look - knappStyling
//  https://www.youtube.com/watch?v=g2vDARb7gx8 - videon jag tog hjälp av för att använda GridBagLayout & GridBagConstraints

package Calendar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;


// Skapade ännu en klass för att snygga till koden och få mindre kod
public class Kalender2 {

    public static void start2(){

                JFrame frame = new JFrame("Kalender 2");
                frame.setSize(900,500);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridLayout(1,7));

                // skapade variabler för dagens datum samt start av veckan.
                LocalDate idag = LocalDate.now();
                LocalDate veckoStart = idag.with(DayOfWeek.MONDAY);

                // skapar listor av alla element.
                JPanel[] panels = new JPanel[7];
                JButton[] buttons = new JButton[7];
                JTextField[] textFields = new JTextField[7];
                JLabel[] dayLabels = new JLabel[7];
                JLabel[] dateLabels = new JLabel[7];
                JLabel[] displayLabels = new JLabel[7];
                JButton[] rensaKnapp = new JButton[7];



                // Loop för alla paneler, knappar, textfält och labels
                for (int i = 0; i < 7; i++) {

                    // använde mig av GridBagConstraints och GridBagLayout för att få rätt på placering av knappar, textfält, datum och veckodag.
                    GridBagConstraints gbc = new GridBagConstraints();
                    gbc.insets = new Insets(5,5,5,5);
                    gbc.anchor = GridBagConstraints.NORTH;

                    panels[i] = new JPanel(new GridBagLayout());
                    panels[i].setBorder(BorderFactory.createLineBorder(Color.black));
                    frame.add(panels[i]);

                    // if statement för att hitta vilken dag det är idag samt att markera med en annan färg
                    if (veckoStart.plusDays(i).isEqual(idag)) {
                        panels[i].setBackground(new Color(238,255,206));
                    }


                    // lägger till knapparna med all styling
                    buttons[i] = new JButton("Add");
                    buttons[i].setPreferredSize(new Dimension(100,20));
                    buttons[i].setFont(new Font("Tahoma",Font.BOLD,12));
                    buttons[i].setBackground(new Color(59,89,182));
                    buttons[i].setForeground(Color.white);
                    buttons[i].setFocusPainted(false);
                    buttons[i].setBorderPainted(false);


                    // lägger till alla textfält
                    textFields[i] = new JTextField(10);

                    // lägger till veckodagarna och datum
                    dayLabels[i] = new JLabel(veckoStart.plusDays(i).getDayOfWeek().toString());
                    dayLabels[i].setFont(new Font("Tahoma",Font.BOLD,17));

                    dateLabels[i] = new JLabel(String.valueOf(veckoStart.plusDays(i)));
                    dateLabels[i].setFont(new Font("Tahoma",Font.PLAIN,13));


                    // lägger till labeln för att lägga till text
                    displayLabels[i] = new JLabel();


                    // skapar så att man kan lägga in text på dagarna
                    int index = i;
                    buttons[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String inputText = textFields[index].getText();
                            displayLabels[index].setText(inputText);

                            textFields[index].setText("");

                            rensaKnapp[index] = new JButton("Clear");
                            rensaKnapp[index].setPreferredSize(new Dimension(100,20));
                            rensaKnapp[index].setFont(new Font("Tahoma",Font.BOLD,13));
                            rensaKnapp[index].setBackground(new Color(168, 44, 69));
                            rensaKnapp[index].setForeground(Color.white);
                            rensaKnapp[index].setFocusPainted(false);
                            rensaKnapp[index].setBorderPainted(false);
                            gbc.gridy = 5;
                            gbc.weighty = 0;
                            gbc.anchor = GridBagConstraints.SOUTH;
                            panels[index].add(rensaKnapp[index], gbc);
                            panels[index].revalidate();
                            panels[index].repaint();


                            rensaKnapp[index].addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    displayLabels[index].setText("");
                                    rensaKnapp[index].setVisible(false);
                                }
                            });
                        }
                    });

                    // Placering av knappar, dagar, datum, textfält samt textfältet där eventen ska läggas
                    gbc.gridy = 0;
                    gbc.anchor = GridBagConstraints.NORTH;
                    panels[i].add(dayLabels[i], gbc);

                    gbc.gridy = 1;
                    gbc.weighty = 0;
                    gbc.anchor = GridBagConstraints.NORTH;
                    panels[i].add(dateLabels[i], gbc);

                    gbc.gridy = 3;
                    gbc.anchor = GridBagConstraints.SOUTH;
                    panels[i].add(textFields[i], gbc);

                    gbc.gridy = 4;
                    gbc.anchor = GridBagConstraints.SOUTH;
                    panels[i].add(buttons[i], gbc);

                    gbc.gridy = 2;
                    gbc.weighty = 6;
                    gbc.anchor = GridBagConstraints.CENTER;
                    panels[i].add(displayLabels[i], gbc);

                }
                frame.setVisible(true);
            }
        }