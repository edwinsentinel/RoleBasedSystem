package org.o7planning.springmvcsecurity.dao;
 
import java.util.List;
 
import org.o7planning.springmvcsecurity.model.UserInfo;
 
public interface UserInfoDAO {
     
    public UserInfo findUserInfo(String userName);
     
    // [USER,AMIN,..]
    public List<String> getUserRoles(String userName);
     
}
