


// Use recursion to add all of the numbers up to 10.


// public class Recursion {
   
//     public static int sum(int x){
//         if(x>0){
//             return  x + sum(x-1);
//         }else{
//             return  0;
//         }
//     }
//       public static void main(String[] args){
//         int result = sum(10);
//         System.out.println(result);
//     }
   
// }




public class Recursion {
   
    public static int sum(int start,int end){
        if(end>start){
            return  end + sum(start,end-1);
        }else{
            return  0;
        }
    }
      public static void main(String[] args){
        int result = sum(5,10);
        System.out.println(result);
    }
   
}