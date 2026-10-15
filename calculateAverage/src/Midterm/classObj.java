
package Midterm;
import java.util.Scanner;
public class classObj {
    private int x;
    
    public int getNum(){
        return x;
    }
    
    public void setNum(int num){
        this.x = num;
    }
    
    public static void main(String[] args){
        classObj object = new classObj();
        object.setNum(50);
        
        System.out.println("The Number is: " + object.x);
    }
}


