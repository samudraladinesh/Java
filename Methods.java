//Without parameter without return
class Methods
{
public void add(){
System.out.println(20+20);
}
static public void main(String[] args)
{
Methods m=new Methods();
m.add();
}
}

OUTPUT:
40

/*
//Without parameter with return
class Methods
{
    public int sub() {
        return 20 - 10;
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        int result = m.sub();
        System.out.println(result);
    }
}*/

OUTPUT:
10

//With parameter without return
class Methods
{
    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        m.multiply(5, 4);  // Example: multiplying 5 and 4
    }
}


OUTPUT:
20

