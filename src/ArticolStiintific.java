import java.util.Arrays;
import java.util.List;

public class ArticolStiintific implements Raport {
    String titlu;
    String autori;
    String titlu_continut;
    String continut;
    String bibliografie;

    public void generareTitlu() {
        String[] titluri = {"Un articol interesant","Apa - esenta vietii","Fizica pe intelesul tuturor","Matematica distractiva","Informatica pentru copii"};
        int index = (int)(Math.random()*4);
        titlu = titluri[index];
        String[] autors = {"Einstein","un fizician cunoscut","programator","profesor universitar","filosof","alt fizician","profesor de matematica"};
        StringBuilder s = new StringBuilder();
        for(int i=0;i<5;i++) {
            int r = (int)(Math.random()*6);
            if(s.indexOf(autors[r])!=-1)
                continue;
            else
                s.append(autors[r] + ", ");
        }
        autori = String.valueOf(s);
    }

    public void generareContinut() {
        String[] titluri2 = {"Capitol 1","Capitol 2","Capitol 3"};
        String[] continuturi = {"text fizica","text informatica","text matematica","text interesant","text plictisitor"};
        int r1, r2;
        r1 = (int)Math.random() * 2;
        titlu_continut = titluri2[r1];
        r2 = (int)Math.random() * 4;
        continut = continuturi[r2];
    }

    public void generareIncheiere() {
        String[] carti = {"Carte de fizica","Carte de matematica","Carte de informatica","Carte de colorat","Carte despre copii"};
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<5;i++) {
            int r = (int)(Math.random()*4);
            if(s1.indexOf(carti[r])!=-1)
                continue;
            else
                s1.append(carti[r] + ", ");
        }
        bibliografie = String.valueOf(s1);
    }

    public ArticolStiintific() {
        generareTitlu();
        generareContinut();
        generareIncheiere();
    }

    @Override
    public String toString() {
        return "ArticolStiintific: { \n Titlu: " + titlu + "\n Autori: " + autori + "\n Despre: " + titlu_continut + "\n Text: " +  continut + "\n Bibliografie: " + bibliografie + " \n }";
    }
}
