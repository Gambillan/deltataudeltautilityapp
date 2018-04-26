
package deltataudeltautilityapp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class MemberController implements MemberDAO{
    ArrayList<Member>members = new ArrayList<>();
    public int insertNewMember(String firstName,String lastName, String position,String year, String major, String email){
        String sql = "{CALL insert_new_member(?,?,?,?,?,?)}";
     CallableStatement statement = null;
        ResultSet rs = null;
       try(Connection conn = MySQLJDBCUtil.getConnection())         
        {
            
            statement = conn.prepareCall(sql);
            statement.setString(1,firstName);
            statement.setString(2,lastName);
            statement.setString(3,position);
            statement.setString(4,year);
            statement.setString(5, major);
            statement.setString(6,email);
            
            int numberEffected = statement.executeUpdate();
            System.out.println("Rows effected on insert:  " + numberEffected);
            rs = statement.getGeneratedKeys();
            if(rs.next())
            {
                int lastInsertedId = rs.getInt(1);
                 rs.close();
                 statement.close();
                return lastInsertedId;
            }
            else
            {
                 rs.close();
                 statement.close();
                 return 5;
                
            }
      
            
        }
        catch (SQLException ex)
        {
            System.out.println("Error creating connection in insertNewMember: " + ex.getMessage());
            return -1;
        }
  }

   
    @Override
    public ArrayList<Member> retreiveMemberByFirstName(String firstName) {
        
        String sql = "{CALL retreive_member_by_first_name(?)}";
     CallableStatement statement = null;
        ResultSet rs = null;
       try(Connection conn = MySQLJDBCUtil.getConnection())         
        {
            
            statement = conn.prepareCall(sql);
            statement.setString(1,firstName);
            rs = statement.executeQuery();
            while(rs.next()){
            String lastName = rs.getString("member_lastname");
            String position = rs.getString("member_position");
            String year = rs.getString("member_year");
            String major = rs.getString("member_major");
            String email = rs.getString("member_email");
            Member temp = new Member(firstName, lastName, position, year, major, email);
            members.add(temp);
                System.out.println(members);
            return members;
            }
            
           
           
            
        }
        catch (SQLException ex)
        {
            System.out.println("Error creating connection in retreive by first name: " + ex.getMessage());
            
        }
       return null;
    }
    
    public ArrayList<Member>retrieveAllMembers(){
        
        String sql = "Select * from member";
     PreparedStatement statement = null;
        ResultSet rs = null;
       try(Connection conn = MySQLJDBCUtil.getConnection())         
        {
            
            statement = conn.prepareStatement(sql);
            rs = statement.executeQuery();
            while(rs.next()){
              
            String firstName = rs.getString("member_firstname");
            String lastName = rs.getString("member_lastname");
            String position = rs.getString("member_position");
            String year = rs.getString("member_year");
            String major = rs.getString("member_major");
            String email = rs.getString("member_email");
            Member temp = new Member(firstName, lastName, position, year, major, email);
                System.out.println(temp);
            members.add(temp);
            return members;
            }
            
           
           
            
        }
        catch (SQLException ex)
        {
            System.out.println("Error creating connection in retreive by first name: " + ex.getMessage());
            
        }
       return null;
    }

    @Override
    public ArrayList<Member> retreiveMemberByLastName(String lastName) {
        String sql = "{CALL retreive_member_by_last_name(?)}";
     CallableStatement statement = null;
        ResultSet rs = null;
       try(Connection conn = MySQLJDBCUtil.getConnection())         
        {
            
            statement = conn.prepareCall(sql);
            statement.setString(1,lastName);
            rs = statement.executeQuery();
            while(rs.next()){
            String firstName = rs.getString("member_firstname");
            String position = rs.getString("member_position");
            String year = rs.getString("member_year");
            String major = rs.getString("member_major");
            String email = rs.getString("member_email");
            Member temp = new Member(firstName, lastName, position, year, major, email);
            members.add(temp);
            return members;
            }
            
           
           
            
        }
        catch (SQLException ex)
        {
            System.out.println("Error creating connection in retreive by last name: " + ex.getMessage());
            
        }
       return null;
    }

    @Override
    public ArrayList<Member> retreiveMemberByPosition(String position) {
        String sql = "{CALL retreive_member_by_position(?)}";
     CallableStatement statement = null;
        ResultSet rs = null;
       try(Connection conn = MySQLJDBCUtil.getConnection())         
        {
            
            statement = conn.prepareCall(sql);
            statement.setString(1,position);
            rs = statement.executeQuery();
            while(rs.next()){
            String firstName = rs.getString("member_firstname");
            String email = rs.getString("member_email");
            String year = rs.getString("member_year");
            String major = rs.getString("member_major");
            String lastName = rs.getString("member_lastname");
            Member temp = new Member(firstName, lastName, position, year, major, email);
            members.add(temp);
            return members;
            }
            
           
           
            
        }
        catch (SQLException ex)
        {
            System.out.println("Error creating connection in retreive by position: " + ex.getMessage());
            
        }
       return null;
    }

    

    

    @Override
    public ArrayList<Member> retreiveMemberByEmail(String email) {
       String sql = "{CALL retreive_member_by_email(?)}";
     CallableStatement statement = null;
        ResultSet rs = null;
       try(Connection conn = MySQLJDBCUtil.getConnection())         
        {
            
            statement = conn.prepareCall(sql);
            statement.setString(1,email);
            rs = statement.executeQuery();
            while(rs.next()){
            String firstName = rs.getString("member_firstname");
            String position = rs.getString("member_position");
            String year = rs.getString("member_year");
            String major = rs.getString("member_major");
            String lastName = rs.getString("member_lastname");
            Member temp = new Member(firstName, lastName, position, year, major, email);
            members.add(temp);
            return members;
            }
            
           
           
            
        }
        catch (SQLException ex)
        {
            System.out.println("Error creating connection in retreive by last name: " + ex.getMessage());
            
        }
       return null;
    }

    @Override
    public int updateMember(String firstName, String lastName, String position, String year, String major, String email) {
        String sql = "{CALL update_member(?,?,?,?,?,?)}";
     CallableStatement statement = null;
        ResultSet rs = null;
       try(Connection conn = MySQLJDBCUtil.getConnection())         
        {
            
            statement = conn.prepareCall(sql);
            statement.setString(1,firstName);
            statement.setString(2,lastName);
            statement.setString(3,position);
            statement.setString(4,year);
            statement.setString(5, major);
            statement.setString(6,email);
            
            int numberEffected = statement.executeUpdate();
            System.out.println("Rows effected on insert:  " + numberEffected);
            rs = statement.getGeneratedKeys();
            if(rs.next())
            {
                int lastInsertedId = rs.getInt(1);
                 rs.close();
                 statement.close();
                return lastInsertedId;
            }
            else
            {
                 rs.close();
                 statement.close();
                 return 5;
                
            }
      
            
        }
        catch (SQLException ex)
        {
            System.out.println("Error creating connection in insertNewMember: " + ex.getMessage());
            return -1;
        }
    }
    
    

    
}
