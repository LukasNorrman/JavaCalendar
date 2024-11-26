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

public class Kalender {


    public static void start(){

        JFrame frame = new JFrame("Kalender");
        frame.setSize(900,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1,7));

        // skapade variabler för dagens datum samt start av veckan.
        LocalDate idag = LocalDate.now();
        LocalDate veckoStart = idag.with(DayOfWeek.MONDAY);

        // använde mig av GridBagConstraints och GridBagLayout för att få rätt på placering av knappar, textfält, datum och veckodag.
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.anchor = GridBagConstraints.NORTH;


        // skapade 7 paneler, 1 för varje dag i veckan
        JPanel panel1 = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel(new GridBagLayout());
        JPanel panel3 = new JPanel(new GridBagLayout());
        JPanel panel4 = new JPanel(new GridBagLayout());
        JPanel panel5 = new JPanel(new GridBagLayout());
        JPanel panel6 = new JPanel(new GridBagLayout());
        JPanel panel7 = new JPanel(new GridBagLayout());

        // lägger till paneler till ramen
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel7);

        // skapade borders mellan varje JPanel för att det ska vara en tydlig skillnad mellan dagarna
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel2.setBorder(BorderFactory.createLineBorder(Color.black));
        panel3.setBorder(BorderFactory.createLineBorder(Color.black));
        panel4.setBorder(BorderFactory.createLineBorder(Color.black));
        panel5.setBorder(BorderFactory.createLineBorder(Color.black));
        panel6.setBorder(BorderFactory.createLineBorder(Color.black));
        panel7.setBorder(BorderFactory.createLineBorder(Color.black));

        // Skapar 7 knappar och ändrar utseendet för att få knapparna att se snyggare och roligare ut
        JButton button1 = new JButton("Add");
        button1.setPreferredSize(new Dimension(100,20));
        button1.setFont(new Font("Tahoma",Font.BOLD,12));
        button1.setBackground(new Color(59,89,182));//import java.awt.Color;
        button1.setForeground(Color.WHITE);
        button1.setFocusPainted(false);
        button1.setBorderPainted(false);

        JButton button2 = new JButton("Add");
        button2.setPreferredSize(new Dimension(100,20));
        button2.setBackground(new Color(59, 89, 182));
        button2.setForeground(Color.WHITE);
        button2.setFocusPainted(false);
        button2.setBorderPainted(false);
        button2.setFont(new Font("Tahoma", Font.BOLD, 12));

        JButton button3 = new JButton("Add");
        button3.setPreferredSize(new Dimension(100,20));
        button3.setBackground(new Color(59, 89, 182));
        button3.setForeground(Color.WHITE);
        button3.setFocusPainted(false);
        button3.setBorderPainted(false);
        button3.setFont(new Font("Tahoma", Font.BOLD, 12));

        JButton button4 = new JButton("Add");
        button4.setPreferredSize(new Dimension(100,20));
        button4.setBackground(new Color(59, 89, 182));
        button4.setForeground(Color.WHITE);
        button4.setFocusPainted(false);
        button4.setBorderPainted(false);
        button4.setFont(new Font("Tahoma", Font.BOLD, 12));

        JButton button5 = new JButton("Add");
        button5.setPreferredSize(new Dimension(100,20));
        button5.setBackground(new Color(59, 89, 182));
        button5.setForeground(Color.WHITE);
        button5.setFocusPainted(false);
        button5.setBorderPainted(false);
        button5.setFont(new Font("Tahoma", Font.BOLD, 12));

        JButton button6 = new JButton("Add");
        button6.setPreferredSize(new Dimension(100,20));
        button6.setBackground(new Color(59, 89, 182));
        button6.setForeground(Color.WHITE);
        button6.setFocusPainted(false);
        button6.setBorderPainted(false);
        button6.setFont(new Font("Tahoma", Font.BOLD, 12));

        JButton button7 = new JButton("Add");
        button7.setPreferredSize(new Dimension(100,20));
        button7.setBackground(new Color(59, 89, 182));
        button7.setForeground(Color.WHITE);
        button7.setFocusPainted(false);
        button7.setBorderPainted(false);
        button7.setFont(new Font("Tahoma", Font.BOLD, 12));

        // skapar 7 textfält för att kunna lägga in text
        JTextField tf1 = new JTextField(10);
        JTextField tf2 = new JTextField(10);
        JTextField tf3 = new JTextField(10);
        JTextField tf4 = new JTextField(10);
        JTextField tf5 = new JTextField(10);
        JTextField tf6 = new JTextField(10);
        JTextField tf7 = new JTextField(10);


        // Skapar 7 labels för veckodagarna
        JLabel dayLabel1 = new JLabel(veckoStart.getDayOfWeek().toString());
        JLabel dayLabel2 = new JLabel(veckoStart.getDayOfWeek().plus(1).toString());
        JLabel dayLabel3 = new JLabel(veckoStart.getDayOfWeek().plus(2).toString());
        JLabel dayLabel4 = new JLabel(veckoStart.getDayOfWeek().plus(3).toString());
        JLabel dayLabel5 = new JLabel(veckoStart.getDayOfWeek().plus(4).toString());
        JLabel dayLabel6 = new JLabel(veckoStart.getDayOfWeek().plus(5).toString());
        JLabel dayLabel7 = new JLabel(veckoStart.getDayOfWeek().plus(6).toString());

        // Ändrar storleken och fonten för veckodagarna
        dayLabel1.setFont(new Font("Tahoma", Font.BOLD, 17));
        dayLabel2.setFont(new Font("Tahoma", Font.BOLD, 17));
        dayLabel3.setFont(new Font("Tahoma", Font.BOLD, 17));
        dayLabel4.setFont(new Font("Tahoma", Font.BOLD, 17));
        dayLabel5.setFont(new Font("Tahoma", Font.BOLD, 17));
        dayLabel6.setFont(new Font("Tahoma", Font.BOLD, 17));
        dayLabel7.setFont(new Font("Tahoma", Font.BOLD, 17));


        // Skapar 7 labels för att displaya datum
        JLabel dateLabel1 = new JLabel(String.valueOf(veckoStart));
        JLabel dateLabel2 = new JLabel(String.valueOf(veckoStart.plusDays(1)));
        JLabel dateLabel3 = new JLabel(String.valueOf(veckoStart.plusDays(2)));
        JLabel dateLabel4 = new JLabel(String.valueOf(veckoStart.plusDays(3)));
        JLabel dateLabel5 = new JLabel(String.valueOf(veckoStart.plusDays(4)));
        JLabel dateLabel6 = new JLabel(String.valueOf(veckoStart.plusDays(5)));
        JLabel dateLabel7 = new JLabel(String.valueOf(veckoStart.plusDays(6)));

        // Ändrar storleken och fonten på datum labeln
        dateLabel1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        dateLabel2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        dateLabel3.setFont(new Font("Tahoma", Font.PLAIN, 13));
        dateLabel4.setFont(new Font("Tahoma", Font.PLAIN, 13));
        dateLabel5.setFont(new Font("Tahoma", Font.PLAIN, 13));
        dateLabel6.setFont(new Font("Tahoma", Font.PLAIN, 13));
        dateLabel7.setFont(new Font("Tahoma", Font.PLAIN, 13));

        // Skapar 7 textfält för att få ut text från textfältet på kalendern
        JLabel displayTfLabel1 = new JLabel();
        JLabel displayTfLabel2 = new JLabel();
        JLabel displayTfLabel3 = new JLabel();
        JLabel displayTfLabel4 = new JLabel();
        JLabel displayTfLabel5 = new JLabel();
        JLabel displayTfLabel6 = new JLabel();
        JLabel displayTfLabel7 = new JLabel();



        // ActionListeners för att kunna lägga in event och annat på varje dag, och för att kunna outputa texten från textfältet.
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = tf1.getText();
                displayTfLabel1.setText(inputText);

                tf1.setText("");

                JButton rensaKnapp = new JButton("Clear");
                rensaKnapp.setPreferredSize(new Dimension(100,20));
                rensaKnapp.setFont(new Font("Tahoma",Font.BOLD,13));
                rensaKnapp.setBackground(new Color(168, 44, 69));
                rensaKnapp.setForeground(Color.white);
                rensaKnapp.setFocusPainted(false);
                rensaKnapp.setBorderPainted(false);
                gbc.gridy = 5;
                gbc.weighty = 0;
                gbc.anchor = GridBagConstraints.SOUTH;
                panel1.add(rensaKnapp, gbc);

                rensaKnapp.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        displayTfLabel1.setText("");
                        rensaKnapp.setVisible(false);
                    }
                });
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = tf2.getText();
                displayTfLabel2.setText(inputText);

                tf2.setText("");

                JButton rensaKnapp = new JButton("Clear");
                rensaKnapp.setPreferredSize(new Dimension(100,20));
                rensaKnapp.setFont(new Font("Tahoma",Font.BOLD,13));
                rensaKnapp.setBackground(new Color(168, 44, 69));
                rensaKnapp.setForeground(Color.white);
                rensaKnapp.setFocusPainted(false);
                rensaKnapp.setBorderPainted(false);
                gbc.gridy = 5;
                gbc.weighty = 0;
                gbc.anchor = GridBagConstraints.SOUTH;
                panel2.add(rensaKnapp, gbc);

                rensaKnapp.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        displayTfLabel2.setText("");
                        rensaKnapp.setVisible(false);
                    }
                });
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = tf3.getText();
                displayTfLabel3.setText(inputText);

                tf3.setText("");

                JButton rensaKnapp = new JButton("Clear");
                rensaKnapp.setPreferredSize(new Dimension(100,20));
                rensaKnapp.setFont(new Font("Tahoma",Font.BOLD,13));
                rensaKnapp.setBackground(new Color(168, 44, 69));
                rensaKnapp.setForeground(Color.white);
                rensaKnapp.setFocusPainted(false);
                rensaKnapp.setBorderPainted(false);
                gbc.gridy = 5;
                gbc.weighty = 0;
                gbc.anchor = GridBagConstraints.SOUTH;
                panel3.add(rensaKnapp, gbc);

                rensaKnapp.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        displayTfLabel3.setText("");
                        rensaKnapp.setVisible(false);
                    }
                });
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = tf4.getText();
                displayTfLabel4.setText(inputText);

                tf4.setText("");

                JButton rensaKnapp = new JButton("Clear");
                rensaKnapp.setPreferredSize(new Dimension(100,20));
                rensaKnapp.setFont(new Font("Tahoma",Font.BOLD,13));
                rensaKnapp.setBackground(new Color(225, 0, 45));
                rensaKnapp.setForeground(Color.white);
                rensaKnapp.setFocusPainted(false);
                rensaKnapp.setBorderPainted(false);
                gbc.gridy = 5;
                gbc.weighty = 0;
                gbc.anchor = GridBagConstraints.SOUTH;
                panel4.add(rensaKnapp, gbc);

                rensaKnapp.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        displayTfLabel4.setText("");
                        rensaKnapp.setVisible(false);
                    }
                });
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = tf5.getText();
                displayTfLabel5.setText(inputText);

                tf5.setText("");

                JButton rensaKnapp = new JButton("Clear");
                rensaKnapp.setPreferredSize(new Dimension(100,20));
                rensaKnapp.setFont(new Font("Tahoma",Font.BOLD,13));
                rensaKnapp.setBackground(new Color(225, 0, 45));
                rensaKnapp.setForeground(Color.white);
                rensaKnapp.setFocusPainted(false);
                rensaKnapp.setBorderPainted(false);
                gbc.gridy = 5;
                gbc.weighty = 0;
                gbc.anchor = GridBagConstraints.SOUTH;
                panel5.add(rensaKnapp, gbc);

                rensaKnapp.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        displayTfLabel5.setText("");
                        rensaKnapp.setVisible(false);
                    }
                });
            }
        });

        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = tf6.getText();
                displayTfLabel6.setText(inputText);

                tf6.setText("");

                JButton rensaKnapp = new JButton("Clear");
                rensaKnapp.setPreferredSize(new Dimension(100,20));
                rensaKnapp.setFont(new Font("Tahoma",Font.BOLD,13));
                rensaKnapp.setBackground(new Color(225, 0, 45));
                rensaKnapp.setForeground(Color.white);
                rensaKnapp.setFocusPainted(false);
                rensaKnapp.setBorderPainted(false);
                gbc.gridy = 5;
                gbc.weighty = 0;
                gbc.anchor = GridBagConstraints.SOUTH;
                panel6.add(rensaKnapp, gbc);

                rensaKnapp.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        displayTfLabel6.setText("");
                        rensaKnapp.setVisible(false);
                    }
                });
            }
        });

        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = tf7.getText();
                displayTfLabel7.setText(inputText);

                tf7.setText("");

                JButton rensaKnapp = new JButton("Clear");
                rensaKnapp.setPreferredSize(new Dimension(100,20));
                rensaKnapp.setFont(new Font("Tahoma",Font.BOLD,13));
                rensaKnapp.setBackground(new Color(225, 0, 45));
                rensaKnapp.setForeground(Color.white);
                rensaKnapp.setFocusPainted(false);
                rensaKnapp.setBorderPainted(false);
                gbc.gridy = 5;
                gbc.weighty = 0;
                gbc.anchor = GridBagConstraints.SOUTH;
                panel7.add(rensaKnapp, gbc);

                rensaKnapp.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        displayTfLabel7.setText("");
                        rensaKnapp.setVisible(false);
                    }
                });
            }
        });


        // Displayar vilken dag det är idag med hjälp av en annorlunda bakgrundsfärg
        if (veckoStart.isEqual(idag)) {
            panel1.setBackground(new Color(238, 255, 206));
        } else if (veckoStart.plusDays(1).isEqual(idag)) {
            panel2.setBackground(new Color(238, 255, 206));
        } else if (veckoStart.plusDays(2).isEqual(idag)) {
            panel3.setBackground(new Color(238, 255, 206));
        } else if (veckoStart.plusDays(3).isEqual(idag)) {
            panel4.setBackground(new Color(238, 255, 206));
        } else if (veckoStart.plusDays(4).isEqual(idag)) {
            panel5.setBackground(new Color(238, 255, 206));
        } else if (veckoStart.plusDays(5).isEqual(idag)) {
            panel6.setBackground(new Color(238, 255, 206));
        } else if (veckoStart.plusDays(6).isEqual(idag)) {
            panel7.setBackground(new Color(238, 255, 206));
        }


        // Placering av knappar, textField, datum och veckodagar
        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel1.add(button1, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel1.add(tf1, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        panel1.add(dayLabel1, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        panel1.add(dateLabel1, gbc);


        gbc.weighty = 6;
        gbc.gridy = 3;
        panel1.add(displayTfLabel1, gbc);

        //--------------------- panel 2------------------------

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel2.add(button2, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel2.add(tf2, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        panel2.add(dayLabel2, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        panel2.add(dateLabel2, gbc);

        gbc.weighty = 6;
        gbc.gridy = 3;
        panel2.add(displayTfLabel2, gbc);

        //--------------------- panel 3------------------------

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel3.add(button3, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel3.add(tf3, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        panel3.add(dayLabel3, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        panel3.add(dateLabel3, gbc);

        gbc.weighty = 6;
        gbc.gridy = 3;
        panel3.add(displayTfLabel3, gbc);

        //--------------------- panel 4------------------------


        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel4.add(button4, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel4.add(tf4, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        panel4.add(dayLabel4, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        panel4.add(dateLabel4, gbc);

        gbc.weighty = 6;
        gbc.gridy = 3;
        panel4.add(displayTfLabel4, gbc);

        //--------------------- panel 5-----------------------



        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel5.add(button5, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel5.add(tf5, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        panel5.add(dayLabel5, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        panel5.add(dateLabel5, gbc);

        gbc.weighty = 6;
        gbc.gridy = 3;
        panel5.add(displayTfLabel5, gbc);

        //--------------------- panel 6------------------------

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel6.add(button6, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel6.add(tf6, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        panel6.add(dayLabel6, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        panel6.add(dateLabel6, gbc);

        gbc.weighty = 6;
        gbc.gridy = 3;
        panel6.add(displayTfLabel6, gbc);

        //--------------------- panel 7------------------------

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel7.add(button7, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        panel7.add(tf7, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        panel7.add(dayLabel7, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        panel7.add(dateLabel7, gbc);

        gbc.weighty = 6;
        gbc.gridy = 3;
        panel7.add(displayTfLabel7, gbc);

        frame.setVisible(true);
    }
}