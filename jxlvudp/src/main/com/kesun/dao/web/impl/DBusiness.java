package kesun.dao.web.impl;

import kesun.dao.DaoSupport;
import kesun.dao.web.INotice;
import org.springframework.stereotype.Repository;

/**
 * Created by heying on 2017/10/29.
 */
@Repository("dBusiness")
public class DBusiness extends DaoSupport implements INotice {
    public DBusiness() {
        setMapperName("mapper.BusinessMapper");
    }
    public Boolean objectInUse(String id)
    {
        return false;
    }
}
