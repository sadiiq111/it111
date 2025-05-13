public class MyForLoop {
    public static void main(String[] args) {
//int count;
//for(count =0; count <= 30; count = count+3){
//    System.out.println(count);
//}
//        System.out.println("All Done");

// int newCount;
//
// for(newCount = 40; newCount > 0; newCount = newCount-1){
//
//     System.out.println(newCount);
// }
//        System.out.println("Blast off!!");

        int newCount;

        for (newCount = 25; newCount > 0; newCount = newCount -1){
            if(newCount <=5) {
                System.out.println(" we are almost at blast off only " +newCount+ " seconds away");
            }else{
                System.out.println(newCount);
            }
        }
    }
}
