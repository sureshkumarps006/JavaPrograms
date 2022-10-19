import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import java.util.Map;

class Data{
    String deptname,assigndeptname;
    Data(String dep,String assign){
        this.deptname=dep;
        this.assigndeptname=assign;
    }
    @Override
    public String toString() {
        return "Department Name='" + deptname +
                "\nAssigned Team='" + assigndeptname + '\'' ;
    }
}
class Store{
    String empid, empname,empissue,ticketowner;
    Integer ticketnumber;
    Data assignedteam;
    Store(String id,String name,String issue,Integer number,String owner,Data assigned){
        this.empid=id;
        this.empname=name;
        this.empissue=issue;
        this.ticketnumber=number;
        this.assignedteam=assigned;
        this.ticketowner=owner;
    }
    @Override
    public String toString() {
        return "\nEmployee ='" + empid + '\'' +
                ",\nEmployee name ='" + empname + '\'' +
                ",\nTicket Number =" + ticketnumber +
                ",\nEmployee Issue='" + empissue + '\'' +
                ",\nTicket Owner='" + ticketowner + '\'' +
                ",\nAssigned Team=" + assignedteam ;
    }
}
class Operations extends Thread {
    LinkedHashMap<String, Data> Thr = new LinkedHashMap<>();
    LinkedHashMap<String, Data> Tit = new LinkedHashMap<>();
    @Override
    public void run() {
        try {
            Excelfile();
            //menu();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       menu();
    }
    LinkedHashMap<String, Data> Tfi = new LinkedHashMap<>();
    LinkedHashMap<String, Data> Tfc = new LinkedHashMap<>();
    LinkedHashMap<String, Data> finalmap = new LinkedHashMap<>();
    public void Excelfile() throws IOException {
        LinkedHashMap<String, String> details1 = new LinkedHashMap<>();
        LinkedHashMap<String, String> details2 = new LinkedHashMap<>();
        FileInputStream fis1 = new FileInputStream(new File("/home/amantya/Downloads/Pre-Table-1.xlsx"));
        XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
        XSSFSheet sh1 = wb1.getSheet("Sheet1");
        XSSFRow row1;

        String name1, dep;
        for (int i = 2; i < sh1.getLastRowNum() + 1; i++) {
            row1 = sh1.getRow(i);
            name1 = row1.getCell(1).getStringCellValue();
            int cellNum = row1.getLastCellNum();

            for (int j = 2; j < cellNum; j++) {
                dep = row1.getCell(j).getStringCellValue();
                details1.put(name1, dep);
            }
        }

        FileInputStream fis = new FileInputStream(new File("/home/amantya/Downloads/Pre-Table-2.xlsx"));
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheet("Sheet1");
        XSSFRow row;

        String name, assigneddep;
        for (int p = 3; p < sh.getLastRowNum() + 1; p++) {
            row = sh.getRow(p);
            name = row.getCell(1).getStringCellValue();
            int cellNum = row.getLastCellNum();

            for (int q = 2; q < cellNum; q++) {
                assigneddep = row.getCell(q).getStringCellValue();
                details2.put(name, assigneddep);
            }
        }

        for (Map.Entry<String, String> entryy1 : details1.entrySet()){
            String key2 = entryy1.getKey();
            String var1 = entryy1.getValue();
            String var2 = details2.get(key2);
            Data data= new Data(var1,var2);
            finalmap.put(key2,data);

        }

        for (Map.Entry<String, Data> pick : finalmap.entrySet()) {
            Data val = pick.getValue();
            if (val.assigndeptname.equals("Team_HR")) {
                String keyhr = pick.getKey();
                Data dobjhr= new Data(val.deptname, val.assigndeptname);
                Thr.put(keyhr, dobjhr);
               // System.out.println(Thr);
            } else if (val.assigndeptname.equals("Team_IT")) {
                String keyit = pick.getKey();
                Data dobjit= new Data(val.deptname, val.assigndeptname);
                Tit.put(keyit, dobjit);
            } else if (val.assigndeptname.equals("Team_Fin")) {
                String keyfi = pick.getKey();
                Data dobjfi= new Data(val.deptname, val.assigndeptname);
                Tfi.put(keyfi, dobjfi);
            }else if (val.assigndeptname.equals("Team_Fac")) {
                String keyfc = pick.getKey();
                Data dobjfc= new Data(val.deptname, val.assigndeptname);
                Tfc.put(keyfc, dobjfc);
            }
        }
    }
    void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Welcome--------");
        System.out.println("Choose the below Operation  \n 1. Create an Ticket \n 2. Status of an Ticket \n 3. Quit");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                TicketCreation();
                break;
            case 2:
                showstatus();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid option");
                menu();
        }
    }
    public void TicketCreation() {
        System.out.println("Select the below team to create an ticket  \n 1. IT Team \n 2. HR Team \n 3. Finance Team \n 4. Facility Team \n 5. To go to main menu");
        Scanner sc = new Scanner(System.in);
        int SelectedOption = sc.nextInt();
        switch (SelectedOption) {
            case 1:
                ITTeam();
                break;
            case 2:
                HRTeam();
                break;
            case 3:
                FinanceTeam();
                break;
            case 4:
                FacilityTeam();
                break;
            case 5:
                menu();
                break;
            default:
                System.out.println("Invalid option");
                TicketCreation();
        } }
    LinkedHashMap<Integer, Store> map = new LinkedHashMap();
    public void FacilityTeam() {
        System.out.println("---------Welcome To Facility Team---------");
        System.out.println("Enter the employee details to raise an ticket");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id = ");
        String empid = sc.next();

        System.out.print("Enter Employee Name = ");
        String empname = sc.next();
        System.out.print("Enter issue details = ");
        String empissue = sc.next();
        Integer random = randomnumber();
        Object randomName = Tfc.keySet().toArray()[new Random().nextInt(Tfc.keySet().toArray().length)];
        System.out.println(randomName.toString()+"-"+Tfc.get(randomName));
        String ticketowner=randomName.toString();
        Data assignedTeam = Tfc.get(randomName);
        Store s1 = new Store(empid, empname, empissue, random, ticketowner, assignedTeam);

        map.put(random, s1);
        System.out.println(map);
        Random rrn = new Random();
        System.out.println("----------------------------");
        System.out.println("YOUR TICKET HAS BEEN CONFIRMED");
        System.out.println("----------------------------");
        System.out.println("Ticket Number = "+random);
        System.out.println("Assigned \n"+assignedTeam);
        System.out.println("The issue will be solved in "+rrn.nextInt(10)+" hours");

        System.out.println("Enter 1 to go Main menu");
        Integer exit = sc.nextInt();
        if (exit == 1) {
            menu();
        }
    }
    public void FinanceTeam() {
        System.out.println("---------Welcome To Finance Team---------");
        System.out.println("Enter the employee details to raise an ticket");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id = ");
        String empid = sc.next();
        System.out.print("Enter Employee Name = ");
        String empname = sc.next();
        System.out.print("Enter issue details = ");
        String empissue = sc.next();
        Integer random = randomnumber();
        Random rrn = new Random();

        Object randomName = Tfi.keySet().toArray()[new Random().nextInt(Tfi.keySet().toArray().length)];
        System.out.println(randomName.toString()+"-"+Tfi.get(randomName));
        String ticketowner=randomName.toString();
        Data assignedTeam = Tfi.get(randomName);
        Store s1 = new Store(empid, empname, empissue, random, ticketowner, assignedTeam);
        map.put(random, s1);
        System.out.println("----------------------------");
        System.out.println("YOUR TICKET HAS BEEN CONFIRMED");
        System.out.println("----------------------------");
        System.out.println("Ticket Number = "+random);
        System.out.println("Assigned \n"+assignedTeam);
        System.out.println("The issue will be solved in "+rrn.nextInt(10)+" hours");

        System.out.println("Enter 1 to go Main menu");

        Integer exit = sc.nextInt();
        if (exit == 1) {
            menu();
        }
    }
    private void HRTeam() {
        System.out.println("---------Welcome To HR Team---------");
        System.out.println("Enter the employee details to raise an ticket");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id = ");
        String empid = sc.next();
        System.out.print("Enter Employee Name = ");
        String empname = sc.next();
        System.out.print("Enter issue details = ");
        String empissue = sc.next();
        Integer random = randomnumber();

        Object randomName = Thr.keySet().toArray()[new Random().nextInt(Thr.keySet().toArray().length)];
        System.out.println(randomName.toString()+"-"+Thr.get(randomName));
        String ticketowner=randomName.toString();
        Data assignedTeam = Thr.get(randomName);
        Random rrn = new Random();
        Store s1 = new Store(empid, empname, empissue, random, ticketowner, assignedTeam);

        map.put(random, s1);
        System.out.println("----------------------------");
        System.out.println("YOUR TICKET HAS BEEN CONFIRMED");
        System.out.println("----------------------------");
        System.out.println("Ticket Number = "+random);
        System.out.println("Assigned \n"+assignedTeam);
        System.out.println("The issue will be solved in "+rrn.nextInt(10)+" hours");

        System.out.println("Enter 1 to go Main menu");
        Integer exit = sc.nextInt();
        if (exit == 1) {
            menu();
        }
    }
    public void ITTeam() {
        System.out.println("---------Welcome To IT Team---------");
        System.out.println("Enter the employee details to raise an ticket");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id =");
        String empid = sc.next();
        System.out.print("Enter Employee Name =");
        String empname = sc.next();
        System.out.print("Enter issue details =");
        String empissue = sc.next();

        Integer random = randomnumber();
        Object randomName = Tit.keySet().toArray()[new Random().nextInt(Tit.keySet().toArray().length)];
        //System.out.println(randomName.toString()+"-"+Tit.get(randomName));
        String ticketowner=randomName.toString();
        Data assignedTeam = Tit.get(randomName);

        Store s1 = new Store(empid, empname, empissue, random, ticketowner, assignedTeam);

        map.put(random, s1);
        Random rrn= new Random();
        System.out.println("----------------------------");
        System.out.println("YOUR TICKET HAS BEEN CONFIRMED");
        System.out.println("----------------------------");
        System.out.println("Ticket Number = "+random);
        System.out.println("Assigned \n"+assignedTeam);
        System.out.println("The issue will be solved in "+rrn.nextInt(10)+" hours");
        System.out.println("Enter 1 to go Main menu");
        Integer exit = sc.nextInt();
        if (exit == 1) {
            menu();
        }
    }
    public void showstatus() {
        System.out.println("Enter the Ticket number to see the status");
        Scanner sc1 = new Scanner(System.in);
        Integer ticketno = sc1.nextInt();
        Random rn= new Random();
        for (Map.Entry<Integer, Store> entry : map.entrySet()) {
            Store var = entry.getValue();
            if (var.ticketnumber.equals(ticketno)) {
                Integer key = entry.getKey();
                System.out.println("Ticket Owner = " + var.ticketowner + "\nTeam Working on it \n" + var.assignedteam + "\nEmployee Id = " + var.empid + "\nDescription = " + var.empissue + "\nSeverity = " + rn.nextInt(10));
                break;
            }
        }
        System.out.println("Enter 1 to go Main menu");
        Scanner sc = new Scanner(System.in);
        Integer exit = sc.nextInt();
        if (exit == 1) {
            menu();
        }}
    Integer randomnumber() {
        return new Random().nextInt(1000);
    }
}
        public class Main {
            public static void main(String[] args) {
                Operations obj1 = new Operations();
                obj1.start();
            }
        }