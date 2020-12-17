package book.creationDesignPatterns.singleton;

import com.github.javafaker.Faker;

public class Database {

    private static Database instance;
    private String instanceInfo;

    private Database() {
        instanceInfo = Faker.instance().address().zipCode();
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public String query(String sql) {
        // query to database simple example
        String queryResult;
        if (sql.contains("SELECT")) {
            queryResult = String.format("SELECT the next data <%s> from database",
                    sql.replace("SELECT", ""));
        } else {
            queryResult = "ANY other actions with a query";
        }
        return queryResult;
    }

    public String getInstanceInfo() {
        return instanceInfo;
    }
}