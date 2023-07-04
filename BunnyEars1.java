public class BunnyEars1 {
    public static int BE(int n){
            if(n==0){
                return 0;
            }
            int fnm1 = BE(n-1);
            int fn = 2+BE(n-1);
            return fn;
        
    }
    public static void main(String[] args) {
        int n = 50;
        System.out.println(BE(n));
    }
}
