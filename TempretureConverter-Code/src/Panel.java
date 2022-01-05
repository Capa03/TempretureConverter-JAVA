import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {

    static final int screen_widht = 300;
    static final int screen_height = 200;

    Panel(){
        this.setPreferredSize(new Dimension(screen_widht,screen_height));
        this.setBackground(Color.WHITE);
        this.setFocusable(true);
        startPanel();
    }

    public void startPanel(){
        //fahrenheit
        JLabel fahrenheit = new JLabel("Fahrenheit");
        fahrenheit.setBounds(10,20,80,25);
        this.add(fahrenheit);

        JTextField fahrenheitInsert = new JTextField(3);
        fahrenheitInsert.setBounds(100,20,80,25);
        this.add(fahrenheitInsert);

        //Celsious
        JLabel celsious = new JLabel("Celsious:");
        celsious.setBounds(10,60,80,25);
        this.add(celsious);

        JLabel resultCelcious = new JLabel("");
        resultCelcious.setBounds(100,60,80,25);
        this.add(resultCelcious);

        //Convert Button
        JButton convert = new JButton("Convert");
        convert.setBounds(100,100,100,25);


        convert.addActionListener(new ActionListener(){


            @Override
            public void actionPerformed(ActionEvent e){
                String f = fahrenheitInsert.getText();
                int far = Integer.parseInt(f);
                double c = (far - 32.0) * 5.0/9.0;
                resultCelcious.setText(""+c);
                resultCelcious.setVisible(true);
            }
        });
        this.add(convert);

        this.setVisible(true);
    }
    }

