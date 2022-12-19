package OS_Mini_Project;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InputFrame implements ActionListener {
    JFrame frame;
    JComboBox<String> comboBox;
    JTextField arrival;
    JTextField burst;
    JButton solve;

    InputFrame() {
//        JFrame -> Satyam's Frame
        frame = new JFrame();
        frame.setTitle("OS Mini Project- Satyam");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 450);

        String[] algorithm = {"First Come First Serve (FCFS)", "Shortest Job First Preemptive(SJF-P)", "Shortest Job First Non Preemptive (SJF-NP)"};
        comboBox = new JComboBox<>(algorithm);

        frame.getContentPane().setBackground(new Color(230, 230, 230));
        frame.setLayout(null);
        JLabel input = new JLabel();
        input.setText("Input");
        input.setForeground(Color.BLACK);
        input.setBounds(30, 10, 100, 50);
        input.setFont(new Font(null, Font.BOLD, 40));
        JLabel algo = new JLabel("Algorithm");
        algo.setBounds(25, 70, 90, 30);
        algo.setFont(new Font(null, Font.CENTER_BASELINE, 15));
        comboBox.setBounds(20, 100, 350, 40);
        comboBox.setFont(new Font("Sans Serif", Font.PLAIN, 15));
//        Now adding the label Arrival Time
        JLabel at = new JLabel("Arrival Time");
        at.setBounds(25, 150, 90, 30);
        at.setFont(new Font(null, Font.CENTER_BASELINE, 15));
        JLabel bt = new JLabel("Burst Time");
        bt.setBounds(25, 230, 90, 30);
        bt.setFont(new Font(null, Font.CENTER_BASELINE, 15));
        comboBox.setBackground(new Color(215, 245, 255));
        comboBox.setForeground(Color.BLACK);
        comboBox.addActionListener(this);
//        TextFeild for arrival time
        arrival = new JTextField();
//        arrival.setFocusable(false);
        arrival.setForeground(Color.black);
        arrival.setBackground(new Color(215, 245, 255));
        arrival.setFont(new Font("Sans Serif", Font.PLAIN, 15));
        arrival.setBounds(20, 180, 350, 40);
        burst = new JTextField();
//        arrival.setFocusable(false);
        burst.setForeground(Color.black);
        burst.setBackground(new Color(215, 245, 255));
        burst.setFont(new Font("Sans Serif", Font.PLAIN, 15));
        burst.setBounds(20, 260, 350, 40);
//        adding the submit button
        solve = new JButton("Solve");
        solve.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        solve.setBounds(20, 320, 90, 40);
        solve.setBackground(new Color(100, 180, 255));
        solve.setForeground(Color.white);
        solve.addActionListener(this);
        frame.add(solve);
        frame.add(arrival);
        frame.add(burst);
        frame.add(algo);
        frame.add(at);
        frame.add(bt);
        frame.add(input);
        frame.add(comboBox);
        frame.setVisible(true);
    }

    //    override
    public void actionPerformed(ActionEvent e) {
        int index = comboBox.getSelectedIndex();
//      checking for the combo box
        if (e.getSource() == solve) {
            new FinalFrame(index, arrival.getText(), burst.getText());
        }
    }
}

