public class shape {
    void area(float l, float b){
        System.out.println("\nAREA OF RECTANGLE = "+l*b);
    }

    void area(int ar){
        System.out.println("AREA OF RECTANGLE = "+3.14*ar*ar+"\n");
    }
    public static void main(String a[]) {
        shape s = new shape();
        s.area(11, 26);
        s.area(11);
    }
}
