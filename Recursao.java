public class Recursao {

    public static int i(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Inexistente.");
        }
        else if(n == 0 || n == 1) {
            return n;
        }
        else {
            return  n * i(n-1);
        }
    }
    //====================================

    public static long ii(long n) {
        long res = 0;

        if (n == 0) {
            res = 0;
        }
        else if (n> 0) {
            res = n + ii(n-1);
        }
        else {
            res = n + ii(n+1);
        }
        return res;
    }
    //====================================
    
    public static int iii(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("Inexistente.");
        }
        if(n == 1 || n == 2) { 
            return n;
        }
        return iii(n-1) + iii(n-2);
    }

    //====================================

    public static int iv(int k, int j) {
         if(k == j) {
            return k;
        }
        else if(k > j) {
            return (k-1) + j;
        }
        else if(j > k){
            return k + (j-1);
        }
        else {
            return k + iv(k+1, j);
        }   
    }

    //====================================

    public static String v(String palavra) throws Exception {
        StringBuilder tam =  new StringBuilder(palavra.length());

        if(palavra.length() == 1) {
            throw new Exception("1 letra apenas.");
        }

        for(int i=palavra.length()-1; i>=0; i--) {
            tam.append(palavra.charAt(i));
            }
            return tam.toString();
    }

    //====================================

    public static String vi(int n) {
        if(n < 0 || n == 0) {
            return "";
        }
        else if(n % 2 == 0) {
            return vi(n/2) + "0";
        }
        else {
            return vi(n/2) + "1";
        }   
    }






    public static void main (String[] agrs) throws Exception {
        System.out.println("i " + i(5));
        System.out.println("ii " + ii(5));
        System.out.println("iii " + iii(5));
        System.out.println("iv " + iv(5,3));
        System.out.println("v " + v("suahg"));
        System.out.println("vi " + vi(2));
    
    }
}