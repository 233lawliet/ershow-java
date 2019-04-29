package javamapper;

import bean.Collect;

public interface CollectMapper {
    int insert(Collect record);

    int insertSelective(Collect record);
}