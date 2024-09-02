
/**
 * Demo Call by Value in Primitives
 *
 * @author (Rachit Jha)
 * @version (1/10/24)
 */
public class Primitive
{
    public static int changeX(int x){
        x=5;
        return x;
    }
    public static void main(String[]args){
        int y=7;
        System.out.println(y);
        y=changeX(y);
        System.out.println(y);
    }
}