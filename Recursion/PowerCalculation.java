public class PowerCalculation {
    // Given Method Power(a,n) ---> Calculatr and return a^n
    public static void main(String[] args) {
        PowerCalculation p =new PowerCalculation();
        int ans=p.power(2,10);
        System.out.println(ans);
    }

    // int power(int a, int n){

    //     if(n==0){
    //         return 1;
    //     }
    //     if(n==1){
    //         return a;
    //     }
    //     return a*power(a, n-1);
    // }

    // Approach ----------------2-----------------?
    // a^10 = a^5 * a^5
    // a^13 = a^6 * a^6 * a

    int power(int a, int n){
        if(n==0){
            return 1;
        }
        int he=power(a, n/2);
        int ha=he*he;
        if(n%2==0){
            return ha;
        }
        else{
            return ha*a;
        }
    }
}
