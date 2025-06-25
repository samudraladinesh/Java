class Vehicle{
void Move(){
System.out.println("Vehicle moves");
}
void Break(){
System.out.println("Vehicle breaak");
}
}
class Bike extends Vehicle{
void Move(){
System.out.println("Bike moves");
}
void Break(){
System.out.println("Vehicle break");
}
}
class Car extends Bike{
void Move(){
System.out.println("car moves");
}
void Break(){
System.out.println("Vehicle breaks");
}
}
class Jeep extends Car{
void Move(){
System.out.println("Jeep moves");
}
void Break(){
System.out.println("Vehicle braks");
}
}
class Ece{
public static void main(String[] args)
{
Vehicle v=new  Vehicle();
v.Move();
v.Break();
Bike b= new Bike();
b.Move();
b.Break();
Car c= new Car();
c.Move();
c.Break();
Jeep j=new Jeep();
j.Move();
j.Break();
}
}

OUTPUT:
Vehicle moves
Vehicle breaak
Bike moves
Vehicle break
car moves
Vehicle breaks
Jeep moves
Vehicle braks
