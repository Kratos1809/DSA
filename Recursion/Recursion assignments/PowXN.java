public class PowXN {
    public static void main(String[] args){
       double ans = pow(2.00000 , -2);
       System.out.println(ans);
    }

    static double pow(double x, int n){
        if(n < 0){
            return 1/pow(x, -n);
        }

        if(n == 0){
            return 1;
        }

        double ans = pow(x, n/2);
        ans *=ans;

        if(n%2 != 0){
            ans = ans * x;
        }
        return ans;
    }
}
