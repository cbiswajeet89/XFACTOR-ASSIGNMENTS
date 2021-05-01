import java.io.*;
class p3
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      double tax=0,income;
      System.out.println("Enter income ");
      income=Double.parseDouble(br.readLine());
      if(income<=200000)
         tax=0;
      else if(income<=300000)
         tax=0.1*(income-200000);
      else if(income<=500000)
         tax=(0.2*(income-300000))+(0.1*100000);
      else if(income<=1000000)
         tax=(0.3*(income-500000))+(0.2*200000)+(0.1*100000);
      else
         tax=(0.4*(income-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
      System.out.println("Income tax amount is "+tax);
   }
}