package kesun.dao.web.impl;

import kesun.dao.DaoSupport;
import kesun.dao.web.INotice;
import org.springframework.stereotype.Repository;

/**
 * Created by heying on 2017/10/29.
 */
@Repository("dBuyProduct")
public class DBuyProduct extends DaoSupport implements INotice {
    public DBuyProduct() {
        setMapperName("mapper.BuyProductMapper");
    }
    public Boolean objectInUse(String id)
    {
        return false;
    }
}
