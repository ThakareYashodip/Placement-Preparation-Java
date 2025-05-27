public class PairCubeCount {
    public static int pairCount(int target){
        int cnt = 0 ;
        for(int a = 1 ; a <= Math.cbrt(target); a++){
            for(int b = 0 ; b <= Math.cbrt(target) ; b++){
                if((a*a*a)+(b*b*b) == target){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(pairCount(9));
    }
}