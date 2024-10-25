import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creer un scanner pour lire les valeurs
        Scanner scanner=new Scanner(System.in);
        //Preciser le nombre des etudiants
        System.out.print("Entrez le nombre d'étudiants : ");
        int NbEtd=scanner.nextInt();
        //Saisir et verification des notes
        float[] notes=new float[NbEtd];
        float n;
        for (int i=0;i<NbEtd;i++) {
            System.out.print("Entrez la note de l'etudiant "+(i+1)+" : ");
            n=scanner.nextFloat();
            //Verifier Si la note est dans [0,20]
            if ( n<0 || n>20)
            {
                i=i-1;
            }
            else
            {
                notes[i] = n;
            }
        }
        //Afficher les notes
        System.out.println("\nNotes des etudiants :");
        for (int i=0;i<NbEtd;i++) {
            System.out.println("Etudiant "+(i+1)+" : "+notes[i]);
        }
        //Notes triées
        Arrays.sort(notes);
        System.out.println("\nNotes triées :");
        for (int i=0;i<NbEtd;i++) {
            System.out.println(notes[i]);
        }
        //Note Moyenne
        float m=0;
        for (int i=0;i<NbEtd;i++) {
            m+=notes[i];
        }
        m=m/NbEtd;
        System.out.println("\nLa note moyenne : "+ m);
        //Note minimale
        float min=notes[0];
        for (int i=0;i<NbEtd;i++) {
            if (min>notes[i])
            {
                min=notes[i];
            }
        }
        System.out.println("\nLa note minimale : "+ min);
        //Note maximale
        float max=notes[0];
        for (int i=0;i<NbEtd;i++) {
            if (max<notes[i])
            {
                max=notes[i];
            }
        }
        System.out.println("\nLa note maximale : "+ max);
        //Affichez le nombre d’étudiants ayant une note saisie par l’utilisateur.
        float note;
        int rep=0;
        System.out.print("\nEntrer La note  : ");
        note=scanner.nextFloat();
        for (int i=0;i<NbEtd;i++) {
            if (note==notes[i])
            {
                rep+=1;
            }
        }
        System.out.println("\nLa note "+note +" est repetée "+ rep);
        //Fermer le scanner
        scanner.close();
    }
}