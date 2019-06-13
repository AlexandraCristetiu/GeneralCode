package sample;

public class ApplicationConstants {

    //region table
    public static final String TABLE_WANTED_NAME = "the name of the table you want to create";
    public static final String TABLE_NAME_FIRST_COLUMN = "the name of the column you want created in the table";
    public static final String TABLE_NAME_SECOND_COLUMN = "the name of the column you want created in the table";
    public static final String TABLE_NAME_THIRD_COLUMN = "the name of the column you want created in the table";
    public static final String TABLE_NAME_FOURTH_COLUMN = "the name of the column you want created in the table";
  //endregion table

    //region database

    public static final String APP_FOLDER_DATA_PATH = "c:\\Users\\Public\\Documents\\databasename";

    public static final String PATH_SEPARATOR = "\\"; //windows style



    public static final String DATABASE_NAME = "databasename.db";
    public static final String DATABASE_FOLDER = "database";
    public static final String SQLITE_JDBC = "jdbc:sqlite";
    public static final String DB_CONNECTION_URL =
            SQLITE_JDBC +
                    ":" +
                    APP_FOLDER_DATA_PATH +
                    PATH_SEPARATOR +
                    DATABASE_FOLDER +
                    PATH_SEPARATOR +
                    DATABASE_NAME;

    //endregion

    //region database with txt


  /*  public static final String APP_FOLDER_DATA_PATH = "C:\\Users\\Public\\Documents\\database";
    public static final String CATEGORY_FOLDER_NAME = "folderName";
    public static final String CATEGORY_FILE_EXTENSION = ".txt";
    public static final String WORD_SEPARATOR_IN_CATEGORY_ENTRY = ";";   */


    //endregion
}
