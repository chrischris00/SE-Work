import java.util.*;
public class MainLabCom {
  static String tchrName="Prof.Somchart";
  public static String name1="Mark";
  public static String name2="June";
  static Admin admin1;
  static Admin admin2;
  public static Computer[] coms;
  public static void main(String[] args) {
    LabCom[] labComs = new LabCom[10];
    coms = new Computer[313];
    int comNum=313;
    int com=0;
    int rooms=10;
    int i;
    for (i=0;i<rooms;i++) {
      labComs[i]=new LabCom(i+1);
      int j;
      for(j=0;j<comNum/rooms;j++) {
        coms[com]=new Computer(com+1,i+1);
        ++com;
      }
    }
    for (i=0;i<comNum%rooms ;i++ ) {
      coms[com]=new Computer(com+1,i+1);
      ++com;
    }
    /*for (i=0;i<comNum;i++ ) {
      System.out.printf("LabCom %02d%03d\n",coms[i].labID(),coms[i].getID());
    }*/
    admin1 =new Admin(name1);
    admin2 =new Admin(name2);
    Teacher teacher =new Teacher(tchrName);
    int x=0;
    Request request = new Request("...");
    Scanner scan = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    while(x>-1){
      System.out.println("\n==========================");
      System.out.println("       Menu");
      System.out.println("==========================");
      System.out.println("request fixing: 1");
      System.out.println("administrator report:  2");
      System.out.println("==========================");
      System.out.print("please enter: ");
      x=scan.nextInt();
      if(x==1){
          System.out.print("Computer number: ");
          int num=0;
          num=scan.nextInt();
          System.out.print("How: ");
          String how = sc.nextLine();
          request.receiv(coms[num-1].getID(),how);
          System.out.println("Complete!!!");
          //request.list();
      }
      else if(x==2){
          System.out.println("admin only!!!");
          System.out.print("Please,enter your name: ");
          String user=sc.nextLine();
          if(user.equals(name2) || user.equals(name1)){
            System.out.println("\nYour are admins");
            System.out.println("Reading report: 1");
            System.out.println("Fixed report: 2");
            System.out.print("choose order: ");
            int k=scan.nextInt();
            if(k==1){
              request.list();
            }
            else if(k==2){
              System.out.print("What computer number had fixed: ");
              k=scan.nextInt();
              request.check(k,user);
              System.out.println("Report Complete!!!");
            }
          }
          else{
            System.out.println("Your aren't admins.");
          }
      }
    }
  }
  public static void showAdmins(){
    System.out.printf("Admins: %s , %s\n",admin1.uName(),admin2.uName());
  }

}
