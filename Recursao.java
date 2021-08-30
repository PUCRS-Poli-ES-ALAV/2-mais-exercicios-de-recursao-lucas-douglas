import java.util.ArrayList;

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

    //====================================

    public static Integer vii(ArrayList<Integer> n) {
 
        if(n.size() == 0) {
            return -1;
        }
        else {
            return n.remove(0) + vii(n);
        }      
    }
    //====================================

    public static int viii(ArrayList<Integer> n1, int max) {

        int tmp = n1.remove(0);
        if(n1.size() == 0) {
            return -1;
        }
         else if(n1.size() == 1) {
            System.out.println(n1);
            return 1;
        }
        
        /*for(int i=0; i<n1.size(); i++) {
            if(n1.get(i) < n1.get(i+1)) {
                return n1.remove(i) + viii(n1, max);  
            }*/
        if(tmp > max) {
            max = tmp;
            return viii(n1, max);
        }
        return viii(n1, max);  
        }
    
        
    //====================================

    public static boolean ix(String str, String match) {

        if(str == null || match == null) {
            throw new IllegalArgumentException("Vazio.");
        }

        if (str.contains(match)) {
            return true;
        }
        return false;
    }

    //====================================

    public static int x(long n) {

        n = Math.abs(n);
		if (n == 0) { 
            return 1;
        }
		else {
            return (int) (Math.log10 (n) + 1); 
        }
    }
    

    public static ArrayList<String> xi(String n1) {
        
        int tam = n1.length();
        if(n1 == "") {
            return null;
        }
        else if(n1.length() == 0) {
            throw new IllegalArgumentException("Inexistente.");
        }
        else {
            for(int i=0; i<n1.length(); i++) {
                return xi(n1.charAt(i), n1.substring(0, i) + n1.substring(i+1, tam));
            }
        }
    }

    //====================================

    public static void main (String[] agrs) throws Exception {
        System.out.println("i " + i(5));
        System.out.println("ii " + ii(5));
        System.out.println("iii " + iii(5));
        System.out.println("iv " + iv(5,3));
        System.out.println("v " + v("suahg"));
        System.out.println("vi " + vi(2));
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(50); n.add(15); n.add(22);
        System.out.println("vii " + vii(n));
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        n1.add(10); n1.add(32); n1.add(30); int max = 44;
        System.out.println("viii " + viii(n1, max));
        System.out.println("ix " + ix("olaolaolasuyasghaau", "olaolaolasuyasghaau"));
        System.out.println("x " + x(216353783));
        ArrayList<String> n2 = new ArrayList<String>(3);
        n2.add("João"); n2.add("Lucas"); n2.add("Marcos");
        System.out.println("xi " + xi(n2));

    }
}