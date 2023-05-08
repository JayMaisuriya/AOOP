public class pr11 {
    void area(float w, float h){
        System.out.println("\nAREA OF RECTANGLE = "+w*h);
    }

    void area(Double r){
        System.out.println("AREA OF CIRCLE    = "+3.14*r*r);
    }

    void area(int l){
        System.out.println("AREA OF SQUARE    = "+l*l+"\n");
    }
    public static void main(String a[]) {
        pr11 s = new pr11();
        s.area(11, 26);
        s.area(11.0);
        s.area(6);
    }
}
