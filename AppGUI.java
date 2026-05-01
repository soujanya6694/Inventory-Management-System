import javax.swing.*;
import java.awt.event.*;

public class AppGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Inventory Management System");

        JLabel nameLabel = new JLabel("Product Name:");
        nameLabel.setBounds(50, 50, 120, 30);

        JTextField nameField = new JTextField();
        nameField.setBounds(180, 50, 150, 30);

        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setBounds(50, 100, 120, 30);

        JTextField priceField = new JTextField();
        priceField.setBounds(180, 100, 150, 30);

        JLabel qtyLabel = new JLabel("Quantity:");
        qtyLabel.setBounds(50, 150, 120, 30);

        JTextField qtyField = new JTextField();
        qtyField.setBounds(180, 150, 150, 30);

        // Payment Options
        JLabel payLabel = new JLabel("Payment Method:");
        payLabel.setBounds(50, 200, 150, 30);

        JRadioButton cash = new JRadioButton("Cash");
        cash.setBounds(50, 230, 100, 30);

        JRadioButton card = new JRadioButton("Card");
        card.setBounds(150, 230, 100, 30);

        JRadioButton upi = new JRadioButton("UPI");
        upi.setBounds(250, 230, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(cash);
        bg.add(card);
        bg.add(upi);

        JButton btn = new JButton("Process Payment");
        btn.setBounds(100, 280, 180, 30);

        JTextArea result = new JTextArea();
        result.setBounds(400, 50, 350, 300);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                double price = Double.parseDouble(priceField.getText());
                int qty = Integer.parseInt(qtyField.getText());

                double total = price * qty;

                String payment = "";
                if (cash.isSelected()) payment = "Cash";
                else if (card.isSelected()) payment = "Card";
                else if (upi.isSelected()) payment = "UPI";

                result.setText("=========== RECEIPT ===========\n\n");
                result.append("Product Name : " + name + "\n");
                result.append("Price        : ₹" + price + "\n");
                result.append("Quantity     : " + qty + "\n");
                result.append("-------------------------------\n");
                result.append("Total Amount : ₹" + total + "\n");
                result.append("Payment Mode : " + payment + "\n");
                result.append("Status       : Payment Successful\n");
                result.append("-------------------------------\n");
                result.append("Thank You!\n");
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(priceLabel);
        frame.add(priceField);
        frame.add(qtyLabel);
        frame.add(qtyField);
        frame.add(payLabel);
        frame.add(cash);
        frame.add(card);
        frame.add(upi);
        frame.add(btn);
        frame.add(result);

        frame.setSize(800, 450);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}