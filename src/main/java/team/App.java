package team;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Generator gen = new Generator(10, 3, 2, 2);
        System.out.println(gen.generate());
    }
}
