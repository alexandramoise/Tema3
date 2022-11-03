public class RaportSedinta implements Raport{
    String motiv;
    String data;
    String subiecte;
    String minuta;
    String persoane;

    public void generareTitlu() {
        String[] motive = {"discutie proiect","promovare angajati","eveniment nou","membru nou in echipa","idee proiect"};
        motiv = motive[(int)(Math.random()*4)];
        String[] date = {"04.11.2022", "07.11.2022", "08.11.2022", "09.11.2022", "10.11.2022", "11.11.2022"};
        data = date[(int)(Math.random()*5)];
    }

    public void generareContinut() {
        String[] sub = {"ce ati lucrat fiecare?","va place firma?","cine vrea sa ii arate colegului locul?","cine e entuziasmat?","anunt important","planuri pentru vacanta"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<2;i++) {
            int r = (int)(Math.random()*5);
            if(sb.indexOf(sub[r])!=-1)
                continue;
            else
                sb.append(sub[r] + ", ");
        }
        subiecte = String.valueOf(sb);

        String[] rez = {"toti colegii si-au spus parerea. ", "nimeni nu a fost incantat...", "totul merge minunat! ", "a fost un dezastru :(", "s-a decis: saptamana viitoare libera"};
        StringBuilder s = new StringBuilder();
        for(int i=0;i<3;i++) {
            int r = (int)(Math.random()*4);
            if(s.indexOf(rez[r])!=-1)
                continue;
            else
                s.append(rez[r] + ", ");
        }
        minuta = String.valueOf(s);
    }

    public void generareIncheiere() {
        String[] pers= {"Ana Popescu","Gheorghe Ionescu","Maria Ion","Alexandra Bodi","Ionut Pop","Marius Popescu","Mihai Moise"};
        StringBuilder p = new StringBuilder();
        for(int i=0;i<3;i++) {
            int r = (int)(Math.random()*6);
            if(p.indexOf(pers[r])!=-1)
                continue;
            else
                p.append(pers[r] + ", ");
        }
        persoane = String.valueOf(p);
    }

    RaportSedinta() {
        generareTitlu();
        generareContinut();
        generareIncheiere();
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Raport sedinta: { \n Motiv: " + motiv + "\n Data: " + data + "\n Subiect: " + subiecte + "\n Minuta: " + minuta + "\n Persoane responsabile: " + persoane + "\n }" ;
    }
}
