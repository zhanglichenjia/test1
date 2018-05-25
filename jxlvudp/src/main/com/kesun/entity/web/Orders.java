package kesun.entity.web;

import kesun.entity.AbsBusinessObject;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by 李凡 on 2018/5/17.
 */
public class Orders  extends AbsBusinessObject {
    private String id;
    private String uid;
    private String name;
    private float sumPrice;
    private Date dataTime;
    private int statuse;  //与数据库中的status 一致
    private String address;
    private Users users;
    private static final long serialVersionUID = 1L;
    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public float getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(float sumPrice) {
        this.sumPrice = sumPrice;
    }

    public String getDataTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = sdf.format(dataTime);
        return dateString;
    }
    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public int getStatuse() {
        return statuse;
    }

    public void setStatuse(int statuse) {
        this.statuse = statuse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
