//for loop

import java.util.Scanner;
class Loops{
public static void main(String[] args){
int i;
Scanner s=new Scanner(System.in);

for(i=0;i<10;i++){
System.out.println("Hello");
}
}
}

OUTPUT:
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello


//While
i=1;
while(i<=20){
System.out.println(i);
i++;
}

OUTPUT:
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20

//if-else if:
System.out.println("enter a:");
int a=s.nextInt();
System.out.println("enter b:");
int b=s.nextInt();
if(a==b){
System.out.println("Both are equal");
}
else if(a!=b){
System.out.println("Both are not equal");
}

OUTPUT:
enter a:
5
enter b:
10
Both are not equal

//if-else:
System.out.println("enter n:");
int n=s.nextInt();
if(n%2==0){
System.out.println(n+"  is Even");
}
else{
System.out.println(n+" is Odd");
}

OUTPUT:
enter n:
5
5 is Odd


//Bigest number:
System.out.println("Enter a:");
int a=s.nextInt();
System.out.println("Enter b:");
int b=s.nextInt();
System.out.println("Enter c:");
int c=s.nextInt();
if((a>b)&&(a>c)){
System.out.println("a is large");
}
else if(b>c){
System.out.println("b is large");
}
else{
System.out.println("c is large");
}

OUTPUT:
Enter a:
5
Enter b:
10
Enter c:
15
c is large

//Print even from 10 - 100
i=10;
while(i<=100){
if (i%2==0){
System.out.println(i);
}
i++;
}

OUTPUT:
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100

//do-while:
i=1;
do{
System.out.println(i);
i++;
}while(i<=10);
OUTPUT:
1
2
3
4
5
6
7
8
9
10

//armstrong number
int sum=0,rem;
System.out.println("enter n:");
int n=s.nextInt();
int A = n;
while(n>0){
rem = n % 10;
sum+=Math.pow(rem,3);
n/=10;
}
if(A==sum){
System.out.println("Given number is Armstrong number");
}
else{
System.out.println("Given number is not  Armstrong number");
}


OUTPUT:
enter n:
5
Given number is not  Armstrong number

//Palindrome number
int rem=0,rev=0;
System.out.println("enter n:");
int n=s.nextInt();
int p=n;
while(n>0){
rem = n % 10;
rev = rev*10+rem;
n=n/10;
}
if(p==rev){
System.out.println("Given number palindrome number ");
 }
else{
System.out.println("Given number not palindrome number ");
 }
System.out.println(rev);

OUTPUT:
enter n:
10
Given number not palindrome number
1


//switch case:
System.out.println("enter n:");
int n=s.nextInt();
int temp= n%2;
switch(temp){
case 0: System.out.println(n+" is even");
break;
case 1: System.out.println(n+" is odd");
break;
}	

OUTPUT:
enter n:
10
10 is even

//switch using strings:
System.out.println("enter g:");
String g=s.next();
switch(g){
case "M":
System.out.println("Male");
break;
case "m":
System.out.println("Male");
break;
case "F":
System.out.println("Female");
break;
case "f":
System.out.println("FeMale");
break;
default:
System.out.println("Invalid");
}


OUTPUT:
enter g:
m
Male


int a=10,b=20,c=30;
if(a>b){
if(a>c){
System.out.println(a+" is large");
}}
else if(b>c){
System.out.println(b+" is large");
}
else{
System.out.println(c+" is large");
}
}
}

OUTPUT:
30 is large

