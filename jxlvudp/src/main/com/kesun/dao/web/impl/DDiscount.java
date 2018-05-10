package kesun.dao.web.impl;

import kesun.dao.DaoSupport;
import kesun.dao.web.INotice;
import org.springframework.stereotype.Repository;

/**
 * Created by heying on 2017/10/29.
 */
@Repository("dDiscount")
public class DDiscount extends DaoSupport implements INotice {
    public DDiscount() {
        setMapperName("mapper.DiscountMapper");
    }
    public Boolean objectInUse(String id)
    {
        return false;
    }
}
