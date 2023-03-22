import java.util.ArrayList;
import java.util.List;

public class DatenzumParsen {

    private String date;
    private Integer carNumber;
    private Integer startSecond;
    private Integer finishSecond;


    public DatenzumParsen(String date, Integer carNumber, Integer startSecond, Integer finishSecond) {
        this.date = date;
        this.carNumber = carNumber;
        this.startSecond = startSecond;
        this.finishSecond = finishSecond;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Integer carNumber) {
        this.carNumber = carNumber;
    }

    public Integer getStartSecond() {
        return startSecond;
    }

    public void setStartSecond(Integer startSecond) {
        this.startSecond = startSecond;
    }

    public Integer getFinishSecond() {
        return finishSecond;
    }

    public void setFinishSecond(Integer finishSecond) {
        this.finishSecond = finishSecond;
    }

    @Override
    public String toString() {
        return "DatenzumParsen{" +
                "date='" + date + '\'' +
                ", carNumber=" + carNumber +
                ", startSecond=" + startSecond +
                ", finishSecond=" + finishSecond +
                '}';
    }

    public static void main(String[] args) {
        List<String> data = new ArrayList<String>();
        data.add("2023-01-26T16:15:12+00:00;4545;25;260\n");
        data.add("2023-01-26T16:30:44+00:00;2252;1023;1055\n");

        List<DatenzumParsen> DatenzumParsenObjekte = new ArrayList<DatenzumParsen>();

        for (String datenZeile : data) {
            // ... and try to create a Student object
            try{
                DatenzumParsen DatenzumParsenObjektTempo = new DatenzumParsen();
                DatenzumParsenObjekte.add(DatenzumParsenObjektTempo);
                System.out.println("Gespeichert");
            }catch (Exception e){
                System.out.println("Nicht Gespeichert: " + e);
            }

        }

        System.out.println("List of Student objects:");
        for (DatenzumParsen m : DatenzumParsenObjekte) {
            System.out.println(m);
        }





    }
}


