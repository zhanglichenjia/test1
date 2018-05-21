package kesun.dao.web.impl;

import kesun.dao.DaoSupport;
import kesun.dao.web.INotice;
import org.springframework.stereotype.Repository;

/**
 * Created by heying on 2017/10/29.
 */
@Repository("dSchool")
public class DSchool extends DaoSupport implements INotice {
    public DSchool() {
        setMapperName("mapper.SchoolMapper");
    }
    public Boolean objectInUse(String id)
    {
        return false;
    }
}
