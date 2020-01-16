import com.codeup.adlister.dao.Config;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao() {
        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
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

        List<Ad> output = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            while(rs.next()){
                output.add(
                        new Ad(
                                rs.getLong("id"),
                                rs.getLong("user_id"),
                                rs.getString("title"),
                                rs.getString("description")
                        )
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
        return output;
    }

    @Override
    public Long insert(Ad newAd) throws SQLException {
        String insertQuery = "INSERT INTO ads (user_id, title, description) VALUES (" + newAd.getUserId() + ",'" + newAd.getTitle() +"','" + newAd.getDescription() + "')";
        Statement stmt = connection.createStatement();
            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();

        if(rs.next()) {
                System.out.println(rs.getLong(1));
            }
        return rs.getLong(1);

    }


public static void main(String[] args) throws SQLException {
    Ads adsDao = new MySQLAdsDao();

    Ad testAd = new Ad(
            1,
            "test title",
            "test description"
    );

    adsDao.insert(testAd);
    List<Ad> ads = adsDao.all();
    for (Ad ad : ads){
        System.out.println(ad);
    }
}
}

