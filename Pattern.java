/*class Pattern
{
public static void main(String [] args)
{
for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
 System.out.print("* ");
}
System.out.println();
}
}
}*/

/* class Pattern
{
public static void main(String [] args)
{
  for(int i=1;i<6;i++)
{
for(int j=0;j<5;j++)
{
 System.out.print(i+" ");
}
System.out.println();
}
}
} 
*/

/*class Pattern
{
public static void main(String [] args)
{
  for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
 System.out.print(j+" ");
}
System.out.println();
}
}
}*/

	
/*class Pattern{
public static void main(String[] args){
int n=1;
for(int  i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(n++ + " ");
}
System.out.println();
}
}
}*/

/*class Pattern{
public static void main(String []args){
int n=1;
for(int i=1;i<=5;i++){
for(int j=0;j<5;j++)
{
System.out.print(n + " ");
n=n+2;
}
System.out.println();
}
}
}*/

/*class Pattern{
public static void main(String []args){
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
System.out.print((j%2==0)?"1":"0");
}
System.out.println();
}
}
}*/

/*class Pattern{
public static void main(String[]args){
for(int i=1;i<=5;i++){
for(int j=1;j<=5-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print("*" +" ");
}
System.out.println();
}
}
}*/

/*class Pattern{
public static void main(String[]args){
for(int i=1;i<=5;i++){
for(int j=1;j<=5-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print((2*k) + " ");
}
System.out.println();
}
}
}*/

/*class Pattern
public static void main(String[]args){
int n=1;
for(int i=1;i<=5;i++)
{
System.out.println();
for(int j=1;j<=5;j++)
{
System.out.print(n +" ");
n++;
if(n==10)
{
n=1;
}
}
System.out.println();
}
}
}*/


/*class Pattern{
public static void main(String[]args){
String str="INDIA";
for(int i=1;i<=str.length();i++){
System.out.println(str.substring(0,i));
}
}
}*/


/*class Pattern{
public static void main(String[] args) {
int n = 5;
for (int i = 1; i <= n; i++) {
for (int j = i; j < n; j++)
System.out.print(" ");
for (int k = 1; k <= (2 * i - 1); k++)
System.out.print("*");
System.out.println();
}
}
}*/

/*class Pattern 
{
public static void main(String[] args) 
{
int n = 4;
for (int i = 1; i <= n; i++) 
{
for (int j = i; j < n; j++) 
{
System.out.print("  ");
}
for (int j = 1; j <= (2 * i - 1); j++) {
System.out.print("* ");
}
System.out.println();
}
for (int i = n - 1; i >= 1; i--) {
for (int j = n; j > i; j--) {
System.out.print("  ");
}
for (int j = 1; j <= (2 * i - 1); j++) {
System.out.print("* ");
}
System.out.println();
}
}
}*/


/*class Pattern {
    public static void main(String[] args) {
        int n = 4;
for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            System.out.print("*");
           if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
             System.out.print("*");
            if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
