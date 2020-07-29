public class Computer {
    private int comID;
    private int roomID;
    public Computer(int comID,int roomID){
      this.comID = comID;
      this.roomID = roomID;
    }
    public int getID(){
      return comID;
    }
    public int labID(){
      return roomID;
    }
}
