package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;

public class LTPanel extends JPanel {
    private JLabel label;
    private JTextField textField;

    public LTPanel(String label) {
        super();

        this.label = new JLabel(label);
        this.add(this.label);

        textField = new JTextField(40);
        this.add(textField);
    }

    public String getText() {
        return textField.getText();
    }

    public void setText(String text) {
        textField.setText(text);
    }
}
