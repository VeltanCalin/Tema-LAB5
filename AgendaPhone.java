

public class AgendaPhone { // begin clasa

    static final int MAX=2;
    static final int EXIT=6;
    static String[] agendaDeNume = new String[MAX];
    static int index = 0;
    public static void main(String[] args) { // begin main

        meniu();
        int optiune = SkeletonJava.readIntGUI("Optiunea dvs este:");
        while(optiune!=EXIT) {
            if(optiune>EXIT)
                System.out.println("Optiune inexistenta");
                System.out.println("Ati ales:"+optiune);

            switch(optiune) {

                case 1: afisare();break;
                case 2: cautare();break;
                case 3: adaugare();break;
                case 4: modificare(); break;
                case 5: stergere();break;

            }

            meniu();
            optiune = SkeletonJava.readIntGUI("Optiunea dvs:");

        }

    } // end main


    static void afisare() {
        for(String a: agendaDeNume)
        {
            if(a!=null)
                System.out.println(a);
        }
    }

             static void cautare(){

              String numeCautat = SkeletonJava.readStringConsole("Introduceti numele cautat: ");

                for (int i = 0; i < agendaDeNume.length; i++){

                if (numeCautat.equals(agendaDeNume[i])){

                      SkeletonJava.printConsole(agendaDeNume[i]);
                              break;
                 }

                  else {
                     SkeletonJava.printConsole("Numele cautat nu a fost gasit");

                 }
               }
            }


    static void adaugare() {

        if (index > agendaDeNume.length - 1) {
            System.out.println("Sorry, agenda plina, mai sterge!");
        } else {
            String nume = SkeletonJava.readStringConsole("Nume si telefon:");

            //boolean adaugat = true;

            for (int i = 0; i < agendaDeNume.length; i++) {
                if (agendaDeNume[i] == null) {
                    //int i= 0;
                    //     while(agendaDeNume[i]==null){
                    agendaDeNume[i] = nume;
                    index++;
                     break;
                }
            }
        }
    }

    static void modificare() {

        String oldcontact = SkeletonJava.readStringConsole("Ce contact doriti sa modificati?: ");


                for(int i=0; i<agendaDeNume.length; i++) {

                    if (oldcontact.equals(agendaDeNume[i])) {
                        String newcontact = SkeletonJava.readStringConsole("Introduceti noul contact ");
                        agendaDeNume[i] = agendaDeNume[i].replaceAll(agendaDeNume[i], newcontact);
                        SkeletonJava.printConsole("Noul contact este: " + agendaDeNume[i]);
                      break;
                    } else {
                        SkeletonJava.printConsole("Contactul nu a fost gasit! ");
                    }
                break;
                }

    }


    static void stergere(){

        String delcontact = SkeletonJava.readStringConsole("Introduceti contactul care va fi sters: ");

        for(int i=0; i<agendaDeNume.length; i++){

                if(agendaDeNume[i]!= null && delcontact.equals(agendaDeNume[i])) {
                    agendaDeNume[i] = null;
                    SkeletonJava.printConsole("Contactul " +delcontact+ " a fost sters");
                break;
                }

                else{
                    SkeletonJava.printConsole("Contactul nu a fost gasit");
                break;
                }
        }

    }

            static void meniu () { // begin metoda
                System.out.println("1. Afisare");
                System.out.println("2. Cautare");
                System.out.println("3. Adaugare");
                System.out.println("4. Modificare");
                System.out.println("5. Stergere");
                System.out.println("6. Exit");
            } // end metoda




      } // end clasa