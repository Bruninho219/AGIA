package TestePesq;

import java.util.Random;

public class MainPesq
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int vet[];

        String num1;
        int ger=0, cont=0;

        num1 = "28041996";
        System.out.println(num1.length());
        vet = new int[num1.length()];

        for (int i = 0; i < num1.length(); i++)
        {
            vet[i]=r.nextInt(10);
        }

        do
        {
            //Inicio do teste
            ger++;
            System.out.println("Gerações: " + ger);
            System.out.print("Valor atual: ");
            for (int i = 0; i < num1.length(); i++)
            {
                //Verifica a semelhança, se estiver errado joga outra valor...
                if(Integer.toString(vet[i]).charAt(0) != num1.charAt(i))
                {
                    //System.out.println(vet[i] + "!=" + num1.charAt(i));
                    System.out.print(vet[i]);
                    vet[i]=r.nextInt(10);
                }
                //...caso contrário mantém
                else
                {
                    //System.out.println(vet[i] + "==" + num1.charAt(i));
                    System.out.print(vet[i]);
                    cont++;
                }
            }

            //Se o número de numeros corretos for diferente do número de digitos, começa de novo...
            if(cont!=num1.length())
            {
                cont=0;
            }

            System.out.println();
        }
        while (cont!=num1.length());

        System.out.println("\n");
        System.out.println("Gerações: " + ger);
        //System.out.println("Valor:" + num1);
        System.out.print("Valor encontrado: ");
        for (int i = 0; i < num1.length(); i++)
        {
            System.out.print(vet[i]);
        }
        System.out.println();
    }
}