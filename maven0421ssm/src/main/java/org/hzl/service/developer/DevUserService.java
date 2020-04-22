package org.hzl.service.developer;

import org.hzl.pojo.DevUser;

public interface DevUserService {
    public DevUser findByCode(String devCode);
}
