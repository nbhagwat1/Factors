import java.util.Scanner;
public class Factors
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will return all the factors of any integer you like!");
        System.out.println("Please enter an integer: ");
        int number = input.nextInt();

        int[] factorStorage = new int[number];
        int factorCount = 0;
        for(int i = 1; i < number + 1; i++)
        {
            if(number % i == 0)
            {
                factorStorage[factorCount] = i;
                factorCount++;
            }
        }

        int[] factorArray = new int[factorCount];
        for(int i = 0; i < factorCount; i++)
        {
            factorArray[i] = factorStorage[i];
        }

        System.out.print("[");
        for(int i = 0; i < factorCount - 1; i++)
        {
            System.out.print(factorArray[i] + ", ");
        }
        System.out.print(factorArray[factorCount - 1] + "]");
    }
}
