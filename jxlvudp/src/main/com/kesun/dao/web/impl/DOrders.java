package kesun.dao.web.impl;

import kesun.dao.DaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by heying on 2017/10/29.
 */
@Repository("dOrders")
public class DOrders extends DaoSupport {
    public DOrders() {
        setMapperName("mapper.OrdersMapper");
    }
	   public Boolean objectInUse(String id)
    {
        return false;
    }
    
}
