// Pseudocode
public class OracleConnection implements DatabaseConnection {
    @Override
    public Connection getConnection() {
        DataSource ds = new OracleDataSource();
        Connection conn = ds.getConnection();
        return conn;
    }
}
