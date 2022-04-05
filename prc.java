import java.util.Scanner;
public class prc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of databit");
         int  n=sc.nextInt();
         System.out.println("enter the number of generator");
         int  m=sc.nextInt();
         System.out.println("enter the  databit");
         int[] d =new int[m+n];
         for(int i=0;i<n;i++)
         d[i]=sc.nextInt();
         for(int i=0;i<m-1;i++)
         d[n+i]=0;
         System.out.println("enter the generator bit");
         int []g=new int[m];
         for(int i=0;i<n;i++)
             g[i]=sc.nextInt();

             int []r=new int[n+m];
             int []z=new int[m];
             for(int i=0;i<m;i++){
             r[i]=d[i];
             z[i]=0;
             }
             for(int i=0;i<n;i++){
               int k=0;
               int msb=r[i];
               for(int j=0;j<m-1;j++){
                   r[j]= msb==0? xor(r[j],z[k]):xor(r[j],g[k]);
                   k++;
               }
                
                r[m+i]=d[m+i];

                }
                System.out.println("The code bit added/n");
                for(int i=n;i<m+n-1;i++){
                    d[i] = r[i];
                    System.out.print(d[i]);
                }
                System.out.println("The Code Data is:");
                for(int i=0;i<m+n-1;i++)System.out.print(d[i]);  
                sc.close();        
            }
            public static int xor(int x,int y){
                return x==y?0:1;
            }


    }

