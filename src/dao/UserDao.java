package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entity.User;
import util.JdbcUtil;

public class UserDao {
	
	private JdbcUtil util;
	private static UserDao userDao;
	private final String createNewUserSql
		= "insert into user(nickname,email,password,pic_src,fans,focus,description) "
				+ "values(?,?,?)";
	private final String getUserInfoSql
		="select * from user where id = ?";
	private final String changeUserInfoSql
		="update user set password = ?,name = ?,type = ? where id = ?";
	
	private UserDao(){
		util = JdbcUtil.getInstance();
	}
	
	public static UserDao getInstance(){
		if(userDao == null){
			userDao = new UserDao();
		}
		return userDao;
	}
	
	public boolean userCreate(User user){
		Connection conn = util.getConnection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(this.createNewUserSql);
			ps.setString(1, user.getPassword());
			ps.setString(2, user.getName());
			ps.setInt(3, user.getType());
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally{
			try {
				if(ps != null)   ps.close();
				if(conn != null) conn.close();	
			} catch (SQLException e) {
					e.printStackTrace();
			}
		}
	}
	
	public User userGetById(int userId){
		Connection conn = util.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			ps = conn.prepareStatement(this.getUserInfoSql);
			ps.setInt(1,userId);
			rs = ps.executeQuery();
			if(rs.next()){
				String userPassword = rs.getString("password");
				String userName = rs.getString("name");
				int userType = rs.getInt("type");
				User user = new User(userId,userPassword,userName,userType);
				return user;
			}else{
				return null;
			}
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}finally{
			try {
				if(ps != null)   ps.close();
				if(conn != null) conn.close();	
				if(rs != null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean user_info_change(User user){
		Connection conn = util.getConnection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(changeUserInfoSql);
			ps.setString(1, user.getPassword());
			ps.setString(2, user.getName());
			ps.setInt(3, user.getType());
			ps.setInt(4, user.getId());
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally{
			try {
				if(ps != null)   ps.close();
				if(conn != null) conn.close();	
			} catch (SQLException e) {
					e.printStackTrace();
			}
		}
	}
}
  
