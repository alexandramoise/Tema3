import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List <Raport> rapoarte = new ArrayList<>();
        rapoarte.add(new ArticolStiintific());
        rapoarte.add(new RaportSedinta());
        rapoarte.add(new ArticolStiintific());
        rapoarte.add(new ArticolStiintific());
        rapoarte.add(new RaportSedinta());
        for(Raport r : rapoarte)
            System.out.println(r);
        System.out.println("------------------------------");
        System.out.println("Numarul de articole din tablou = " + nr_articole(rapoarte));
        System.out.println("------------------------------");
        System.out.println("Data in care au avut loc cele mai multe sedinte: " ); //?

    }
    public static int nr_articole(List <Raport> r) {
        int nr=0;
        for(Raport rap : r)
            if(rap instanceof ArticolStiintific)
                nr++;
        return nr;
    }

}