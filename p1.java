import java.io.IOException;
import java.util.*;
class p1{
    static Double findAngle(Integer hr,Integer min){
        Double d1,d2,d3,mins;
        mins=Double.valueOf(min);
        d1=mins*6;
        d2=Double.valueOf(hr)*30;
        d2=d2+(mins/2);
        d3=Math.abs(d1-d2);
        if(d3==360){
            d3=0.0;
        }
        return d3;
    }
    public static void main(String[] args)throws IOException{
        Scanner sc= new Scanner(System.in);
        Integer hr= sc.nextInt();
        Integer min= sc.nextInt();
        System.out.println(findAngle(hr,min));
        sc.close();
    }
}