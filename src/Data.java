import java.io.File;

public class Data {

    //word files
    public File getWordFile(String wordFile){

        if(wordFile.equals("customers")) {
            File wordCustomers = new File("C:\\Users\\Ludde\\Desktop\\Uppgift3\\Uppgift3B\\Uppgift3b_word_customers3.docx");
            return wordCustomers;
        }
        else if(wordFile.equals("employees")){
            File wordEmployees = new File("C:\\Users\\Ludde\\Desktop\\Uppgift3\\Uppgift3B\\Uppgift3b_word_employees.docx");
            return wordEmployees;
        }
        else{
            return null;
        }
    }
    //access file
    public File getAccessFile(){
        File accessFiles = new File("C:\\Users\\Ludde\\Desktop\\Uppgift3\\Uppgift3access_1.accdb");
        return accessFiles;
    }
    //excel files
    public File getExcelFile(String excelFile){

        if(excelFile.equals("customers")) {
            File excelCustomers = new File("C:\\Users\\Ludde\\Desktop\\Uppgift3\\Uppgift3B\\Uppgift3b_excel_customers.xltx");
            return excelCustomers;
        }
        else if(excelFile.equals("employees")){
            File excelEmployees = new File("C:\\Users\\Ludde\\Desktop\\Uppgift3\\Uppgift3B\\Uppgift3b_excel_employees.xltx");
            return excelEmployees;
        }
        else{
            return null;
        }

    }

    public File getMssqlFile(String mssqlFile){

        if(mssqlFile.equals("customers")) {
            File excelCustomers = new File("C:\\Users\\Ludde\\Desktop\\Uppgift3\\Uppgift3B\\Uppgift3b_mssql_customers.sql");
            return excelCustomers;
        }
        else if(mssqlFile.equals("employees")){
            File excelEmployees = new File("C:\\Users\\Ludde\\Desktop\\Uppgift3\\Uppgift3B\\Uppgift3b_mssql_employees.sql");
            return excelEmployees;
        }
        else{
            return null;
        }

    }
}
