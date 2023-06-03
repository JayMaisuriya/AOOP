class myexception extends Exception{
    public String toString(){
        return "\nAttempt To Divide By Zero\n";
    }
}

public class pr23 {
    public static void main(String args[]){
        try{
            throw new myexception();
        }
        catch(myexception e){
            System.out.println(e);
        }
    }
    
}   
