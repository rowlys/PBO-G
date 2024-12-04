import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.io.File;  

public class ImageChooserPanel {  
    private JFrame frame;  
    private JLabel imageLabel;  

    public ImageChooserPanel() {  
        frame = new JFrame("Image Chooser");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        JPanel panel = new JPanel();  
        panel.setLayout(new BorderLayout());  

        imageLabel = new JLabel("No Image Selected", SwingConstants.CENTER);  
        imageLabel.setFont(new Font("Arial", Font.BOLD, 16));  

        JButton btnChooseImage = new JButton("Choose Image");  
        btnChooseImage.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                chooseImage();  
            }  
        });  

        panel.add(imageLabel, BorderLayout.CENTER);  
        panel.add(btnChooseImage, BorderLayout.SOUTH);  

        frame.getContentPane().add(panel);  
        frame.setSize(600, 400);  
        frame.setVisible(true);  
    }  

    private void chooseImage() {  
        JFileChooser fileChooser = new JFileChooser();  
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);  
        fileChooser.setAcceptAllFileFilterUsed(false);  
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif"));  

        int returnValue = fileChooser.showOpenDialog(frame);  
        if (returnValue == JFileChooser.APPROVE_OPTION) {  
            File selectedFile = fileChooser.getSelectedFile();  
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());  

            Image image = imageIcon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);  
            imageLabel.setIcon(new ImageIcon(image));  
            imageLabel.setText("");
        }  
    }  
}
