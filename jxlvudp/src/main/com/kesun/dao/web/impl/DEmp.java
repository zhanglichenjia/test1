package kesun.dao.web.impl;

import kesun.dao.DaoSupport;
import kesun.dao.web.INotice;
import org.springframework.stereotype.Repository;

/**
 * Created by heying on 2017/10/29.
 */
@Repository("dEmp")
public class DEmp extends DaoSupport {
    public DEmp() {
        setMapperName("mapper.EmpMapper");
    }
	   public Boolean objectInUse(String id)
    {
        return false;
    }
    
}
