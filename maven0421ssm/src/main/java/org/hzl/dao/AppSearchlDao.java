package org.hzl.dao;





import org.hzl.pojo.DataDictionary;

import java.util.List;

public interface AppSearchlDao {
    List<DataDictionary> appStatus();
    List<DataDictionary> appFlatform();
}
