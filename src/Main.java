public class Main
{
    void main()
    {
        double balance = 5000.0;
        final double RATE = .17;

        // First month:
        balance = balance + balance * RATE;  //

        IO.println("The balance after one month is: " + balance);

        // Second Month:
        balance = balance + balance * RATE;

        IO.println("The balance after two months is: " + balance);

    }
}