/*
//1. different ways Create a string 
// a. using string literal
public class StringPrbml 
{
public static void main(String[] args) 
{
String name = "Dinesh";
System.out.println("Name: " + name);
}
}*/

OUTPUT:
Name: Dinesh

/*
//b. using new Keyword
public class StringPrbml 
{
public static void main(String[] args) 
{
String name = new String("Dinesh");  
System.out.println("Name: " + name);
}
}*/

OUTPUT:
Name: Dinesh

//
public class StringPrbml 
{
public static void main(String[] args) 
{
String firstName = "Dinesh";
String lastName = "Samudrala";
String fullName = firstName + " " + lastName;
System.out.println("Full Name: " + fullName);
}
}

OUTPUT:
Full Name: Dinesh Samudrala

//Finding lenght of the string
public class StringPrbml 
{
public static void main(String[] args) 
{
String name = "Dinesh Samudrala";
int length = name.length();  
System.out.println("The length of the string is: " + length);
}
}

OUTPUT:
The length of the string is: 16


//Extract a string using substring
public class StringPrbml 
{
public static void main(String[] args) 
{
String message = "Hello, World!";
String sub = message.substring(7); 
System.out.println("Substring: " + sub);
}
}

OUTPUT:
Substring: World!
