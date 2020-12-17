package book.creationDesignPatterns.singleton;

public class Application {

    public static void main(String[] args) {
        Database database1 = Database.getInstance();
        System.out.println(database1.query("SELECT test_column_1 FROM test_table;"));
        System.out.printf("database1 hashCode = %s\n", database1.hashCode());
        Database database2 = Database.getInstance();
        System.out.println(database2.query("UPDATE test_table SET test_column_1 = 'test' WHERE testID = 1"));
        System.out.println(database2.hashCode());
        System.out.printf("database2 hashCode = %s\n", database1.hashCode());
        System.out.printf("database1 equals database2 is <%s>\n", database1.equals(database2));
        System.out.printf("database1 instance info = %s\n", database1.getInstanceInfo());
        System.out.printf("database2 instance info = %s\n", database2.getInstanceInfo());
    }
}