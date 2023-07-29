package UI;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Layout implements MouseListener, Constants {
    String[] labelButtons = {"Courses", "Student Grade", "Course Instructor"};
    JPanel listButton[], currentClick, westPanel, eastPanel, northPanel;
    JFrame frame = new JFrame();
    public Layout(){
        listButton = new JPanel[labelButtons.length];
        renderLayout();
    }

    public void renderLayout(){
        JPanel rootPanel = new JPanel();
        rootPanel.setLayout(new BorderLayout(Hgap, Vgap));
        westPanel = westSide();
        eastPanel = eastSide();
        northPanel = northSide();
        rootPanel.add(northPanel, BorderLayout.NORTH);
        rootPanel.add(westPanel, BorderLayout.WEST);
        rootPanel.add(eastPanel, BorderLayout.EAST);
        frame.add(rootPanel);
        frame.setSize(Frame_Width, Frame_Height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JPanel northSide(){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(0, North_Height));
        panel.setBackground(Color.black);
        return panel;
    }

    public JPanel westSide(){
        JPanel panel = new JPanel();
        Panel btnPanel = new Panel();
        btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.Y_AXIS));
        for(int i = 0;i < labelButtons.length;i++){
            listButton[i] = customButton(labelButtons[i], getImage("3.png", 30));
            btnPanel.add(listButton[i]);
        }
        panel.setLayout(new BorderLayout(Hgap, Vgap));
        panel.add(btnPanel, BorderLayout.CENTER);
        panel.add(getImage("man.png", 180), BorderLayout.NORTH);
        panel.setBackground(Color.DARK_GRAY);
        panel.setBorder(new EmptyBorder(10, 0, 0, 0));
        panel.setPreferredSize(new Dimension(West_Width, 500));
        return panel;
    }

    public JPanel eastSide(){
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(Hgap, Vgap));
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(East_Width, 0));
        return panel;
    }

    private JPanel customButton(String value, JLabel icon){
        // resize icon label
        icon.setBorder(new EmptyBorder(0, 10, 0, 10));

        JPanel panel = new JPanel();
        JLabel labelText = new JLabel(value);
        labelText.setForeground(Color.white);
        labelText.setFont(new Font("Verdana", Font.PLAIN, 14));
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.decode("#004D40"));
        panel.add(labelText, BorderLayout.CENTER);
        panel.add(icon, BorderLayout.WEST);
        panel.setName(value);
        panel.addMouseListener(this);
        panel.setMaximumSize(new Dimension(West_Width, 50));
        return panel;
    }

    public JLabel getImage(String name, int size) {
        JLabel picLabel;
        ImageIcon imageIcon = new ImageIcon("src/main/java/UI/image/" + name);
        System.out.println(imageIcon);
        ImageIcon scaleIconUser = new ImageIcon(imageIcon.getImage().getScaledInstance(size, size, Image.SCALE_SMOOTH));
        picLabel = new JLabel(scaleIconUser, JLabel.CENTER);
        return picLabel;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < labelButtons.length; i++) {
            listButton[i].setBackground(Color.decode("#004D40"));
        }
        currentClick = (JPanel) e.getSource();
        currentClick.setBackground(Color.decode("#009688"));
//        ContainerGUI contentOption = new ContainerGUI(panel.getWidth(), panel.getHeight());
        switch(e.getComponent().getName()){
//            case "Courses":
//                eastPanel.removeAll();
//                eastPanel.add(contentOption.khachHang());
//                eastPanel.repaint();
//                eastPanel.revalidate();
//                break;
//
//            case "Student Grade":
//                eastPanel.removeAll();
//                eastPanel.add(contentOption.nhanVien());
//                eastPanel.repaint();
//                eastPanel.revalidate();
//                break;

            case "Course Instructor":
                eastPanel.removeAll();
                eastPanel.add(new CourseInstructorUI());
                eastPanel.repaint();
                eastPanel.revalidate();
                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(e.getComponent().getName());
        for(int i = 0;i < labelButtons.length;i++){
            if(e.getComponent().getName() == labelButtons[i]){
                listButton[i].setBackground(Color.decode("#009688"));
                break;
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JPanel hover = (JPanel) e.getSource();
        if(hover != currentClick){
            hover.setBackground(Color.decode("#004D40"));
        }
    }

    public static void main(String s[]) {
        Layout lo = new Layout();
    }

}
