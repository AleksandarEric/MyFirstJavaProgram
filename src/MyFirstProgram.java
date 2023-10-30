public class MyFirstProgram {
    public static void main(String[] args) {
        Student s = new Student();

        s.ime = "Jelena";
        s.prezime = "Petrucic";
        s.broj_indeksa = ("13716/15");

        s.podaciStudenta();

        Predmet p = new Predmet();

        p.naziv_predmeta = "Medicina rada";

        p.predmet();


        Ispit i = new Ispit();

        i.datum = "07.03.2023.";

        i.datum_odrzavanja();
    }

    }



