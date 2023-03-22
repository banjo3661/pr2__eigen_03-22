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
}


