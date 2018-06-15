package model;

import java.sql.*;

public class UserLookupServiceImpl implements UserLookupService {
    private final String selectQuery = "SELECT id, first_name, last_name " +
            "FROM users_table \n" +
            "WHERE id = ?";

    @Override
    public User findUsers(String userId) {
        User user = null;
        try (Connection dbConnection = Utils.getDBConnection("sa", "sa");
             PreparedStatement queryStatement = dbConnection.prepareStatement(selectQuery)) {

            queryStatement.setString(1, userId);
            ResultSet rs = queryStatement.executeQuery();

            rs.next();
            long id = rs.getLong("id");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            user = new User(id, firstName, lastName);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return user;
    }
}
