package buct.qianqianjun.create.dao;

import buct.qianqianjun.create.domain.TC;
import org.springframework.stereotype.Repository;

@Repository
public interface TCDao {
    TC getTCByTAddress(String tAddress);
    void addTC(TC tc);
    void deleteByTAddress(String tAddress);
    void fixByTC(TC tc);
}