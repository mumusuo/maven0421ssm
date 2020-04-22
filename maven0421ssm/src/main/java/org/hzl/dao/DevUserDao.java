package org.hzl.dao;


import org.hzl.pojo.DevUser;

public interface DevUserDao {
    public DevUser findByCode(String devCode);
}
