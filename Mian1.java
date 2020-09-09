import java.util.Scanner;

public class Mian1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
       
        String temp = getMaxLenStr(str);
        
        if(temp != null){
            int times = len - temp.length() + 1;
            System.out.println(times);
        }else{
            System.out.println(len);
        }
        
    }
  
    public static String getMaxLenStr(String str){
       String reg,left;
       for(int len=str.length()/2;len>0;len--){       
        for(int i=0;i<str.length()/len;i++){     
            reg=str.substring(0,len+1);
            left=str.substring(len+1);

            if(left.indexOf(reg)!=-1){
                 return reg;
            }
        }

       }
       return null;

    }
    
}
/**
6
abcdef

9
ababababc
 */

