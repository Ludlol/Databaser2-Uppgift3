import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class GUI {
    public void Frame() {

        //Creates the main frame.
        JFrame mainframe = new JFrame();
        mainframe.setSize(600, 500);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setTitle("Report Opener");

        //Creates a TabbedPane in the main frame.
        JTabbedPane jtp = new JTabbedPane();
        mainframe.getContentPane().add(jtp);

        //Creates and adds Panels to the TabbedPane.
        JPanel startPanel = new JPanel();
        JPanel wordPanel = new JPanel();
        JPanel accessPanel = new JPanel();
        JPanel excelPanel = new JPanel();
        JPanel mssqlPanel = new JPanel();

        jtp.addTab("Start", startPanel);
        jtp.addTab("Word", wordPanel);
        jtp.addTab("Access", accessPanel);
        jtp.addTab("Excel", excelPanel);
        jtp.addTab("MSSQL", mssqlPanel);

        //Create execute buttons.
        final JButton executeFileWord = new JButton("Open word file");
        JButton executeFileAccess = new JButton("Open access file");
        JButton executeFileExcel = new JButton("Open excel file");
        JButton executeFileMSSQL = new JButton("Open MSSQL file");

        //Create ComboBoxes and adds values to the ComboBoxes.
        final String[] fileStringWord = {"Customer report", "Employee report"};
        String[] fileStringExcel = {"Customer report", "Employee report"};
        String[] fileStringMSSQL = {"Customer report", "Employee report"};

        final JComboBox fileListWord = new JComboBox(fileStringWord);
        final JComboBox fileListExcel = new JComboBox(fileStringExcel);
        final JComboBox fileListMSSQL = new JComboBox(fileStringMSSQL);
        JLabel startInfo = new JLabel("Begin to open files by clicking the different tabs in the menu");
        JLabel accessInfo = new JLabel("Click the button to access the reports");

        //Adds text to the startPanel
        startPanel.add(startInfo);
        //Adds ComboBox and Execute button to wordPanel.
        wordPanel.add(fileListWord);
        wordPanel.add(executeFileWord);
        //Add action listener to open word file
        executeFileWord.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(fileListWord.getSelectedItem().equals("Customer report")) {
                    try{
                       Desktop.getDesktop().open(new Data().getWordFile("customers"));
                    }
                    catch (IOException ioex){

                    }
                }
                else if(fileListWord.getSelectedItem().equals("Employee report")) {
                    try{
                        Desktop.getDesktop().open(new Data().getWordFile("employees"));
                    }
                    catch (IOException ioex){
                    }
                }
            }
        });
        //Adds TextField and Execute button to accessPanel.
        accessPanel.add(accessInfo);
        accessPanel.add(executeFileAccess);
        //Add action listener to open access file
        executeFileAccess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    try{
                        Desktop.getDesktop().open(new Data().getAccessFile());
                    }
                    catch (IOException ioex){
                    }
                }

        });

        //Adds ComboBox and Execute button to excelPanel.
        excelPanel.add(fileListExcel);
        excelPanel.add(executeFileExcel);
        //Add action listener to open excel file
        executeFileExcel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(fileListExcel.getSelectedItem().equals("Customer report")) {
                    try{
                        Desktop.getDesktop().open(new Data().getExcelFile("customers"));
                    }
                    catch (IOException ioex){
                    }
                }
                else if(fileListExcel.getSelectedItem().equals("Employee report")) {
                    try{
                        Desktop.getDesktop().open(new Data().getExcelFile("employees"));
                    }
                    catch (IOException ioex){
                    }
                }
            }
        });
        //Adds ComboBox and Execute button to mssqlPanel.
        mssqlPanel.add(fileListMSSQL);
        mssqlPanel.add(executeFileMSSQL);
        //Add action listener to open mssql file
        executeFileMSSQL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(fileListMSSQL.getSelectedItem().equals("Customer report")) {
                    try{
                        Desktop.getDesktop().open(new Data().getMssqlFile("customers"));
                    }
                    catch (IOException ioex){
                    }
                }
                else if(fileListMSSQL.getSelectedItem().equals("Employee report")) {
                    try {
                        Desktop.getDesktop().open(new Data().getMssqlFile("employees"));
                    }
                    catch (IOException ioex){
                    }
                }
            }
        });
        mainframe.setVisible(true);
    }

}
