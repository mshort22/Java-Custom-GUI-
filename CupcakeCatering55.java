import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class CupcakeCatering55 extends JFrame {
  
   private JLabel sizeLabel, requestLabel, icingLabel, cakeLabel, occasionLabel, fnameLabel, customerLabel, loyaltyLabel, cupcakeImageLabel,
    cicingLabel, phoneLabel, zipLabel, cityLabel, lnameLabel, stateLabel, valueLabel, streetLabel;
    private JPanel northPanel ,northPanel2, centerPanel, centerPanel2, centerPanel3, eastPanel, eastPanel2, southPanel, westPanel, westPanel2;
    private JRadioButton smallButton, mediumButton, largeButton, birthdayButton, weddingButton, anniversaryButton,
    cicingButton, vicingButton, sicingButton;
    private JCheckBox giftBox, chocBox, vanBox, straBox, rasBox, chamBox;
    private JButton orderButton, clearButton, helpButton;
    private ButtonGroup sizeGroup, occasionGroup, icingGroup;
    private JTextArea requestArea;
    private JComboBox icingBox, cakeBox, customerBox, loyaltyBox, valueBox;
    private JTextField fnameLabelTextField, lnameLabelTextField, streetLabelTextField, cityLabelTextField, 
    stateLabelTextField, zipLabelTextField, phoneLabelTextField;
    private ImageIcon  cupcakeImageIcon;
    public CupcakeCatering55() {
      
      
      super ("CupcakeCatering");
      fnameLabel = new JLabel("Enter First Name");
      fnameLabelTextField = new JTextField(10);
      lnameLabel = new JLabel("Enter Last Name");
      lnameLabelTextField = new JTextField(10);
      streetLabel = new JLabel("Enter Street");
      streetLabelTextField = new JTextField(10);
      cityLabel = new JLabel("Enter City");
      cityLabelTextField = new JTextField(10);
      stateLabel = new JLabel("Enter State");
      stateLabelTextField = new JTextField(10);
      zipLabel = new JLabel("Enter Zip Code");
      zipLabelTextField = new JTextField(10);
      phoneLabel = new JLabel("Enter Phone Number");
      phoneLabelTextField = new JTextField(10);
      giftBox = new JCheckBox("Gift");
      requestLabel = new JLabel("Special Requests:");
      requestArea = new JTextArea(13, 7);
      eastPanel = new JPanel();
      eastPanel.setLayout(new GridLayout(15,1));
      eastPanel.add(lnameLabel);
      eastPanel.add(lnameLabelTextField);
      eastPanel.add(fnameLabel);
      eastPanel.add(fnameLabelTextField);
      eastPanel.add(streetLabel);
      eastPanel.add(streetLabelTextField);
      eastPanel.add(cityLabel);
      eastPanel.add(cityLabelTextField);
      eastPanel.add(stateLabel);
      eastPanel.add(stateLabelTextField);
      eastPanel.add(zipLabel);
      eastPanel.add(zipLabelTextField);
      eastPanel.add(phoneLabel);
      eastPanel.add(phoneLabelTextField);
      eastPanel.add(giftBox);
      eastPanel.add(requestLabel);
      eastPanel.add(requestArea);
      eastPanel2 = new JPanel();
      eastPanel2.add(eastPanel);
      add(eastPanel, BorderLayout.EAST);
      
      
        sizeLabel = new JLabel("Cupcake Size:");
        smallButton = new JRadioButton("Small");
        mediumButton = new JRadioButton("Medium");
        largeButton = new JRadioButton("Large");
        chocBox = new JCheckBox("Chocolate");
        vanBox = new JCheckBox("Vanilla");
        straBox = new JCheckBox("Strawberry");
        rasBox = new JCheckBox("Rasberry");
        chamBox = new JCheckBox("Champagne");
        sizeGroup = new ButtonGroup();
        centerPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(2, 2);
        sizeGroup.add(smallButton);
        sizeGroup.add(mediumButton);
        sizeGroup.add(largeButton);
        centerPanel.add(sizeLabel);
        centerPanel.add(smallButton);
        centerPanel.add(mediumButton);
        centerPanel.add(largeButton);
        centerPanel.add(chocBox);
        centerPanel.add(vanBox);
        centerPanel.add(straBox);
        centerPanel.add(rasBox);
        centerPanel.add(chamBox);
        add(centerPanel, BorderLayout.CENTER);
        
        
        orderButton = new JButton("Order");
        clearButton = new JButton("Clear");
        helpButton = new JButton("Help");
        southPanel = new JPanel();
        southPanel.add(orderButton);
        southPanel.add(clearButton);
        southPanel.add(helpButton);
        add(southPanel, BorderLayout.SOUTH);
        southPanel.setBackground(Color.PINK);
        
        occasionLabel = new JLabel("Occasion:");
        birthdayButton = new JRadioButton("Birthday");
        weddingButton = new JRadioButton("Wedding");
        anniversaryButton = new JRadioButton("Anniversary");
        occasionGroup = new ButtonGroup();
        occasionGroup.add(birthdayButton);
        occasionGroup.add(weddingButton);
        occasionGroup.add(largeButton);
        westPanel = new JPanel();
        westPanel.add(occasionLabel);
        westPanel.add(birthdayButton);
        westPanel.add(weddingButton);
        westPanel.add(anniversaryButton);
        westPanel2 = new JPanel();
        westPanel2.add(westPanel);
        add(westPanel2, BorderLayout.WEST);
  
        cupcakeImageIcon =  new ImageIcon("cupcake.jpeg");
        cupcakeImageLabel = new JLabel(cupcakeImageIcon);
        valueLabel = new JLabel("Are you a Value Member:");
        String valueList [] = {"Yes", "No"};
        valueBox = new JComboBox(valueList);
        northPanel = new JPanel();
        northPanel.add(cupcakeImageLabel);        
        northPanel.add(valueLabel);
        northPanel.add(valueBox);
        add(northPanel, BorderLayout.NORTH);
        northPanel.setBackground(Color.PINK);
      
        setVisible(true);
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 

    public static void main(String[] args) {
        CupcakeCatering55 app = new CupcakeCatering55();
    } //END OF MAIN METHOD

} //END OF CLASS