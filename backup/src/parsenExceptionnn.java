import java.util.LinkedList;
import java.util.List;

public class parsenExceptionnn {

    private List<DatenzumParsen> measurements = new LinkedList<DatenzumParsen>();

    public parsenExceptionnn (String data) {


        //trim() => LÖSCHT VON BEGINN UND ENDE LEERZEICEHN => "----HI--" -> HI
        if(data == null || data.trim().isEmpty()) {

            throw new MeineExpception (" No data"+ data);
        }

        String [] rows = data.split("\n");
        for (String row: rows) {

            String [] columns = row.split(";");

            if(columns == null || columns.length !=4) {

                    throw new MeineExpception (" Not enough Textspalten/Ziffern " + data);

            }

            if(columns [0] == null || columns[0].trim().isEmpty()) {

                    throw new MeineExpception ("Spalte/Zoffer  0 ist leer  " + data);


            }

            if(columns [1] == null || columns[1].trim().isEmpty()) {

                    throw new MeineExpception ("Spalte/Zoffer  1 ist leer   " + data);


            }

            if(columns [2] == null || columns[2].trim().isEmpty()) {

                    throw new MeineExpception ("Spalte/Zoffer  2 ist leer   " + data);


            }

            if(columns [3] == null || columns[3].trim().isEmpty()) {

                    throw new MeineExpception ("Spalte/Zoffer  3 ist leer   " + data);


            }

            measurements.add(new DatenzumParsen(
                    columns[0],
                    Integer.parseInt(columns[1]),
                   Integer.parseInt(columns[2]),
                    Integer.parseInt(columns[3])));






        } // ENDE FOR SCHKLEIFE







    } // Ende des Konstukror



    public List<DatenzumParsen> getDatenzumparsen() {

        return measurements;
    }
}
