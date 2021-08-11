package in.connect2tech.java8.durga;

interface IMethodReferenceExample{
    public void methodRef1();
}

interface IMethodReferenceExample_Instance{
    public void methodRef1_Instance();
}

public class MethodReferenceExample {



    public static void methodRef2(){
        System.out.print("methodRef2");
    }

    public void methodRef2_Instance(){
        System.out.print("methodRef2_Instance");
    }

    public static void main(String[] args) {
        //IMethodReferenceExample iMethodReferenceExample = MethodReferenceExample::methodRef2;
        //iMethodReferenceExample.methodRef1();

        MethodReferenceExample methodReferenceExampleObject = new MethodReferenceExample();
        IMethodReferenceExample_Instance iMethodReferenceExample_instance = methodReferenceExampleObject::methodRef2_Instance;
        iMethodReferenceExample_instance.methodRef1_Instance();
    }

}
