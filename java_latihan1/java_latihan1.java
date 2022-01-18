/**
 * java-latihan1
 */
public class java_latihan1 {
    public static void main(String[] args) {
        String first = "Muhammad";
        String last = " Nur Ilmi";
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "halo";
        arrayString[1] =  " nama saya";
        arrayString[2] = " Muhammad Nur Ilmi";
        


        System.out.println(first);
        System.out.println(last);
        System.out.println(first+last);  

        sayHelloWorld(arrayString);
        System.out.println(sum(1,2));
        hello();
        hello("ilmi");
        hello("Muhammad", "Nur Ilmi");
        System.out.println(faktorial(10));
    }

    public static void sayHelloWorld(String[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static int sum(int a,int b) {
        return a+b;
        
    }


    public static void hello() {
        System.out.println("Hallo World");   
    }
    
    public static void hello(String nama) {
        System.out.println("Hallo World"+ nama);   
    }
    
    public static void hello(String first, String last) {
        System.out.println("Hallo World"+first+" "+last);   
    }

    public static int faktorial(int value) {
        var i = value;
        if(i!=1){
            return faktorial(i-1)*i;
        }
        else{
            return 1;
        }
    }

}
