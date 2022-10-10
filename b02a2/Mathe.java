/*
 * @author mpayse2s
 * Programm: returns abs Value of <n>
 */
public class Mathe {

    public static Integer abs(int n)  {
        if(n < 0) {
            n = n * -1;
        } 
        return n;
    }

    public static Integer max3(int a, int b, int c) {
        
        if(a > b && a > c) {
            return a;
        }
        else if (b > a && b > c){
            return b;
        }
        else {
            return c;
        }

        
    }
}