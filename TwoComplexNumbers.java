public class TwoComplexNumbers{
  // bus and car is complex numbers
double bus,car;
  
  //Constructor to initialize the complex numbers
TwoComplexNumbers(double b,double c){
this.bus= b;
this.car= c;
}
public static TwoComplexNumbers sum(TwoComplexNumbers c1, TwoComplexNumbers c2){
  
//creating temporary complex to hold the sumof two numbers
TwoComplexNumbers tcn = new TwoComplexNumbers(0,0);
tcn.bus = c1.bus + c2.bus;
tcn.car = c1.car + c2.car;
  //returing the complex output
return tcn;
}
public static void main(String[] args){
TwoComplexNumbers c1 = new TwoComplexNumbers(2.2, 3);
TwoComplexNumbers c2 = new TwoComplexNumbers(2.2, 6.1);
TwoComplexNumbers tcn = sum(c1,c2);
System.out.println("Sum is: "+ tcn.bus+" + "+ tcn.car);
}
}

