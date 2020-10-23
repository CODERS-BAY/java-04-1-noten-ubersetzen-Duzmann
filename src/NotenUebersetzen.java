/*

Schreibe ein Programm, dass eine Schulnote in numerischer Form (1-5) in seine textuelle Form übersetzt:
* Bei einer 1 wird "Sehr gut" auf die Konsole geschrieben
* Bei einer 2 wird "Gut" auf die Konsole geschrieben
* Bei einer 3 wird "efriedigend" auf die Konsole geschrieben
* Bei einer 4 wird "Genügend" auf die Konsole geschrieben
* Bei einer 5 wird "Nicht Gengügend" auf die Konsole geschrieben

  */

import java.util.Scanner;

public class NotenUebersetzen {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);


        System.out.print("Du möchtest deine Ziffern-Note in ausgeschriebenem Text sehen?\nGib hier deine Note ein --> ");
        int noteEingabe = eingabe.nextInt();

        switch (noteEingabe) {
            case 1:
                System.out.println(noteEingabe + " --> " + "Sehr gut");
                break;
            case 2:
                System.out.println(noteEingabe + " --> " + "Gut");
                break;
            case 3:
                System.out.println(noteEingabe + " --> " + "Befriedigend");
                break;
            case 4:
                System.out.println(noteEingabe + " --> " + "Genügend");
                break;
            case 5:
                System.out.println(noteEingabe + " --> " + "Nicht Genügend");
                break;
            default:
                System.out.println(noteEingabe + " --> " + "Das ist keine Schulnote. (1-5)\nProgramm beendet");
                break;

        }

    }
}
