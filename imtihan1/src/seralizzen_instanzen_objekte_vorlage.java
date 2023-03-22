import java.io.Serializable;

public class seralizzen_instanzen_objekte_vorlage  implements Serializable {

    private static final long serialVersionUID = 1234567L;

    private  transient String date;
    private Integer carNumber;
    private Integer startSecond;
    private Integer finishSecond;


    public seralizzen_instanzen_objekte_vorlage  (String date, Integer carNumber, Integer startSecond, Integer finishSecond){

        this.date=date;
        this.carNumber = carNumber;
        this.startSecond = startSecond;
        this.finishSecond = finishSecond;


    }


    @Override
    public String toString() {
        return "seralizzen_instanzen_objekte_vorlage{" +
                "date='" + date + '\'' +
                ", carNumber=" + carNumber +
                ", startSecond=" + startSecond +
                ", finishSecond=" + finishSecond +
                '}';
    }
}


