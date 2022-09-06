// Pseudocode
public class MySqlConnection implements DatabaseConnection {
    @Override
    public Connection getConnection() {
        DataSource ds = new MySqlDataSource();
        Connection conn = ds.getConnection();
        return conn;
    }
}
