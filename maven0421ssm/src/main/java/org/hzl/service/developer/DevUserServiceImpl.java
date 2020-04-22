package org.hzl.service.developer;

import org.hzl.dao.DevUserDao;
import org.hzl.pojo.DevUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class DevUserServiceImpl implements DevUserService {
    @Resource
    private DevUserDao devUserDao;
    @Override
    public DevUser findByCode(String devCode) {
        return devUserDao.findByCode(devCode);
    }
}
