class pr8{
    int b;

    pr8(int b) {
        this.b = b;
    }

    void show() {
        System.out.println(b);
    }

    public static void main(String args[]) {
        pr8 r = new pr8(100);
        r.show();
    }
}