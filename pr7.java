class rectangle {
    int height;
    int width;

    public rectangle(int h, int w) {
        height = h;
        width = w;
    }

    public void dis() {
        System.out.println("height : " + height);
        System.out.println("width : " + width);
    }
}

public class pr7 {
    public static void main(String args[]) {
        rectangle r = new rectangle(100, 200);
        r.dis();
    }
}