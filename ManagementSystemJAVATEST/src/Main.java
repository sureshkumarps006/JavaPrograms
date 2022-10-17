import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;



class Store{

    String empid;
    String empname;
    Integer ticketnumber;
    String empissue,assignedteam;

    Store(String id,String name,String issue,Integer number,String assigned){
        this.empid=id;
        this.empname=name;
        this.empissue=issue;
        this.ticketnumber=number;
        this.assignedteam=assigned;


    }

    @Override
    public String toString() {
        return "\n Ticket has been Confirmed" +
                "\n TicketOwner ='" + empname + '\'' +
                ", \n Ticket Number =" + ticketnumber +
                ", \n Issue Description ='" + empissue + '\'' +
                ", \n Assigned Team='" + assignedteam + '\'' ;
    }


}





class Operations extends Thread{

    @Override
    public void run() {
       menu();

    }

    void menu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the below number to select the Operation  \n 1. Create an Ticket \n 2. Status of an Ticket \n 3. Quit");
        int option=sc.nextInt();



        switch (option){
            case 1 : TicketCreation();
                break;
            case 2 : showstatus();
                break;
            case 3 : break;

            default:
                System.out.println("Invalid option");
                menu();




        }
    }



    public void TicketCreation(){

        System.out.println("To Create the ticket enter the number  \n 1. IT Team \n 2. HR Team \n 3. Finance Team \n 4. Facility Team \n 5. To go to main menu");
        Scanner sc=new Scanner(System.in);
        int SelectedOption=sc.nextInt();
        switch (SelectedOption){
            case 1 : ITTeam();
                break;
            case 2 : HRTeam();
                break;
            case 3 : FinanceTeam();
            break;
            case 4: FacilityTeam();
            break;
            case 5 : menu();
                    break;


            default: System.out.println("Invalid option");
                TicketCreation();


        }

    }

    LinkedHashMap<Integer,Store> map= new LinkedHashMap();

    public void FacilityTeam() {
        System.out.println("Enter the employee details to raise an ticket");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Id = ");
        String empid = sc.next();

        System.out.print("Enter Employee Name = ");
        String empname = sc.next();

        System.out.print("Enter issue details = ");
        String empissue = sc.next();

        Integer random = randomnumber();
        String assignedTeam = "IT Team";


        Store s1= new Store(empid,empname,empissue,random,assignedTeam);

        //LinkedHashMap<Integer,Store> map= new LinkedHashMap();

        map.put(random,s1);
        //System.out.println(random);

        System.out.println(map);

        // s1.display();




        System.out.println("Enter 1 to go Main menu");

        Integer exit =sc.nextInt();
        if (exit == 1 ){
            menu();

        }


    }

    public void FinanceTeam() {

        System.out.println("Enter the employee details to raise an ticket");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Id = ");
        String empid = sc.next();

        System.out.print("Enter Employee Name = ");
        String empname = sc.next();

        System.out.print("Enter issue details = ");
        String empissue = sc.next();

        Integer random = randomnumber();
        String assignedTeam = "Facility Team";


        Store s1= new Store(empid,empname,empissue,random,assignedTeam);

        //LinkedHashMap<Integer,Store> map= new LinkedHashMap();

        map.put(random,s1);
       // System.out.println(random);

        System.out.println(map);

        // s1.display();




        System.out.println("Enter 1 to go Main menu");

        Integer exit =sc.nextInt();
        if (exit == 1 ){
            menu();

        }



    }

    private void HRTeam() {

        System.out.println("Enter the employee details to raise an ticket");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Id = ");
        String empid = sc.next();

        System.out.print("Enter Employee Name = ");
        String empname = sc.next();

        System.out.print("Enter issue details = ");
        String empissue = sc.next();

        Integer random = randomnumber();
        String assignedTeam = "Finance Team";


        Store s1= new Store(empid,empname,empissue,random,assignedTeam);

        //LinkedHashMap<Integer,Store> map= new LinkedHashMap();

        map.put(random,s1);
       // System.out.println(random);

        System.out.println(map);

        // s1.display();




        System.out.println("Enter 1 to go Main menu");

        Integer exit =sc.nextInt();
        if (exit == 1 ){
            menu();

        }


    }


    public void ITTeam() {


            System.out.println("Enter the employee details to raise an ticket");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Id =");
        String empid = sc.next();

        System.out.print("Enter Employee Name =");
        String empname = sc.next();

        System.out.print("Enter issue details =");
        String empissue = sc.next();

        Integer random = randomnumber();
        String assignedTeam = "HR Team";


        Store s1= new Store(empid,empname,empissue,random,assignedTeam);

        //LinkedHashMap<Integer,Store> map= new LinkedHashMap();

        map.put(random,s1);
     //   System.out.println(random);

        System.out.println(map);

       // s1.display();




        System.out.println("Enter 1 to go Main menu");

        Integer exit =sc.nextInt();
        if (exit == 1 ){
            menu();

        }

    }




    public void showstatus() {

        System.out.println("Enter the Ticket number to see the status");
        Scanner sc1 = new Scanner(System.in);
        Integer ticketno = sc1.nextInt();


        for (Map.Entry<Integer, Store> entry : map.entrySet()) {
            Store var = entry.getValue();

            if (var.ticketnumber.equals(ticketno)) {

                Integer key = entry.getKey();
                System.out.println(" Ticket Owner = "+var.empname+"\n Team Working on it = "+var.assignedteam+"\n Employee Id = "+var.empid+"\n Description = "+var.assignedteam);

                break;
//-1821291523

            }

        }
        System.out.println("Enter 1 to go Main menu");
        Scanner sc = new Scanner(System.in);

        Integer exit =sc.nextInt();
        if (exit == 1){
            menu();

        }

    }



    Integer randomnumber() {
        return new Random().nextInt();
    }

}



public class Main {
    public static void main(String[] args) {

        Operations obj1 = new Operations();

        obj1.start();


    }
}