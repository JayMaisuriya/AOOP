class pr12{
    private int x;
    private int y;

    public pr12(){
        x=0;
        y=0;
    }
    public pr12(int x){
        this.x=x;
        y=0;
    }
    public pr12(int x, int y){
        this.x=x;
        this.y=y;
    }
        
    public static void main(String args[]) {
        pr12 ex1 = new pr12();
        System.out.println("\nX = "+ex1.x+", Y = "+ex1.y);
        pr12 ex2 = new pr12(5);
        System.out.println("X = "+ex2.x+", Y = "+ex2.y);
        pr12 ex3 = new pr12(2,3);
        System.out.println("X = "+ex3.x+", Y = "+ex3.y+"\n");
    }
}