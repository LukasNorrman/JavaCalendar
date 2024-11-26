
//                                  --------------------------------Källor----------------------------

//  https://stackoverflow.com/questions/14159536/creating-jbutton-with-customized-look - knappStyling
//  https://www.youtube.com/watch?v=g2vDARb7gx8 - videon jag tog hjälp av för att använda GridBagLayout & GridBagConstraints

package Calendar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.spi.BreakIteratorProvider;
import java.time.DayOfWeek;
import java.time.LocalDate;



// Skapade en tredje klass för att försöka att få koden att fungera.
public class Kalender3 {

    public static void start3(){

        JFrame frame = new JFrame("Kalender 3");
        frame.setSize(900,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1,7));

        // skapade variabler för dagens datum samt start av veckan.
        LocalDate idag = LocalDate.now();
        LocalDate veckoStart = idag.with(DayOfWeek.MONDAY);

        // använde mig av GridBagConstraints och GridBagLayout för att få rätt på placering av knappar, textfält, datum och veckodag.



        // for-loop där jag skapar alla element i.
        for (int i = 0; i < 7; i++) {
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5,5,5,5);
            gbc.anchor = GridBagConstraints.NORTH;

            JPanel panels = new JPanel(new GridBagLayout());
            panels.setBorder(BorderFactory.createLineBorder(Color.black));
            frame.add(panels);

            // if statement för att hitta vilken dag det är idag samt att markera med en annan färg
            if (veckoStart.plusDays(i).isEqual(idag)) {
                panels.setBackground(new Color(238,255,206));
            }

            // lägger till knapparna med all styling
            JButton buttons = new JButton("Add");
            buttons.setPreferredSize(new Dimension(100,20));
            buttons.setFont(new Font("Tahoma",Font.BOLD,12));
            buttons.setBackground(new Color(59,89,182));
            buttons.setForeground(Color.white);
            buttons.setFocusPainted(false);
            buttons.setBorderPainted(false);


            // lägger till alla textfält
            JTextField textFields = new JTextField(10);

            // lägger till veckodagarna och datum
            JLabel dayLabels = new JLabel(veckoStart.plusDays(i).getDayOfWeek().toString());
            dayLabels.setFont(new Font("Tahoma",Font.BOLD,17));
            JLabel dateLabels = new JLabel(String.valueOf(veckoStart.plusDays(i)));
            dateLabels.setFont(new Font("Tahoma",Font.PLAIN,13));


            // lägger till labeln för att lägga till text
            JLabel displayLabels = new JLabel();


            // skapar så att man kan lägga in text på dagarna
            buttons.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String inputText = textFields.getText();
                    displayLabels.setText(inputText);

                    textFields.setText("");

                    JButton rensaKnapp = new JButton("Clear");
                    rensaKnapp.setPreferredSize(new Dimension(100,20));
                    rensaKnapp.setFont(new Font("Tahoma",Font.BOLD,13));
                    rensaKnapp.setBackground(new Color(168, 58, 83));
                    rensaKnapp.setForeground(Color.white);
                    rensaKnapp.setFocusPainted(false);
                    rensaKnapp.setBorderPainted(false);
                    gbc.gridy = 5;
                    gbc.weighty = 0;
                    gbc.anchor = GridBagConstraints.SOUTH;
                    panels.add(rensaKnapp, gbc);


                    rensaKnapp.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            displayLabels.setText("");
                            rensaKnapp.setVisible(false);
                        }
                    });
                }
            });

            // Placering av knappar, dagar, datum, textfält samt textfältet där eventen ska läggas
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.NORTH;
            panels.add(dayLabels, gbc);

            gbc.gridy = 1;
            gbc.weighty = 0;
            gbc.anchor = GridBagConstraints.NORTH;
            panels.add(dateLabels, gbc);

            gbc.gridy = 3;
            gbc.anchor = GridBagConstraints.SOUTH;
            panels.add(textFields, gbc);

            gbc.gridy = 4;
            gbc.weighty = 0;
            gbc.anchor = GridBagConstraints.SOUTH;
            panels.add(buttons, gbc);

            gbc.gridy = 2;
            gbc.weighty = 6;
            gbc.anchor = GridBagConstraints.CENTER;
            panels.add(displayLabels, gbc);
        }
        frame.setVisible(true);
    }
}