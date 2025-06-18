//Arithmetic - +, -, *, /(Q), %(Remainder)

class Arith
{
public static void main(String[] args)
{
int a = 10,b = 15;
System.out.println("a+b="+(a+b));
System.out.println("a-b="+(a-b));
System.out.println("a*b="+(a*b));
System.out.println("a/b="+(a/b));
System.out.println("a%b="+(a%b));
}
}

OUTPUT:
a+b=25
a-b=-5
a*b=150
a/b=0
a%b=10

//Assignment - =, +=, -=, *=, /=, %=, &=.

class Assign
{
public static void main(String[] args)
{
int x;
System.out.println(x = 5);
System.out.println(x += 5);
System.out.println(x -= 5);
System.out.println(x /= 5);
System.out.println(x %= 5);
System.out.println(x &= 5);
}
}

OUTPUT:
5
10
5
1
1
1

//Comparison - ==, !=, >, <, >=, <=

class Comp
{
public static void main(String[] args)
{
int x = 5, y = 10;
System.out.println(x == y);
System.out.println(x != y);
System.out.println(x > y);
System.out.println(x >= y);
System.out.println(x < y);
System.out.println(x <= y);
}
}

OUTPUT:
false
true
false
false
true
true

//Logical - &&, ||, !

class Logic
{
public static void main(String[] args)
{
int x = 10;
System.out.println(x < 5 && x > 5);
System.out.println(x < 5 || x > 5);
System.out.println (!(x < 5 && x > 5));
}
}

OUTPUT:
false
true
true
