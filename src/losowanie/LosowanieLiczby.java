package losowanie;

import java.io.*;
import java.util.Random;

public class LosowanieLiczby {

    public static void main(String[] args)
        throws IOException
    {
        double losuj_liczbe, zgadnij_liczbe;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            System.out.println("System losuje liczbę z przedzialu 1-15. Sprobuj odgadnac ta liczbe.");
            Random r = new Random();
            losuj_liczbe = Math.round(15 * (r.nextDouble()));
            System.out.println("Podaj liczbe :");
            zgadnij_liczbe = Double.parseDouble(br.readLine());

            if (zgadnij_liczbe == losuj_liczbe) {
                System.out.println("Odgadłeś wylosowana przez system liczbe");
            }
            else
            {
                if (zgadnij_liczbe > 15)
                {
                    System.out.println("Podana liczba jest za duza.");
                }
                else
                {
                    System.out.print("Nie odgadłeś liczby, prawidlowa liczba to: ");
                    System.out.print((int) losuj_liczbe);
                }
            }
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Blad.Podaj liczbe z przedzialu 1-15");
        }
    }
}
