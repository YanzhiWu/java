// Pseudocode
public class SqlServerConnection implements DatabaseConnection {
    @Override
    public Connection getConnection() {
        DataSource ds = new SqlServerDataSource();
        Connection conn = ds.getConnection();
        return conn;
    }
}
