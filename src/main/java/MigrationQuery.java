public class MigrationQuery {
    public static String addUserNewColumnMigrationUp = "ALTER TABLE \"user\"\n" +
            "ADD COLUMN surname varchar(255) not null default 'tsakelove';";

    public static String userTableMigrationDown = "ALTER TABLE \"user\"\n" +
            "drop COLUMN surname;";

}
