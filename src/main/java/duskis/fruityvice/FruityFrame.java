package duskis.fruityvice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FruityFrame extends JFrame{

    private final JTextField searchbar;
    private final JLabel familyLabel;
    private final JLabel orderLabel;
    private final JLabel genusLabel;
    private final JLabel caloriesLabel;
    private final JLabel fatLabel;
    private final JLabel sugarLabel;
    private final JLabel carbsLabel;
    private final JLabel protienLabel;

    public FruityFrame(){
        setSize(600, 800);
        setTitle("Fruity Vice");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());

        GridBagConstraints constraints;

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        searchbar = new JTextField("Strawberry");
        add(searchbar, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 3;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.BOTH;
        searchbutton = new JTextField("Search");
        add(searchbutton, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 9;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        picture = new JLabel();
        add(picture, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 2;
        constraints.gridy = 1;
        familyLabel = new JLabel("Family");
        add(familyLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 3;
        constraints.gridy = 1;
        JLabel family = new JLabel();
        add(family, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 2;
        constraints.gridy = 2;
        orderLabel = new JLabel("Order");
        add(orderLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 2;
        constraints.gridy = 3;
        JLabel order = new JLabel();
        add(order, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 2;
        constraints.gridy = 3;
        genusLabel = new JLabel("Genus");
        add(genusLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 3;
        constraints.gridy = 3;
        JLabel genus = new JLabel();
        add(genus, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 2;
        constraints.gridy = 4;
        caloriesLabel = new JLabel("Calories");
        add(caloriesLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 3;
        constraints.gridy = 4;
        JLabel calories = new JLabel();
        add(calories, constraints);
    }
}
