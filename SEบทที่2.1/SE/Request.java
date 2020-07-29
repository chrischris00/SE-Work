import java.util.*;
public class Request{
  private ArrayList<Integer> req = new ArrayList<Integer>();
  private ArrayList<String> how = new ArrayList<String>();
  String endLine;
  public Request(String str){
    this.endLine=str;
  }
  public void receiv(int i,String str2){
    this.req.add(i);
    this.how.add(str2);
  }
  public void check(int j,String name){
    int i=this.req.size();
    while(i-1>=0){
      if(this.req.get(i-1).equals(j)){
        this.how.set(i-1,this.how.get(i-1)+" ...fixed by "+name);
        break;
      }
      else --i;
    }
  }
  public void list(){
    System.out.println("|RoomID(00)|ComID(000)|Report");
    for (int i=0;i< this.req.size();i++) {
      System.out.printf("|    %02d    |   %03d    |%s\n",MainLabCom.coms[this.req.get(i)-1].labID(),MainLabCom.coms[this.req.get(i)-1].getID(),this.how.get(i));
    }
  }
}
