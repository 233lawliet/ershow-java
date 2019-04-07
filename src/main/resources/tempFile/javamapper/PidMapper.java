package javamapper;

import bean.Pid;

public interface PidMapper {
    int insert(Pid record);

    int insertSelective(Pid record);
}