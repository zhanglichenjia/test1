package kesun.entity.web;

import kesun.entity.AbsBusinessObject;

/**
 * Created by 李凡 on 2018/5/12.
 */
public class Emp extends AbsBusinessObject {
     private String id;
     private String userId;
    private Users users;
    private static final long serialVersionUID = 1L;
    @Override
    public String getId() {
        return id;
    }
    public String getUserId() {
        return userId;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
