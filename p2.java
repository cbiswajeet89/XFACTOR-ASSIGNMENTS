import java.io.IOException;
import java.util.*;
public class p2 {
    private static Integer divide(Integer num,Integer den){
        Integer i=0;
        if(num<den){
            i=0;
        }
        else if(num==den){
            i=1;
        }
        else{
            while(num>0){
                ++i;
                num-=den;
            }
            if(num!=0){
                --i;
            }
        }
        return i;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Integer num=sc.nextInt();
        Integer den=sc.nextInt();
        System.out.println(divide(num,den));
        sc.close();
    }
    
}
