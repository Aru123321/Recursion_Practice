public class allstar {
    public static String allstar(String str){
        if(str.length()<2){
            return str;
        }
        
            return str.charAt(0)+"*"+allstar(str.substring(1));
        

    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(allstar(str));
        
    }
}
