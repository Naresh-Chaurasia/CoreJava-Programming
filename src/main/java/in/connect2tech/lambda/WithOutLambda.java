package in.connect2tech.lambda;

interface Interace1{
    public void m1();
}

class Demo implements Interace1{
    public void m1(){
        System.out.println("Welcome to Demo!!!");
    }
}

public class WithOutLambda {
    public static void main(String[] args) {
        Interace1 i1 = new Demo();
        i1.m1();
    }
}
