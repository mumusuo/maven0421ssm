package org.hzl.service.developer;

import org.hzl.pojo.DataDictionary;

import java.util.List;

public interface AppSearchlService {
    List<DataDictionary> appStatus();
    List<DataDictionary> appFlatform();
}
