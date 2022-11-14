
package rectangle.area;


public class RectangleArea {
    int Rectanglelength,Rectanglewidth;
    static int rectanglarea;
    
    public static void main(String[]args)
    {
        Rectanglel =new Rectangle();//call non-static variable
        Rectanglel.getInput();//call non-static variable
        rectangle1.setArea();
        Rectangle1.outputArea();  
    }
  public void getInput();// definning non static method.
  //start the body
  {
    scanner  sc= new Scanner(System.in);
    System.out.println("Please enter the length of rectangle");
    Rectanglelength=sc.nextInt();
    System.out.println("enter the width of rectangle");
    Rectanglewidth=sc.nextInt();
}
 //end the body 
  public int SetArea()//define non-static method
  {
   rectanglearea=Rectanglewidth*Rectanglelength;// accessing non-static variables   
      retun rectanglearea;//returning value of non static
      
  }
  public static void outputArea()//define non-static method
  {
     System.out.println("Enter the area of rectangle is"+area);//access non-stati
     //variables
  }
}