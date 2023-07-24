package swapping;

public class Without_Using_ThirdValue {
  public static void main(String[]args){
      int r=30;
      int s=40;
      System.out.println("before swapping r:"+r+"and s:"+s);

              r=r+s;// 30+40=70
              s=r-s;//70-40=30
              r=r-s;//70-30=40
      System.out.println("after swapping");
      System.out.println("r:"+r);
      System.out.println("s:"+s);


  }

}
