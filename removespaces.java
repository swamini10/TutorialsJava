// public class removespaces {
//     public static void main(String args[]){
//         String str = "  He  llo World   !  ";
//         String result = str.replaceAll("\\s+", "");
//         System.out.println(result);
//     }
    
// }
//other way to remove spaces
public class removespaces {
    public static void main(String args[]){
     String str = "  swaminin He  llo World   !  ";
        String result = str.replace(" ", "");
        System.out.println(result);
    }
}