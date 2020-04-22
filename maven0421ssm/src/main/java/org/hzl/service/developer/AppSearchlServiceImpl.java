package org.hzl.service.developer;

import org.hzl.dao.AppSearchlDao;
import org.hzl.pojo.DataDictionary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class AppSearchlServiceImpl implements AppSearchlService {
    @Resource
    private AppSearchlDao appSearchlDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<DataDictionary> appStatus() {
        return appSearchlDao.appStatus();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<DataDictionary> appFlatform() {
        return appSearchlDao.appFlatform();
    }
}
