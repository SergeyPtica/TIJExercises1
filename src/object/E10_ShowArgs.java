/**
 * Created by Serg on 20.03.2017.
 */
package object;
public class E10_ShowArgs {
    public static void main(String[] args) {
        if(args.length < 3) {
            System.err.println("Enter 3 arguments for arrays of string");
            System.exit(1);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}