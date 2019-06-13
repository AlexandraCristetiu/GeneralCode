package sample;

public class tableData {
    public static String getFirstColumn;
    public static String getSecondColumn;
    public static String getThirdColumn;
    public static String getFourthColumn;
    private String firstColumn;
    private String secondColumn;
    private String thirdColumn;
    private String fourthColumn;


    public tableData(String firstColumn, String secondColumn, String thirdColumn, String fourthColumn) {
        this.firstColumn = firstColumn;
        this.secondColumn = secondColumn;
        this.thirdColumn = thirdColumn;
        this.fourthColumn = fourthColumn;
    }

    public String getFirstColumn() {
        return firstColumn;
    }

    public String getSecondColumn() {
        return secondColumn;
    }

    public String getThirdColumn() {
        return thirdColumn;
    }

    public String getFourthColumn() {
        return fourthColumn;
    }

    public void setFirstColumn(String firstColumn) {
        this.firstColumn = firstColumn;
    }

    public void setSecondColumn(String secondColumn) {
        this.secondColumn = secondColumn;
    }

    public void setThirdColumn(String thirdColumn) {
        this.thirdColumn = thirdColumn;
    }

    public void setFourthColumn(String fourthColumn) {
        this.fourthColumn = fourthColumn;
    }
}
