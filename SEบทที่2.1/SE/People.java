abstract class People {
  String name;
  public People(String name){
    this.name = name;
  }
  public void showName(){
    System.out.printf("%s\n",name);
  }
  public String uName(){
    return name;
  }
}
