import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Details {
    int id,O,Age;
    String FirstName,LastName,Gender,Country,Date;
    public Details(int id, int o, int age, String firstName, String lastName, String gender, String country, String date) {
        this.id = id;
        this.O = o;
        this.Age = age;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Gender = gender;
        this.Country = country;
        this.Date = date;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", O=" + O +
                ", Age=" + Age +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Country='" + Country + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}


class Details1 {
    int O;
    String id,Age;
    String FirstName,LastName,Gender,Country,Date;
    public Details1(String id, int o, String age, String firstName, String lastName, String gender, String country, String date) {
        this.id = id;
        this.O = o;
        this.Age = age;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Gender = gender;
        this.Country = country;
        this.Date = date;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", O=" + O +
                ", Age=" + Age +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Country='" + Country + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}



class MyThread1 extends Thread{


    public void run(){

        FileInputStream fis= null;

        try {
            fis = new FileInputStream(new File("/home/amantya/Downloads/E1.xls"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        HSSFWorkbook wb= null;

        try {
            wb = new HSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        HSSFSheet sheet=wb.getSheetAt(0);
        // Details d1=new Details()
        FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();



        for (Row row:sheet) {
            ArrayList<String> rowList1 = new ArrayList<>();
            ArrayList<Double> rowListINT1 = new ArrayList<>();


            for (Cell cell:row) {


                switch (formulaEvaluator.evaluateInCell(cell).getCellType()){
                    case Cell.CELL_TYPE_NUMERIC:
                        rowListINT1.add(cell.getNumericCellValue());
                        // System.out.println(cell.getNumericCellValue()+ "\t\t\t");
                        break;

                    case Cell.CELL_TYPE_STRING:
                        rowList1.add(cell.getStringCellValue());
                        break;
                }
            }


            //System.out.println(rowList);
            //System.out.println(rowListINT);
            if(rowList1.contains("First Name")||rowList1.isEmpty()||rowListINT1.contains("1.0"))
            {
                continue;
            }

           // System.out.println(rowList1);
        //    System.out.println(rowListINT1);

            double o = rowListINT1.get(0);
            double age = rowListINT1.get(1);
            double id = rowListINT1.get(2);

            String fName = rowList1.get(0);
            String lName=rowList1.get(1);
            String gender=rowList1.get(2);
            String country=rowList1.get(3);
            String date=rowList1.get(4);

           // System.out.println(id);

            Details obj1 = new Details((int) id, (int) o, (int) age,fName,lName,gender,country,date);
            //System.out.println(obj);

            Map<Integer,Details> map1=new HashMap();
            map1.put(obj1.id,obj1);
           System.out.println(map1);
        }


    }
}




class MyThread2 extends Thread{


    public void run(){

        FileInputStream fis= null;

        try {
            fis = new FileInputStream(new File("/home/amantya/Downloads/E2.xls"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        HSSFWorkbook wb= null;

        try {
            wb = new HSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        HSSFSheet sheet=wb.getSheetAt(0);
        // Details d1=new Details()
        FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();

        for (Row row:sheet) {
            ArrayList<String> rowList = new ArrayList<>();
            ArrayList<Double> rowListINT = new ArrayList<>();
            for (Cell cell:row) {


                switch (formulaEvaluator.evaluateInCell(cell).getCellType()){
                    case Cell.CELL_TYPE_NUMERIC:
                        rowListINT.add(cell.getNumericCellValue());
                        // System.out.println(cell.getNumericCellValue()+ "\t\t\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        rowList.add(cell.getStringCellValue());
                        break;
                }
            }


            //System.out.println(rowList);
            //System.out.println(rowListINT);
            if(rowList.contains("First Name")||rowList.isEmpty()||rowListINT.contains("1.0"))
            {
                continue;
            }

           // System.out.println(rowList);
          //  System.out.println(rowListINT);
            String id = rowList.get(6);
            double o = rowListINT.get(0);
            String age = rowList.get(4);
            String fName = rowList.get(0);
            String lName=rowList.get(1);
            String gender=rowList.get(2);
            String country=rowList.get(3);
            String date=rowList.get(6);
            Details1 obj2 = new Details1(id, (int) o, age,fName,lName,gender,country,date);
            //System.out.println(obj);

            Map<Integer,Details1> map=new HashMap();
            map.put(obj2.O,obj2);
            System.out.println(map);
        }


    }
}



public class ReadExcelFile {
    public static void main(String[] args) throws IOException, InterruptedException {
        MyThread1 t1=new MyThread1();
        t1.start();
        t1.join();

        MyThread2 t2= new MyThread2();
        t2.start();
//        Map<Integer,MyThread1> map=new HashMap<>();
    }
}