import java.util.Random;

public class Loto {


    public static void main(String[] args) {

        //1 generez numerele agentiei (metoda)

        int[] biletAgentie = generateSixRandomNumbers();
        printTicket(biletAgentie);

        //2 generez biletul meu (metoda)

        int[] biletIonel = generateSixRandomNumbers();
        printTicket(biletIonel);

        int contor = 1;

        //3 atata timp cat nu am nimerit 3 numere  (4imi trebuie o metoda de comparat 2 siruri)


//        int[] biletAgentie={44,12,13,15,18,1};
//        int[] biletIonel={12,6,15,2,3,4};


        int iguessed = compareTwoTickets(biletAgentie, biletIonel);


        while (iguessed < 6) {
            biletIonel = generateSixRandomNumbers();
            contor++;
            System.out.println(contor);
            iguessed = compareTwoTickets(biletAgentie, biletIonel);
        }
        ;


        System.out.println("we have a winner");
        System.out.println("agentie:");
        printTicket(biletAgentie);
        System.out.println("ionel:");
        printTicket(biletIonel);
        SkeletonJava.printGUI("You guessed " + iguessed + " numbers after " + contor + " attempts") ;


        //5 afisez contorul si biletul castigator

    }

    static int[] generateSixRandomNumbers() {
        int[] agencyNumbers = new int[6];
        int i = 0;

        while (i < 6) {

            agencyNumbers[i] = new Random().nextInt(49) + 1; //bug , make sure you fix it

            for (int j = 0; j < agencyNumbers.length; j++) {
                while (agencyNumbers[i] == agencyNumbers[j] && i!=j)

                    agencyNumbers[i] = new Random().nextInt(49) + 1;

                }
        i++;
        }
            return agencyNumbers;


        }


        static int compareTwoTickets ( int[] ticket1, int[] ticket2){
            int gasite = 0;
            for (int i = 0; i < 6; i++)
                for (int j = 0; j < 6; j++) {
                    if (ticket1[i] == ticket2[j])
                        gasite++;
                }
            return gasite;
        }


        static void printTicket ( int[] ticket){
            for (int j = 0; j < 6; j++) {
                System.out.print(ticket[j] + ":");
            }
            System.out.println();
        }

    }
