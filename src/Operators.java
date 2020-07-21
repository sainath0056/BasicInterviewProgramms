public class Operators {
    public static void main(String[] args)
    {
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
        boolean condition = true;

        // pre-increment operator:: Value is incremented first and then result is computed.
        // a = a+1 and then c = a;
        c = ++a;
        System.out.println("Value of c (++a) = " + c);

        // post increment operator:Value is first used for computing the result and then incremented
        // c=b then b=b+1
        c = b++;
        System.out.println("Value of c (b++) = " + c);

        // pre-decrement operator:Value is decremented first and then result is computed.
        // d=d-1 then c=d
        c = --d;
        System.out.println("Value of c (--d) = " + c);

        // post-decrement operator:: Value is first used for computing the result and then decremented.
        // c=e then e=e-1
        c = e--;
        System.out.println("Value of c (e--) = " + c);

        // Logical not operator
        System.out.println("Value of !condition ="
                           + !condition);
    }
}
