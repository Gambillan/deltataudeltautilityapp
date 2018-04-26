
package deltataudeltautilityapp;

import java.util.ArrayList;


public interface MemberDAO {
    public int insertNewMember(String firstName,String lastName,String position,String year,String major,String email);
    public ArrayList<Member> retreiveMemberByFirstName(String firstName);
    public ArrayList<Member> retreiveMemberByLastName(String lastName);
    public ArrayList<Member> retreiveMemberByPosition(String position);
    public ArrayList<Member> retreiveMemberByEmail(String email);
    public int updateMember(String firstName,String lastName,String position,String year,String major,String email);
    
}
