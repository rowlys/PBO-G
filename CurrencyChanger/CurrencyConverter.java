import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class CurrencyConverter
{
    private JFrame frame;
    private JComboBox<String> fromCurrency;
    private JComboBox<String> toCurrency;
    private JComboBox<String> crashCurrency;
    private JTextField amountField;
    private JLabel resultLabel;
    private JTextArea ratesDisplay;
    private List<Currency> currencies;

    public CurrencyConverter()
    {
        currencies = new ArrayList<>();
        
        initializeCurrencies();
        createGUI();
        startFluctuationTimer();
    }

    private void initializeCurrencies() {
        currencies.add(new IDR());
        currencies.add(new USD());
        currencies.add(new EUR());
        currencies.add(new W());
        currencies.add(new SGD());
        currencies.add(new JPY());
        currencies.add(new AUD());
    }
    
    private void createGUI(){
        frame = new JFrame("Currency Converter");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        fromCurrency = new JComboBox<>(currencies.stream().map(Currency::getName).toArray(String[]::new));
        toCurrency = new JComboBox<>(currencies.stream().map(Currency::getName).toArray(String[]::new));
        crashCurrency = new JComboBox<>(currencies.stream().map(Currency::getName).toArray(String[]::new));
        
        amountField = new JTextField();
        resultLabel = new JLabel("Converted Amount: ", JLabel.CENTER);
        ratesDisplay = new JTextArea();
        
        updateRatesDisplay();
        
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JPanel inputPanel = new JPanel(new GridBagLayout());
        
        gbc.gridx = 0;
        gbc.gridy = 0; 
        gbc.weightx = 0.5;
        inputPanel.add(new JLabel("From Currency:"), gbc);
        
        gbc.gridx = 1;
        gbc.weightx = 1.0; 
        inputPanel.add(fromCurrency, gbc);
        
        gbc.gridx = 0; 
        gbc.gridy = 1; 
        gbc.weightx = 0.5; 
        inputPanel.add(new JLabel("To Currency:"), gbc);
    
        gbc.gridx = 1; 
        gbc.weightx = 1.0; 
        inputPanel.add(toCurrency, gbc);
    
        gbc.gridx = 0; 
        gbc.gridy = 2; 
        gbc.weightx = 0.5; 
        inputPanel.add(new JLabel("Amount:"), gbc);
    
        gbc.gridx = 1; 
        gbc.weightx = 1.0; 
        inputPanel.add(amountField, gbc);
        
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        JButton convertButton = new JButton("Convert");
        
        GridBagConstraints gbcButton = new GridBagConstraints();
        gbcButton.insets = new Insets(5, 5, 5, 5);
        gbcButton.gridx = 0;
        gbcButton.gridy = 0;
        buttonPanel.add(convertButton, gbcButton);
    
        gbcButton.gridy = 1;
        buttonPanel.add(resultLabel, gbcButton);
        
        JButton crashButton= new JButton("Crash currency");
    
        gbcButton.gridx = 0;
        gbcButton.gridy = 2;
        buttonPanel.add(crashCurrency, gbcButton);
        
        gbcButton.gridx = 0;
        gbcButton.gridy = 3;
        buttonPanel.add(crashButton, gbcButton);
        
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(buttonPanel, BorderLayout.NORTH);
    
        ratesDisplay = new JTextArea();
        ratesDisplay.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(ratesDisplay);
        JPanel ratesPanel = new JPanel(new BorderLayout());
        ratesPanel.setPreferredSize(new Dimension(300, 200));
        ratesPanel.add(scrollPane, BorderLayout.CENTER);
        ratesPanel.setBorder(BorderFactory.createTitledBorder("Live Exchange Rates"));        
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(ratesPanel, BorderLayout.SOUTH);
    
        frame.add(mainPanel, BorderLayout.CENTER);
        
        convertButton.addActionListener(e -> convertCurrency());
        crashButton.addActionListener(e -> crashCurrency());
        
        
        frame.setVisible(true);
        
    }
    
    
    private void convertCurrency(){
        try {
            String fromName = (String) fromCurrency.getSelectedItem();
            String toName = (String) toCurrency.getSelectedItem();
            
            double amount = Double.parseDouble(amountField.getText());
            
            Currency fromCur = currencies.stream().filter(c -> c.getName().equals(fromName)).findFirst().orElse(null);
            Currency toCur = currencies.stream().filter(c -> c.getName().equals(toName)).findFirst().orElse(null);
            
            if (fromCur != null && toCur != null){
                double converted = (fromCur.getRateFromIDR()/toCur.getRateFromIDR()) * amount;
                resultLabel.setText("Converted amount: " + String.format("%.2f", converted) + " " + toName);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number for the amount.");
        }
    }
    
    private void crashCurrency(){
        try {
            String targetName = (String) crashCurrency.getSelectedItem();
            
            Currency targetCur = currencies.stream().filter(c -> c.getName().equals(targetName)).findFirst().orElse(null);
        
            if (targetCur != null){
                targetCur.economicalCrash();
                updateRatesDisplay();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please select a currency.");
        }
    }
    
    private void startFluctuationTimer(){
        Timer timer = new Timer();
        
        timer.schedule(new TimerTask () {
            @Override
            
            public void run(){
                fluctuateRates();
                updateRatesDisplay();
            }
        }, 0, 10000);
    }
    
    private void fluctuateRates() {
        for (Currency currency : currencies) {
            if (!currency.getName().equals("IDR")) { 
                currency.fluctuateRate();
            }
        }
    }
    
    private void updateRatesDisplay() {
        StringBuilder ratesText = new StringBuilder("Live Exchange Rates:\n");
        for (Currency currency : currencies) {
            ratesText.append(currency.getName()).append(": ").append(String.format("%.2f", currency.getRateFromIDR())).append("\n");
        }
        ratesDisplay.setText(ratesText.toString());
    }
    
    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
