import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MySQLAdsDao implements Ads {

    Config config = new Config();
    private Connection connection;

    public MySQLAdsDao(){

        this.connection = DriverManager.getConnection();
    }

    {
        try {
            connection = DriverManager.getConnection(
                        config.getUrl(),
                        config.getUsername(),
                        config.getPassword()
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
