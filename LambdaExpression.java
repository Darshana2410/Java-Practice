//how to use lambda expression and pass a parameter

@FunctionalInterface

interface LambaExp
{
    void meth1(int a, int b);
}

public class LambdaExpression
{
    public static void main(String[] args) 
    {
        LambaExp obj =(a,b)->
        {
            System.out.println("The value of a and b is : "+ a + "," + b);
        };
        obj.meth1(10,20);
    }
}