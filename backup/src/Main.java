import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> data = new ArrayList<String>();
        data.add("2023-01-26T16:15:12+00:00;4545;25;260\n");
        data.add("2023-01-26T16:30:44+00:00;2252;1023;1055\n");

        List<parsenExceptionnn> DatenzumParsenObjekte = new ArrayList<parsenExceptionnn>();

        for (String datenZeile : data) {
            // ... and try to create a Student object
            try{
                parsenExceptionnn DatenzumParsenObjektTempo = new parsenExceptionnn(datenZeile);
                DatenzumParsenObjekte.add(DatenzumParsenObjektTempo);
                System.out.println("Gespeichert");
            }catch (Exception e){
                System.out.println("Nicht Gespeichert: " + e);
            }

        }

        System.out.println("List of Student objects:");
        for (parsenExceptionnn m : DatenzumParsenObjekte) {
            System.out.println(m.getDatenzumparsen());
        }





    }

}