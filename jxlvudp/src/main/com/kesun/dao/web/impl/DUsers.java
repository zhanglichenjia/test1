package kesun.dao.web.impl;

import kesun.dao.DaoSupport;
import kesun.dao.web.INotice;
import org.springframework.stereotype.Repository;

/**
 * Created by heying on 2017/10/29.
 */
@Repository("dUsers")
public class DUsers extends DaoSupport implements INotice {
    public DUsers() {
        setMapperName("mapper.UserssMapper");
    }
    public Boolean objectInUse(String id)
    {
        return false;
    }
}
