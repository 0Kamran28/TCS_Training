package Nov_11;

public class Number {
    public synchronized void printNums(int n){
        for(int i=0; i<n;i++){
            System.out.println(i);
        }
    }
}